package com.example.restrat;

import com.example.restrat.model.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private Service service;

    @Autowired
    private HttpSession httpSession;

    @GetMapping("index")
    public String get(Model model){
        return "index.html";
    }


    @GetMapping("timetable")
    public String get2(Model model){
        System.out.println("g2");
        service.leave_findAll("10:00:00","chitose");
        return "timetable.html";
    }
    @PostMapping("timetable")
    public String post2(Model model){
        System.out.println("p2");
        return "timetable.html";
    }
}
