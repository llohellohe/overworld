package o2.web;

import o2.biz.Knight;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;


/*
 * Copyright 1999-2010 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */

/**
 */
public class HsfConsumerServlet implements Servlet {

    /* (non-Javadoc)
     * @see javax.servlet.Servlet#init(javax.servlet.ServletConfig)
     */
    @Override
    public void init(ServletConfig config) throws ServletException {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see javax.servlet.Servlet#getServletConfig()
     */
    @Override
    public ServletConfig getServletConfig() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see javax.servlet.Servlet#service(javax.servlet.ServletRequest, javax.servlet.ServletResponse)
     */
    @Override
    public void service(ServletRequest req, ServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
/*        ApplicationContext context = new ClassPathXmlApplicationContext("spring-hsf-knight-consumer.xml");
        Knight knight = (Knight) context.getBean("knight");
        String result= knight.embarkOnQuest();

        response.setContentType("text/html;charset=utf-8");  
        response.setCharacterEncoding("utf-8");  
        PrintWriter out = response.getWriter();  
        String title="HSF Consumer";
        out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">");  
        out.println("<html xmlns=\"http://www.w3.org/1999/xhtml\">");  
        out.println("<head>");  
        out.println("<meta http-equiv=\"Content-Type\" content=\"text/html;charset=utf-8\" />");  
        out.println("<title>" + title + "</title>");  
        out.println("<body>");  
        out.println("<h1>"+result+"</h1>");
        out.println("</body>");  
        out.println("</html>");  */

    }

    /* (non-Javadoc)
     * @see javax.servlet.Servlet#getServletInfo()
     */
    @Override
    public String getServletInfo() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see javax.servlet.Servlet#destroy()
     */
    @Override
    public void destroy() {
        // TODO Auto-generated method stub

    }

}
