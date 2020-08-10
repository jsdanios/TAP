package com.tts.PizzaApp.controller;

import java.util.List;

import com.tts.PizzaApp.model.Pizza;
import com.tts.PizzaApp.service.PizzaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PizzaController {
    @Autowired
    private PizzaService pizzaService;

    @GetMapping(value = {"/"})
    public String getIndex(Model model) {
        List<Pizza> pizzaList = pizzaService.findAll();
        model.addAttribute("pizzaList", pizzaList);
        return "index";
    }

    @GetMapping(value = {"/pizza"})
    public String getPizza(Model model) {
        List<Pizza> pizzaList = pizzaService.findAll();
        model.addAttribute("pizzaList", pizzaList);
        return "pizza";
    }

    @GetMapping(value = {"/pizzaForm"})
    public String getPizzaForm(Model model) {
        model.addAttribute("pizza", new Pizza());
        return "pizzaForm";
    }

    @PostMapping(value = "/pizza")
    public String postPizza(Pizza pizza, Model model) {
        pizzaService.save(pizza);
        model.addAttribute("pizza", new Pizza());
        return "pizzaForm";
    }
}