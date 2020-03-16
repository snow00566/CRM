package cn.hospital.controller;

import cn.hospital.po.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@RestController //声明一个controller。相当于@Controller+@ResponseBody（相当于每个方法上都有） ,所以，本controller里的所有方法，都应该返回json类型数据
@RequestMapping("hello")//全局访问
@EnableAutoConfiguration//启用自动配置（大量的配置文件，如web.xml，的配置已经自动配置好了）
public class Controller {
    @GetMapping("show")//方法访问
    public String test() {

        return "hello springboot1";
    }/*
    @RequestMapping(value = "/user.action")
    public String saveUser() {
        HttpServletRequest request=
        User user=new User();
        user.setSex();
        user.setName();
        user.setAge();
        user.setEmile();
        user.setWhatsApp()
        user.setDiseases();
        user.setPhone();
        user.setChannels();
        user.setCountry();
        user.setWebsite();
        user.setService();
        user.setWatch();
        user.setRecord();
        user.setCommit();
        user.setVisit();
        user.setEffective();
        user.setStar();




        ModelAndView mav=new ModelAndView();
        mav.addObject("itemList",user);
        mav.
    }*/



}
