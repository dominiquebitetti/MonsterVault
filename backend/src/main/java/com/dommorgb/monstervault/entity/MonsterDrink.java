package com.dommorgb.monstervault.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class MonsterDrink {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name; 
    private String type; //ultra, normal, tea, alcol, stuff
    private Integer caffeineMg;
    private Integer caloriesKcal;
    private Boolean sugarFree; //should be already true if it's an ultra version by default
    private Integer rating;
}

