package Cucumber_Test_draft.cucumber_test_draft.impl;

import junit.framework.TestCase;
import Cucumber_Test_draft.cucumber_test_draft.Bean;

public class BeanImplTest extends TestCase {

    public void testBeanIsABean() {
	Bean aBean = new BeanImpl();
        assertTrue(aBean.isABean());
    }

}