package com.choinhet.televisionproductionline.controller;

import com.choinhet.televisionproductionline.model.Television;
import com.choinhet.televisionproductionline.service.BaseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class BaseController {

    private final BaseService baseService;

    public BaseController(BaseService baseService) {
        this.baseService = baseService;
    }

    @GetMapping("/televisions")
    public String getTelevisions(Model model) {
        List<Television> televisions = baseService.findAll();
        model.addAttribute("televisions", televisions);
        return "televisions";
    }

    @GetMapping("/new/television")
    public String newTelevision(Model model) {
        model.addAttribute("television", new Television());
        return "new-television";
    }

    @PostMapping("save/television")
    public String saveTelevision(@Valid @ModelAttribute("television") Television television, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "new-television";
        }
        baseService.save(television);
        return "redirect:/televisions";
    }
}
