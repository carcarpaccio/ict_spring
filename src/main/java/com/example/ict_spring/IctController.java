package com.example.ict_spring;
import com.example.ict_spring.model.IctService;
import org.springframework.beans.factory.annotation.Autowired;
import  org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class IctController {
    @Autowired
    private IctService service;

    @Autowired
    private HttpSession httpSession;

    @GetMapping("Kari")
    public String get(Model model){
        String dep="chitose";
        String time="09:00:00";

        service.leave_findAll(time,dep);
        return "kakkokari";
    }

    @PostMapping("Kari")
    public String post(/*String time,String stand,*/Model model){
        return "kakkokari";
    }


    @GetMapping("Karikari")
    public String get2(Model model){
        //String dep=(String) httpSession.getAttribute("dep");
        //String time=(String) httpSession.getAttribute("time");
        String dep="chitose";
        String time="09:00:00";

        service.leave_findAll(time,dep);
        return "kakkokarikari";
    }
}
