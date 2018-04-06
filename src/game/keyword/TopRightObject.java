package game.keyword;

import base.GameObject;
import base.Vector2D;
import game.Player.Player;
import game.Player.PlayerLelfHand;
import physic.BoxCollider;
import physic.HitObject;
import physic.PhysicBody;
import physic.RunHitObject;

import java.util.Random;

public class TopRightObject extends GameObject implements HitObject, PhysicBody {

    private Vector2D velocity;
    private BoxCollider boxCollider;
    private RunHitObject runHitObject;
    private boolean hitTopRightObject;

    public TopRightObject(){
        this.velocity = new Vector2D();
        this.boxCollider = new BoxCollider(30,30);
        this.runHitObject = new RunHitObject(PlayerLelfHand.class);
    }

    @Override
    public void run(){
        this.runHitObject.run(this);
    }

    @Override
    public void getHit(GameObject gameObject) {
        hitTopRightObject = true;
        this.velocity.set(-1,1);
    }

    @Override
    public BoxCollider getBoxCollider() {
        return this.boxCollider;
    }
}
