package com.mygdx.game;

import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.*;
import com.badlogic.gdx.physics.box2d.BodyDef.BodyType;
import com.badlogic.gdx.physics.box2d.World;

public class PlayState extends GameState{
	
	private World world;
	private Box2DDebugRenderer b2dr;

	public PlayState(GameStateManager gsm) {
		super(gsm);
		
		world = new World(new Vector2(0, -9.81f), true);
		b2dr = new Box2DDebugRenderer();
		
		//create platform
		BodyDef bdef = new BodyDef();
		bdef.position.set(160,120);
		bdef.type = BodyType.StaticBody;
		Body body = world.createBody(bdef);
		
		PolygonShape shape = new PolygonShape();
		shape.setAsBox(50, 5);
		
		FixtureDef fdef = new FixtureDef();
		fdef.shape = shape;
		body.createFixture(fdef);
		
		
		//static body - don't move, unaffected
		
		//kinematic body - don't get affected 
		
		//dynamic body - always get affected
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(float dt) {
		world.step(dt, 6, 2);
		System.out.println("PLAY STATE UPDATING");
		
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("PLAY STATE DRAWING");
		
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
		b2dr.render(world, cam.combined);
		
	}

}
