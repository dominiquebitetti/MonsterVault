package com.dommorgb.monstervault.controller;

import com.dommorgb.monstervault.entity.MonsterDrink;
import com.dommorgb.monstervault.repository.MonsterDrinkRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/drinks")
public class MonsterDrinkController {

    private final MonsterDrinkRepository monsterDrinkRepository;

    public MonsterDrinkController(MonsterDrinkRepository monsterDrinkRepository) {
        this.monsterDrinkRepository = monsterDrinkRepository;
    }

    @GetMapping
    public List<MonsterDrink> getAllDrinks() {
        return monsterDrinkRepository.findAll();
    }

    @PostMapping
    public MonsterDrink createDrink(@RequestBody MonsterDrink monsterDrink) {
        return monsterDrinkRepository.save(monsterDrink);
    }
}