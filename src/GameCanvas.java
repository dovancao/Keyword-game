import base.GameObjectManager;
import scence.GamePlayScene;
import scence.SceneManager;


import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class GameCanvas extends JPanel{

    BufferedImage backBuffered;
    Graphics graphics;


    public GameCanvas(){
       this.setup();
       this.setBackBuffered();
       SceneManager.instance.changeScene(new GamePlayScene());
    }

    private void setup(){
        this.setSize(400,600);
        this.setVisible(true);
    }

    private void setBackBuffered(){
        this.backBuffered = new BufferedImage(400,600,BufferedImage.TYPE_4BYTE_ABGR);
        this.graphics = this.backBuffered.getGraphics();
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(this.backBuffered,0,0,null); // cai ham nay dung de ve 1 anh

    }

    public void runAll(){
        GameObjectManager.instance.runAll();
        SceneManager.instance.performSceneIfNeeded();
    }

    public void renderAll(){
        GameObjectManager.instance.renderAll(this.graphics);
        this.repaint();
    }

}
