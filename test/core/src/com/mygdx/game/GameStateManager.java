package com.mygdx.game;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Macintosh
 */
public class GameStateManager {
    private GameState gameState; //current game
    
    public static final int START = 0;
    public static final int PLAY = 1;
    public static final int TUTORIAL = 2;
    public static final int GAMEOVER = 3;
    
    
    
    public GameStateManager(){
        setState(PLAY);
    }
    
    public void setState(int state){
        if (gameState != null) {gameState.dispose();}
        if(state == START){
            //switch to start state
            gameState = new StartState(this);
        }
        if(state == PLAY){
            //switch to play state
            gameState = new PlayState(this);
        }
        if(state == TUTORIAL){
            //switch to tutorial state
             
        }
        if(state == GAMEOVER){
            //switch to gameover state
            gameState = new GameOverState(this);
        }
    }
    
    public void update(float dt){
        gameState.update(dt);
    }
    
    public void draw(){
        gameState.draw();
    }
}
