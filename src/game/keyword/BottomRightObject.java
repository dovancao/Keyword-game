package game.keyword;

import base.GameObject;
import base.Vector2D;
import game.Player.Player;
import game.Player.PlayerLelfHand;
import physic.BoxCollider;
import physic.HitObject;
import physic.PhysicBody;
import physic.RunHitObject;

public class BottomRightObject extends GameObject implements HitObject, PhysicBody {
    private Vector2D velocity;
    private BoxCollider boxCollider = new BoxCollider(30,30);
    private RunHitObject runHitObject;
    public boolean hitBottomRightObject = false;

    public BottomRightObject(){
        this.velocity = new Vector2D();
        this.runHitObject = new RunHitObject(PlayerLelfHand.class);
    }

    public Vector2D setBottomRightVelocity(){
        return this.velocity.set(-1,-1);
    }

    @Override
    public void run(){
        this.runHitObject.run(this);
    }

    @Override
    public void getHit(GameObject gameObject) {
        hitBottomRightObject = true;

    }

    @Override
    public BoxCollider getBoxCollider() {
        return this.boxCollider;
    }
}
