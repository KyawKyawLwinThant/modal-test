package com.example.demo2navtest.controller;


import com.example.demo2navtest.ds.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {


    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("student",new Student());
        return "page1";
    }
    @RequestMapping("/save-student")
    public String saveStudent(Student student, @RequestBody String  id){
        String[] testid=id.split("=");
        System.out.println(student);
        System.out.println(testid[1]);
        return "page2";
    }

}
