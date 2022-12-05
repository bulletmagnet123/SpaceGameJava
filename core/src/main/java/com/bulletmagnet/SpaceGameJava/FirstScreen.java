package com.bulletmagnet.SpaceGameJava;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.Viewport;

/** First screen of the application. Displayed after the application is created. */
public class FirstScreen extends ApplicationAdapter implements Screen {

	SpriteBatch batch;
	Player player;
	Texture backgroundImg = new Texture("Background.png");
	Sprite background = new Sprite(backgroundImg);
	private OrthographicCamera camera;






	@Override
	public void create() {



	}


	@Override
	public void show() {
		batch = new SpriteBatch();
		player = new Player();
	}

	@Override
	public void render(float delta) {
		ScreenUtils.clear(0,0,0,1);
		camera = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		camera.position.set(player.sprite.getX(), player.sprite.getY(), 0);
		camera.update();
		batch.begin();
		batch.setProjectionMatrix(camera.combined);
		background.draw(batch);
		player.Draw(batch);
		batch.end();
		super.render();
	}

	@Override
	public void resize(int width, int height) {
		// Resize your screen here. The parameters represent the new window size.
	}

	@Override
	public void pause() {
		// Invoked when your application is paused.
	}

	@Override
	public void resume() {
		// Invoked when your application is resumed after pause.
	}

	@Override
	public void hide() {
		// This method is called when another screen replaces this one.
	}

	@Override
	public void dispose() {
		// Destroy screen's assets here.
		batch.dispose();

	}
}