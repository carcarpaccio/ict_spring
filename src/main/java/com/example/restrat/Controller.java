package com.example.restrat;

import com.example.restrat.model.Service;
import com.example.restrat.model.TimeTableModel.Dir;
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
        System.out.println(time);
        service.setDir(Dir.getEnum(dir));
        service.findAll(time,sta);
        if(service.getDir()==Dir.dep){
            model.addAttribute("atimetable",service.getlTimeTables());
        }
        else if(service.getDir()==Dir.arr){
            model.addAttribute("atimetable",service.getaTimeTables());
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
        return "uploadFile.html";
    }

    @PostMapping("uploadFile")
    public String post3(Model model,String stand,String leave,String arrive){
        service.createTable(stand,leave,arrive);
        return "uploaded.html";
    }
}
