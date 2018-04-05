package game.keyword;

import base.GameObject;
import base.GameObjectManager;
import base.Vector2D;
import physic.BoxCollider;
import physic.HitObject;
import renderer.ImageRenderer;
import physic.PhysicBody;
import Utils.Utils;

public class Keyword extends GameObject {
    public Vector2D velocity;
    private BottomRightObject bottomRightObject;
    private BottomLelfObject bottomLelfObject;
    private TopRightObject topRightObject;
    private TopLelfObject topLelfObject;

    public Keyword(){
        this.renderer = new ImageRenderer("resource/K.png");
        this.velocity = new Vector2D();
        this.bottomLelfObject = new BottomLelfObject();
        this.bottomRightObject = new BottomRightObject();
        this.topLelfObject = new TopLelfObject();
        this.topRightObject = new TopRightObject();
    }

    @Override
    public void run(){
        super.run();
        this.position.addUp(this.velocity);
        this.bottomRightObject.position.set(this.position.x+15,this.position.y-15);
        this.bottomLelfObject.position.set(this.position.x+15,this.position.y-15);
        this.topRightObject.position.set(this.position.x-15,this.position.y+15);
        this.topLelfObject.position.set(this.position.x-15,this.position.y+15);

    }

}
