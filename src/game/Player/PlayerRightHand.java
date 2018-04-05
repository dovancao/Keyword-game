package game.Player;

import base.GameObject;
import physic.BoxCollider;
import physic.HitObject;
import physic.PhysicBody;

public class PlayerRightHand extends GameObject implements HitObject, PhysicBody {
    private BoxCollider boxCollider = new BoxCollider(15,15);

    public PlayerRightHand(){
    }

    @Override
    public void getHit(GameObject gameObject) {

    }

    @Override
    public BoxCollider getBoxCollider() {
        return this.boxCollider;
    }
}
