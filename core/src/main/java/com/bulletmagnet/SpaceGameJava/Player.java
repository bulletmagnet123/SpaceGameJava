package com.bulletmagnet.SpaceGameJava;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Player {

    Texture img = new Texture("Ship.png");
    public Vector2 position;
    public Sprite sprite;
    public float speed = 500;

    public Player() {

    }

    {
        sprite = new Sprite(img);
        position = new Vector2(Gdx.graphics.getWidth()/2f,sprite.getScaleY()*sprite.getHeight()/2);
        sprite.setScale(4);
    }
    public void Update(float deltaTime){
        if (Gdx.input.isKeyPressed(Input.Keys.A)) position.x-=deltaTime*speed;
        if (Gdx.input.isKeyPressed(Input.Keys.D)) position.x+=deltaTime*speed;
        if (Gdx.input.isKeyPressed(Input.Keys.W)) position.y+=deltaTime*speed;
        if (Gdx.input.isKeyPressed(Input.Keys.S)) position.y-=deltaTime*speed;

        if (Gdx.input.isKeyPressed(Input.Keys.A)) sprite.setRotation(90f);
        if (Gdx.input.isKeyPressed(Input.Keys.D)) sprite.setRotation(270f);
        if (Gdx.input.isKeyPressed(Input.Keys.W)) sprite.setRotation(0f);
        if (Gdx.input.isKeyPressed(Input.Keys.S)) sprite.setRotation(180f);

    }

    public void Draw(SpriteBatch batch)
    {
        Update(Gdx.graphics.getDeltaTime());
        sprite.setPosition(position.x, position.y);
        sprite.draw(batch);

    }

}
