package game.Player;

import base.GameObject;
import base.Vector2D;
import game.keyword.BottomLelfObject;
import game.keyword.BottomRightObject;
import game.keyword.Keyword;
import game.keyword.TopRightObject;
import physic.BoxCollider;
import physic.HitObject;
import physic.PhysicBody;
import physic.RunHitObject;

public class PlayerLelfHand extends GameObject implements HitObject, PhysicBody {
    public Vector2D velocity;
    private BoxCollider boxCollider = new BoxCollider(15,15);
    RunHitObject runHitObject;

    public PlayerLelfHand(){
        this.runHitObject = new RunHitObject(BottomRightObject.class);
        this.runHitObject = new RunHitObject(TopRightObject.class);
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
