package com.codeup.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //Step 1 Annotate
public class RollDiceController {

    @GetMapping("/roll-dice") //Step 2 what url want to respond to
    public String showPage() {
        return "roll-dice"; //name of the file
    }

    @GetMapping("/roll-dice/{n}") // needs to grab number from user
    public String random(@PathVariable Integer n, Model viewModel){
        int genNumber = (int)(Math.random() * 6 + 1); //Must CAST double to INT

        viewModel.addAttribute("genNumber", genNumber);
        viewModel.addAttribute("userNumber", n);
//        int genNumber = (int) Math.floor((Math.random() * 6) - 1);
        return "roll-dice";
    }


}
