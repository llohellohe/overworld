/*
 * Copyright 1999-2010 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package o2.web.mvc;

import java.io.UnsupportedEncodingException;

import o2.biz.Knight;
import o2.biz.KnightImpl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/book")
public class BookController {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, headers = { "Accept=application/json" })
    @ResponseBody
    public Knight show(@PathVariable("id")
    int id, Model model) throws UnsupportedEncodingException {

        // name = new String(name.getBytes("iso8859-1"), "utf-8");
        System.out.println("id is " + id);
        model.addAttribute("id", id);

        return new KnightImpl();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id")
    int id, Model model) throws UnsupportedEncodingException {

        // name = new String(name.getBytes("iso8859-1"), "utf-8");
        System.out.println("delte id is " + id);

    }

}
