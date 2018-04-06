package game.keyword;

import base.GameObject;
import base.GameObjectManager;
import base.Vector2D;
import game.Player.Player;
import game.Player.PlayerRightHand;
import physic.BoxCollider;
import physic.HitObject;
import physic.PhysicBody;
import physic.RunHitObject;

public class BottomLelfObject extends GameObject implements PhysicBody, HitObject {

    public Vector2D velocity;
    private BoxCollider boxCollider;
    private RunHitObject runHitObject;
    private boolean hitBottomLelfObject;

    public BottomLelfObject(){
        this.velocity = new Vector2D();
        this.boxCollider = new BoxCollider(30,30);
        this.runHitObject = new RunHitObject(PlayerRightHand.class);
    }

    @Override
    public void run(){
        this.runHitObject.run(this);
    }

    @Override
    public void getHit(GameObject gameObject) {
        hitBottomLelfObject = true;
        this.velocity.set(1,-1);
    }

    @Override
    public BoxCollider getBoxCollider() {
        return this.boxCollider;
    }
}
