package com.example.word_games;

import org.springframework.stereotype.Service;

@Service
public class model {

    public word_game response(word_game json){
        word_game word_game=new word_game();
        char first,last;
        if(!json.getWord_game().get(0).isEmpty()){
            word_game.getWord_game().add(json.getWord_game().get(0));
            for (int i=1;i<=json.getWord_game().size()-1;i++){
                if(json.getWord_game().get(i).isEmpty()){
                    break;
                }
                last=json.getWord_game().get(i-1).charAt(json.getWord_game().get(i-1).length()-1);
                first=json.getWord_game().get(i).charAt(0);
                if(last==first){
                    word_game.getWord_game().add(json.getWord_game().get(i));
                }else {
                    break;
                }
            }
        }
        return word_game;
    }
}
