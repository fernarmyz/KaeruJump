package com.mygdx.game;

import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.*;
import com.badlogic.gdx.physics.box2d.BodyDef.BodyType;
import com.badlogic.gdx.physics.box2d.World;

public class PlayState extends GameState{

	private Actor frog;
	private SpriteBatch batch;
	
	public PlayState(GameStateManager gsm) {
		super(gsm);
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		batch = new SpriteBatch();
		frog = new Actor();
		
		
		//create
		frog.create();
	}

	@Override
	public void update(float dt) {
		//System.out.println("PLAY STATE UPDATING");
		batch.begin();
		frog.render(batch);
		batch.end();
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		//System.out.println("PLAY STATE DRAWING");
		
	}

	@Override
	public void handleInput() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render() {
		
	}

}
