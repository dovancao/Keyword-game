package game.keyword;

import base.GameObject;
import base.Vector2D;
import game.Player.Player;
import physic.BoxCollider;
import physic.HitObject;
import physic.PhysicBody;
import physic.RunHitObject;

public class BottomRightObject extends GameObject implements HitObject, PhysicBody {
    private Vector2D velocity;
    private BoxCollider boxCollider = new BoxCollider(30,30);
    private RunHitObject runHitObject;
    private boolean hitBottomRightObject;

    public BottomRightObject(){
        this.velocity = new Vector2D();
        this.runHitObject = new RunHitObject(Player.class);
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
