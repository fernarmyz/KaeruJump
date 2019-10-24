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
public class PlayState extends GameState{
    
    public PlayState(GameStateManager gsm){
        super(gsm);
        init();
    }
    
    public void init(){}
    public void update(float dt){
        System.out.println("PLAY STATE UPDATING");
    }
    public void draw(){
        System.out.println("PLAY STATE DRAWING");
    }
    public void handleInput(){}
    public void dispose(){}
}
