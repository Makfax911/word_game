package com.example.word_games.controller;

import com.example.word_games.word_game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("word_game")
public class game_controller {

   @Autowired
    private com.example.word_games.model model;

   @PostMapping
    public word_game new_word_game(@RequestBody word_game json ){
       return model.response(json);
   }
}
