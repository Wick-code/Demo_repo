package com.example.spring;

public class DragonSlayerKnight {

    Quest quest;

    public DragonSlayerKnight(){
        quest = new DragonSlayerQuest();
    }

    public void embarkOnQuest(){
        quest.embark();
    }

}
