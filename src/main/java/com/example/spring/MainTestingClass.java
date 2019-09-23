package com.example.spring;

public class MainTestingClass {

    public static void main(String[] args){
        Knight knight = new Knight(new DragonSlayerQuest());
        knight.embark();
    }
}
