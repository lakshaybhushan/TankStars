package com.mygdx.tankstars;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.graphics.Texture;

public class Tank {
    private Vector3 position;
    private Vector3 velocity;

    private Texture tank;

    public Tank(int x, int y){
        position = new Vector3(x, y, 0);
        velocity = new Vector3(0,0,0);
        tank = new Texture("GreenTankRight.png");
    }
    public void update(float dt){
        velocity.add(0,0,0);
        velocity.scl(dt);
        position.add(velocity.x,0,0);

        velocity.scl(1/dt);
    }
    public Vector3 getPosition(){
        return position;
    }

    public Texture getTank(){
        return tank;
    }

    public void MoveRight(){
        velocity.x = Gdx.graphics.getDeltaTime()*100;
    }
}
