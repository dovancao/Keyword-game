package game.Player;

import base.GameObject;
import game.keyword.BottomLelfObject;
import game.keyword.TopLelfObject;
import physic.BoxCollider;
import physic.HitObject;
import physic.PhysicBody;
import physic.RunHitObject;

public class PlayerRightHand extends GameObject implements HitObject, PhysicBody {
    private BoxCollider boxCollider = new BoxCollider(15,15);
    private RunHitObject runHitObject;

    public PlayerRightHand(){
        this.runHitObject = new RunHitObject(BottomLelfObject.class);
        this.runHitObject = new RunHitObject(TopLelfObject.class);
    }

    @Override
    public void run(){
        this.runHitObject.run(this);
    }

    @Override
    public void getHit(GameObject gameObject) {

    }

    @Override
    public BoxCollider getBoxCollider() {
        return this.boxCollider;
    }
}
