package com.dommorgb.monstervault.service;

import com.dommorgb.monstervault.entity.MonsterDrink;
import com.dommorgb.monstervault.repository.MonsterDrinkRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonsterDrinkService {

    private final MonsterDrinkRepository monsterDrinkRepository;

    public MonsterDrinkService(MonsterDrinkRepository monsterDrinkRepository) {
        this.monsterDrinkRepository = monsterDrinkRepository;
    }

    public List<MonsterDrink> getAllDrinks() {
        return monsterDrinkRepository.findAll();
    }

    public MonsterDrink createDrink(MonsterDrink monsterDrink) {

        if (monsterDrink.getType() != null
                && monsterDrink.getType().equalsIgnoreCase("Ultra")) {

            monsterDrink.setSugarFree(true);
        }

        return monsterDrinkRepository.save(monsterDrink);
    }
}