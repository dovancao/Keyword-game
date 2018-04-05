package game.keyword;

import base.GameObject;
import base.Vector2D;
import game.Player.Player;
import physic.BoxCollider;
import physic.HitObject;
import physic.PhysicBody;
import physic.RunHitObject;

public class TopLelfObject extends GameObject implements HitObject, PhysicBody {

    private Vector2D velocity;
    private BoxCollider boxCollider;
    private RunHitObject runHitObject;
    private boolean hitTopLelfObject;

    public TopLelfObject(){
        this.velocity = new Vector2D();
        this.boxCollider = new BoxCollider(30,30);
        this.runHitObject = new RunHitObject(Player.class);
    }

    @Override
    public BoxCollider getBoxCollider() {
        return this.boxCollider;
    }

    @Override
    public void getHit(GameObject gameObject) {
        hitTopLelfObject = true;
    }
}
