package com.dictionaryapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/word")
public class WordController {

    @GetMapping("/add")
    public ModelAndView add() {
        return new ModelAndView("word-add");
    }

}
