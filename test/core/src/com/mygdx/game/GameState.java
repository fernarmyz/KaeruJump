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
public abstract class GameState {
    protected GameStateManager gsm;
    protected GameState(GameStateManager gsm){
        this.gsm = gsm;
    }
    public abstract void init();
    public abstract void update(float dt);
    public abstract void draw();
    public abstract void handleInput();
    public abstract void dispose();
}
