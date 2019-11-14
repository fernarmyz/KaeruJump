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
public class GameOverState extends GameState{
    public GameOverState(GameStateManager gsm){
        super(gsm);
        init();
    }
    
    public void init(){}
    public void update(float dt){
        System.out.println("GAMEOVER STATE UPDATING");
    }
    public void draw(){
        System.out.println("GAMEOVER STATE DRAWING");
    }
    public void handleInput(){}
    public void dispose(){}

	@Override
	public void render() {
		// TODO Auto-generated method stub
		
	}
}
