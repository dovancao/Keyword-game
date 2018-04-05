package game.Player;

import base.GameObject;
import base.Vector2D;
import game.keyword.BottomLelfObject;
import physic.BoxCollider;
import physic.HitObject;
import physic.PhysicBody;

public class PlayerLelfHand extends GameObject implements HitObject, PhysicBody {
    public Vector2D velocity;
    private BoxCollider boxCollider = new BoxCollider(15,15);

    public PlayerLelfHand(){
    }

    @Override
    public void getHit(GameObject gameObject) {

    }

    @Override
    public BoxCollider getBoxCollider() {
        return this.boxCollider;
    }
}
