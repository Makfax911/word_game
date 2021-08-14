package com.example.word_games;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@ContextConfiguration(classes = {model.class})
@ExtendWith(SpringExtension.class)
class modelTest {

    @Autowired
    private model model;

    @Test
    public void test_response0(){
        List<String> input=new ArrayList<>(Arrays.asList("fish","horse","egg","goose","eagle"));
        List<String> output=new ArrayList<>(Arrays.asList("fish","horse","egg","goose","eagle"));
        word_game word_game=new word_game();
        word_game res=new word_game();
        word_game.getWord_game().addAll(input);
        res.getWord_game().addAll(output);
        assertEquals(res.getWord_game(),model.response(word_game).getWord_game());
    }
    @Test
    public void test_response1(){
        List<String> input=new ArrayList<>(Arrays.asList("fish","horse","snake","goose","eagle"));
        List<String> output=new ArrayList<>(Arrays.asList("fish","horse"));
        word_game word_game=new word_game();
        word_game res=new word_game();
        word_game.getWord_game().addAll(input);
        res.getWord_game().addAll(output);
        assertEquals(res.getWord_game(),model.response(word_game).getWord_game());
    }
    @Test
    public void test_response2(){
        List<String> input=new ArrayList<>(Arrays.asList("fish","horse","","goose","eagle"));
        List<String> output=new ArrayList<>(Arrays.asList("fish","horse"));
        word_game word_game=new word_game();
        word_game res=new word_game();
        word_game.getWord_game().addAll(input);
        res.getWord_game().addAll(output);
        assertEquals(res.getWord_game(),model.response(word_game).getWord_game());
    }
    @Test
    public void test_response3(){
        List<String> input=new ArrayList<>(Arrays.asList("","horse","","goose","eagle"));
        word_game word_game=new word_game();
        word_game res=new word_game();
        word_game.getWord_game().addAll(input);
        assertEquals(res.getWord_game(),model.response(word_game).getWord_game());
    }
}