package com.cai;

import junit.framework.TestCase;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.FixedValue;
import org.junit.Test;

/**
 * Created by caiyl on 2017/3/16.
 */
public class SampleClassTest extends TestCase {
    @Test
    public void testFixedValue() throws Exception {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(SampleClass.class);
        enhancer.setCallback(new FixedValue() {
            @Override
            public Object loadObject() throws Exception {
                return "Hello cglib!";
            }
        });
        SampleClass proxy = (SampleClass) enhancer.create(new Class[]{String.class},new String[]{"hello"});
        proxy.test("");
        assertEquals("Hello cglib!", proxy.test(null));
        assertEquals("final", proxy.finalMethod());
    }
}