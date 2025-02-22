package com.dataapplab.spring.basic.knight;

public class BraveKnight implements Knight {
    private Quest quest;

    public BraveKnight(Quest quest) {
        // Quest通过构造函数被注入进来
        this.quest = quest;
    }


    public void embarkOnQuest() throws QuestException {
        quest.embark();
    }
}