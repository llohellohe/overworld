/*
 * Copyright 1999-2010 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package o2.web.mvc;

import java.io.UnsupportedEncodingException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public String showStudent(@RequestParam("name")
    String name, Model model) throws UnsupportedEncodingException {

        // name = new String(name.getBytes("iso8859-1"), "utf-8");
        System.out.println("name is " + name);
        model.addAttribute("name", name);

        return "student/show";
    }

}
