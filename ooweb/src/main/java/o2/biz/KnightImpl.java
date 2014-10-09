/*
 * Copyright 1999-2010 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package o2.biz;

import org.springframework.beans.factory.InitializingBean;

/**
 */
public class KnightImpl implements Knight, InitializingBean {

    static Knight instance = new KnightImpl();

    static {
        System.out.println("I am initing");
    }

    public KnightImpl() {
        System.out.println("I am constructing");
    }

    public String embarkOnQuest() {
        System.out.println("hello yangqi");

        return "return string " + System.currentTimeMillis();
    }

    public static Knight instance() {
        return instance;
    }

    public void init() {
        System.out.println("I AM INIT METHOD");
    }

    public void destory() {
        System.out.println("I AM DESTORY METHOD");
    }

    /*
     * (non-Javadoc)
     * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");

    }
}
