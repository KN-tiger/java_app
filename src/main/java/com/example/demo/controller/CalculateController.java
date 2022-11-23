package com.example.demo.controller;

import com.example.demo.model.FDat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class CalculateController {
    @GetMapping("/input")
    public String input(Model model){
        model.addAttribute("fdat",new FDat());
        return "tmp_input";
    }
}
