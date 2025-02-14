package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
	protected OrthographicCamera camera;
	protected SpriteBatch batch;
    BitmapFont font;
    
    private GameStateManager gsm;

    @Override
    public void create() {
    	
       batch = new SpriteBatch();
       gsm = new GameStateManager();
       
       Gdx.input.setInputProcessor(
    		   new GameInputProcessor()
        );
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(0, 1, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        camera = new OrthographicCamera();
    	camera.setToOrtho(false, 1000, 500);
        batch.begin();

        gsm.update(Gdx.graphics.getDeltaTime());
        gsm.draw();
        
        GameKeys.update();
        
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
    }
}
