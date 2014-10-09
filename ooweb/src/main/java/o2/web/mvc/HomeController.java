/*
 * Copyright 1999-2010 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package o2.web.mvc;

import java.util.Map;

import o2.biz.KnightImpl;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 类HomeController.java的实现描述：TODO 类实现描述
 * 
 * @author yangqi 2013-5-8 下午8:29:40
 */
@Controller
@ManagedResource(objectName = "o2.web:name=HomeController")
public class HomeController {

    private int count = 10;
    @RequestMapping({ "/", "/home" })
    public String showHomePage(Map<String, Object> model) {

        model.put("spittles", "made in China");

        model.put("knight", new KnightImpl());

        model.put("count", count);

        System.out.println(model);

        return "home";

    }

    @ManagedAttribute
    public int getCount() {
        return count;
    }

    @ManagedAttribute
    public void setCount(int count) {
        this.count = count;
    }


}
