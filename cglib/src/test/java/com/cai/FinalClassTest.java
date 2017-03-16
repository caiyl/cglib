package com.cai;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.FixedValue;
import org.junit.Test;

/**
 * Created by caiyl on 2017/3/16.
 */
public class FinalClassTest extends TestCase {
    @Test
    public void testFixedValue() throws Exception {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(FinalClass.class);
        enhancer.setCallback(new FixedValue() {
            @Override
            public Object loadObject() throws Exception {
                return "Hello cglib!";
            }
        });

        FinalClass proxy = (FinalClass) enhancer.create();

    }

}