/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game;

/**
 *
 * @author Macintosh
 */
public class StartState extends GameState{
    public StartState(GameStateManager gsm){
        super(gsm);
        init();
    }
    
    public void init(){}
    public void update(float dt){
        System.out.println("START STATE UPDATING");
    }
    public void draw(){
        System.out.println("START STATE DRAWING");
    }
    public void handleInput(){}
    public void dispose(){}
}
