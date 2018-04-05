package game.Player;

import base.FrameCounter;
import base.GameObject;
import base.Vector2D;
import input.MouseMotionInput;
import physic.BoxCollider;
import physic.HitObject;
import physic.PhysicBody;
import renderer.AnimationRenderer;
import renderer.ImageRenderer;
import renderer.Renderer;

public class Player extends GameObject {
    public Vector2D velocity;
    private Renderer imageRenderer;
    private Renderer animationRenderer;
    private FrameCounter frameCounter;
    private boolean isAnimation;
    private PlayerLelfHand playerLelfHand;
    private PlayerRightHand playerRightHand;

    public Player(){
        this.imageRenderer = new ImageRenderer("resource/playerNonActtact.png");
        this.animationRenderer = new AnimationRenderer(5,
                "resource/playerNonActtact.png",
                "resource/playerActtact.png",
                "resource/playerNonActtact.png",
                "resource/playerActtact.png",
                "resource/playerNonActtact.png"
        );
        this.frameCounter = new FrameCounter(50);
        this.renderer = this.imageRenderer;
    }

    @Override
    public void run(){
        super.run();
        this.position.set(MouseMotionInput.instance.position);
        this.playerLelfHand.position.set(this.position.x-5,this.position.y+5);
        this.playerRightHand.position.set(this.position.x+5,this.position.y+5);
        if(this.isAnimation){
            if(this.frameCounter.run()){
                this.isAnimation = false;
                this.renderer = this.imageRenderer;
                this.frameCounter.reset();
            }
        }
    }



}
