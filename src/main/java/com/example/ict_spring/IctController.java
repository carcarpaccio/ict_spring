package com.example.ict_spring;
import com.example.ict_spring.model.IctService;
import org.springframework.beans.factory.annotation.Autowired;
import  org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IctController {
    @Autowired
    private IctService service;

    @GetMapping("Kari")
    public String get(Model model){
        //model.addAttribute("chitose",service.findAll("02:00:00","1").toString());
        System.out.println(service.leave_findAll("07:00:00"));
        return "kakkokari";
    }

    @PostMapping("Kari")
    public String post(/*String time,String stand,*/Model model){
        return "kakkokari";
    }
    @GetMapping("Karikari")
    public String get2(Model model){
        return "kakkokarikari";
    }
}
