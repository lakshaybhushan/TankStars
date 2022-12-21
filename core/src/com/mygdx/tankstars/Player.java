//package com.mygdx.tankstars;
//
//import com.badlogic.gdx.graphics.g2d.Sprite;
//import com.badlogic.gdx.graphics.g2d.SpriteBatch;
//import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;
//import com.badlogic.gdx.math.Vector2;
//import com.badlogic.gdx.Input.Keys;
//
//public class Player extends Sprite {
//    private Vector2 velocity = new Vector2();
//    private float speed = 60*2, gravity = 60 *0.1f;
//    private TiledMapTileLayer collisionLayer;
//    public Player(Sprite sprite, TiledMapTileLayer collisionLayer){
//        super(sprite);
//        this.collisionLayer = collisionLayer;
//    }
//
//    @Override
//    public void draw(SpriteBatch sb){
//        update(Gdx.graphics.getDeltaTime());
//        super.draw(sb);
//    }
//
//    public TiledMapTileLayer getCollisionLayer(){
//        return collisionLayer;
//    }
//
//    public void setCollisionLayer(TiledMapTileLayer collisionLayer){
//        this.collisionLayer = collisionLayer;
//    }
//
//    public boolean keyDown(int keycode){
//        switch(keycode){
//            case Keys.W:
//                break;
//            case Keys.A:
//                velocity.x = speed
//
//        }
//    }
//
//}
