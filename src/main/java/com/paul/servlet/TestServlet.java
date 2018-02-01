package com.paul.servlet;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 1/21/2018
 * Time: 2:24 PM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
/*@WebServlet(urlPatterns = "/test2")*/
public class TestServlet  extends HttpServlet{

    //重写get方法
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //super.doGet(req, resp);
        //设置返回类型为json
        response.setContentType("application/json");
        //设置返回字符集
        response.setCharacterEncoding("utf-8");
        //输出对象
        PrintWriter writer = response.getWriter();
        //输出error消息
        writer.write("TestServlet内doGet方法成功！");
        writer.close();
    }
}
