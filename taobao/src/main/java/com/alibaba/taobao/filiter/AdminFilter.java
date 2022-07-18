package com.alibaba.taobao.filiter;

import com.alibaba.taobao.Dao.User;
import com.alibaba.taobao.common.Constant;
import com.alibaba.taobao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class AdminFilter implements Filter {

    @Autowired
    UserService userService;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpSession session = req.getSession();
        User currentUser = (User) session.getAttribute(Constant.IMOOC_MALL_USER);
        if (currentUser == null){
            PrintWriter out = new HttpServletResponseWrapper((HttpServletResponse)response).getWriter();
            out.write("{\n" +
                    "    \"status\": 10005,\n" +
                    "    \"msg\": \"\"LOGIN FIRST\"\",\n" +
                    "    \"data\": null\n" +
                    "}");
            out.flush();
            out.close();
            return;
        }
        boolean adminRole = userService.checkAdminRole(currentUser);
        if (adminRole){
            chain.doFilter(request,response);
        }else {
            PrintWriter out = new HttpServletResponseWrapper((HttpServletResponse)response).getWriter();
            out.write("{\n" +
                    "    \"status\": 10007,\n" +
                    "    \"msg\": \"\"YOU ARE NOT ADMIN\"\",\n" +
                    "    \"data\": null\n" +
                    "}");
            out.flush();
            out.close();
            return;
        }
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
