package com.example.spring.test;

import com.example.spring.implementation.BraveKnight;
import com.example.spring.service.Knight;
import com.example.spring.service.Quest;
import org.junit.Test;
import org.mockito.Mockito;

public class BraveKnightTest {

    @Test
    public void testBraveKnight(){
        Quest mockQuest = Mockito.mock(Quest.class);
        Knight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        Mockito.verify(mockQuest, Mockito.times(1)).embark();
    }
}
