package com.example.spring;

import com.example.spring.implementation.BraveKnight;
import com.example.spring.implementation.DragonSlayerQuest;
import com.example.spring.service.Knight;

public class MainTestingClass {

    public static void main(String[] args){
        Knight knight = new BraveKnight(new DragonSlayerQuest());
        knight.embarkOnQuest();
    }
}
