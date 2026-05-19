package com.dommorgb.monstervault.controller;

import com.dommorgb.monstervault.entity.MonsterDrink;
import com.dommorgb.monstervault.service.MonsterDrinkService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/drinks")
public class MonsterDrinkController {

    private final MonsterDrinkService monsterDrinkService;

    public MonsterDrinkController(MonsterDrinkService monsterDrinkService) {
        this.monsterDrinkService = monsterDrinkService;
    }

    @GetMapping
    public List<MonsterDrink> getAllDrinks() {
        return monsterDrinkService.getAllDrinks();
    }

    @PostMapping
    public MonsterDrink createDrink(@RequestBody MonsterDrink monsterDrink) {
        return monsterDrinkService.createDrink(monsterDrink);
    }
}