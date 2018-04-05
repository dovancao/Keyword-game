package game.background;

import base.GameObject;
import renderer.ImageRenderer;

public class Background extends GameObject {
    public Background(){
        this.renderer = new ImageRenderer("resource/background.png");
    }
}
