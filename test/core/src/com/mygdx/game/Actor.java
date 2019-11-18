package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Actor{
	
	private float posX = 0;
	private float posY = 1.0f;
	
	private boolean isJump = false;
	private float maxJump;
	private float ground = 1.0f;
	
    private Texture img_1,img_2,img_3;
    private Sprite sprite_1,sprite_2,sprite_3;
	
    private int State = 0;
    private final int STAND = 0;
    private final int JUMP = 1;
    
   public Actor() {
	// TODO Auto-generated constructor stub
	   
   } 
	public void create() {

		
		img_1 = new Texture(Gdx.files.internal("frog.png"));
		sprite_1 = new Sprite(img_1);
		
		img_2 = new Texture(Gdx.files.internal("frogright.png"));
		sprite_2 = new Sprite(img_2);
		
		img_3 = new Texture(Gdx.files.internal("frogleft.png"));
		sprite_3 = new Sprite(img_3);
		
	}
	

		
		
	
	
	public void move() {
//		Jump
		
		if(GameKeys.isPresssed(GameKeys.SPACE) && !isJump && State == STAND) {
//			change jump State
			
			System.out.println("Set");
			if(isJump == false) {
				maxJump = posY + 400;
			}
			
			isJump = true;
			
			this.State = JUMP;
			
			
			
			}
//		Right
		if(GameKeys.isDown(GameKeys.RIGHT)) {
			sprite_2.setPosition(posX, posY);
        	posX += 300 * Gdx.graphics.getDeltaTime();
        	
        }
//		Left
		if(GameKeys.isDown(GameKeys.LEFT)) {
			sprite_3.setPosition(posX, posY);
        	posX -= 300 * Gdx.graphics.getDeltaTime();
        }
        else {
//        	y = 0;
        	
        	
        }
		sprite_1.setPosition(posX, posY);
		
	}
	
	public void jump() {
		
		if(isJump) {
			posY += 500 * Gdx.graphics.getDeltaTime();
			System.out.println("jump");
		}
		if(!isJump && State == JUMP) {
			posY -= 500 * Gdx.graphics.getDeltaTime();
			System.out.println("fall");
		}
		if(posY >= maxJump) {
			isJump = false;
		}
		if(posY <= ground) {
			State = STAND;
		}
		if(posY <= 1.0f) {
			posY = 1.0f;
		}
		System.out.println(posY);
	}
	
	public void render(SpriteBatch batch) {
		
		sprite_1.draw(batch);
		if(GameKeys.isDown(GameKeys.RIGHT)) {
			sprite_2.draw(batch);
        	
        }
		if(GameKeys.isDown(GameKeys.LEFT)) {
			sprite_3.draw(batch);
        	
        }
		
//        Gdx.gl.glClearColor(0, 0, 0, 0);
//        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//        batch.begin();
//        batch.draw(img, x, y);
//        font.draw(batch, "KaeruJunp", 300, 300);
//        batch.end();
		this.move();
		this.jump();
    }
	
	
}
