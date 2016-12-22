package com.zhengqy.action;


import com.zhengqy.model.Guser;
import com.zhengqy.service.UserService;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by zheng on 2016/12/22.
 */
public class UserController implements Controller{
    private UserService userService;

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String mobile = request.getParameter("mobile");
        String realname = request.getParameter("realname");
        String email = request.getParameter("email");
        Guser guser = new Guser();
        guser.setUsername(username);
        guser.setPassword(password);
        guser.setRealname(realname);
        guser.setEmail(email);
        guser.setMobile(mobile);
        boolean flag = userService.add(guser);
        if (flag){
            modelAndView.setViewName("index");
        }
        return modelAndView;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
