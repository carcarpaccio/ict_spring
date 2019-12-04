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

    @GetMapping("Kari")
    public String get(Model model){
        return "kakkokari";
    }

    @PostMapping("Kari")
    public String post(/*String time,String dep,*/Model model){
        return "kakkokarikarikari";
    }


    @GetMapping("Karikari")
    public String get2(Model model){
        return "kakkokarikari";
    }
}
