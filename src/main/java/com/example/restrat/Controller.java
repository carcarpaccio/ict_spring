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

    @GetMapping("index")
    public String get(Model model){
        return "index.html";
    }


    @GetMapping("timetable")
    public String get2(Model model,String sta,String time,String dir){
        System.out.println("g2");

        service.setDir(dir);
        service.findAll(time+":00",sta);
        if(service.getDir().equals("dep")){
            model.addAttribute("atimetable",service.getlTimeTables());
        }
        else if(service.getDir().equals("arr")){
            //model.addAttribute("atimetable",service.getaTimeTables());
        }
        else System.out.println("error");

        return "timetable.html";
    }
    @PostMapping("timetable")
    public String post2(Model model){
        System.out.println("p2");
        return "timetable.html";
    }

    @GetMapping("uploadFile")
    public String get3(Model model){
        return "uploaded";
    }
}
