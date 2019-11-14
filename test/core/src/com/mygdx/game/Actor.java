package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Actor{
	
	public static final int WIDTH = 800;
    public static final int HEIGHT = 480;
    
    private GameStateManager gsm;
	int x = 0;
    int y = HEIGHT/2;
    
    SpriteBatch batch;
    Texture img;
	
	public void create() {
		img = new Texture(Gdx.files.internal("frog.png"));
		
	}
	
	public void move() {
		if(GameKeys.isPresssed(GameKeys.SPACE)) {
        	y += 300 * Gdx.graphics.getDeltaTime();
        	
        	if(GameKeys.isPresssed(GameKeys.RIGHT)) {
            	x += 300 * Gdx.graphics.getDeltaTime();
            }if(GameKeys.isPresssed(GameKeys.LEFT)) {
            	x -= 300 * Gdx.graphics.getDeltaTime();
            }
        	
        }
        else {
//        	y = 0;
        	
        }
	}
	
	public void render(SpriteBatch batch) {
		this.move();
//        Gdx.gl.glClearColor(0, 0, 0, 0);
//        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//        batch.begin();
        batch.draw(img, x, y);
//        font.draw(batch, "KaeruJunp", 300, 300);
//        batch.end();
//
        
        
       
//        gsm.update(Gdx.graphics.getDeltaTime());
//        gsm.draw();
        
        
        
//        GameKeys.update();
    }
	
	
}
