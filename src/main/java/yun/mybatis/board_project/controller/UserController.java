package yun.mybatis.board_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import yun.mybatis.board_project.service.UserService;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(value = {"/login"})
    public String login(){
        return "login";
    }

    @GetMapping(value = {"/join"})
    public String join(){
        return "join";
    }

    @GetMapping(value = {"/login"})
    public String userLogin(){
        return "join";
    }

    @GetMapping(value = {"/join"})
    public String userJoin(){
        return "login";
    }

}
