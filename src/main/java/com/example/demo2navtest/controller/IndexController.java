package com.example.demo2navtest.controller;


import com.example.demo2navtest.ds.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {


    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("student",new Student());
        return "page1";
    }
    @PostMapping("/save-student")
    public String saveStudent(Student student){

        System.out.println(student);
        return "page2";
    }

}
