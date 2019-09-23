package com.example.spring.implementation;

import com.example.spring.service.Knight;
import com.example.spring.service.Quest;

public class BraveKnight implements Knight {
    Quest quest;

    public BraveKnight(Quest quest){
        this.quest = quest;
    }

    public void embarkOnQuest(){
        quest.embark();
    }
}
