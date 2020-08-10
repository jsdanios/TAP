package com.tts.PizzaApp.service;

import java.util.List;

import com.tts.PizzaApp.model.Pizza;
import com.tts.PizzaApp.model.PizzaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PizzaService {
    @Autowired
    private PizzaRepository pizzaRepository;

    @Autowired
    public PizzaService(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    public List<Pizza> findAll() {
        List<Pizza> pizzaList = (List<Pizza>) pizzaRepository.findAll();
        return pizzaList;
    }

    public void save(Pizza pizza) {
        pizzaRepository.save(pizza);
    }
    
}