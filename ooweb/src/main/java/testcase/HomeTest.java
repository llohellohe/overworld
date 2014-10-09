/*
 * Copyright 1999-2010 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package testcase;

import o2.web.mvc.HomeController;
import org.junit.Test;

import java.util.HashMap;


/**
 */
public class HomeTest {


    @Test
    public void testShowHomePage() throws InterruptedException {
        HomeController c = new HomeController();
        c.showHomePage(new HashMap<String, Object>());

        Thread.sleep(Long.MAX_VALUE);
        System.out.println(System.currentTimeMillis());
    }
}
