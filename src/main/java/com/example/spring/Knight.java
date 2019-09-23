package com.example.spring;

public class Knight {
    Quest quest;

    public Knight(Quest quest){
        this.quest = quest;
    }

    public void embark(){
        quest.embark();
    }

}
