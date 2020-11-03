package com.itheima.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("hello")
public class HelloController {

    @RequestMapping("add")
    @PreAuthorize("hasAuthority('add')") //表示用户必须拥有add权限才能调用当前方法
    public String add() {
        System.out.println("add方法执行了...");
        return null;
    }

    @RequestMapping("update")
    @PreAuthorize("hasRole('ROLE_ADMIN')") //表示用户必须拥有ROLE_ADMIN角色才能调用当前方法
    public String update() {
        System.out.println("update方法执行了...");
        return null;
    }

    @RequestMapping("delete")
    @PreAuthorize("hasRole('ABC')") //表示用户必须拥有ROLE_ABC角色才能调用当前方法
    public String delete() {
        System.out.println("delete方法执行了...");
        return null;
    }
}

