package game.keyword;

import base.GameObject;
import base.GameObjectManager;
import base.Vector2D;
import game.Player.Player;
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
        this.runHitObject = new RunHitObject(Player.class);
    }

    @Override
    public void getHit(GameObject gameObject) {
        hitBottomLelfObject = true;
    }

    @Override
    public BoxCollider getBoxCollider() {
        return this.boxCollider;
    }
}
