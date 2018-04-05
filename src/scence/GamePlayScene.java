package scence;

import base.GameObject;
import base.GameObjectManager;
import game.Player.Player;
import game.background.Background;
import game.keyword.Keyword;

public class GamePlayScene implements Scene {
    @Override
    public void init() {
        this.setupBackground();
        this.setupKeyword();
        this.setupPlayer();
    }

    @Override
    public void deinit() {
        GameObjectManager.instance.clear();
    }

    private void setupKeyword(){
        Keyword keyword = new Keyword();
        keyword.velocity.set(0,1);
        keyword.position.set(100,200);
        GameObjectManager.instance.add(keyword);
    }

    private void setupPlayer(){
        Player player = new Player();
        player.position.set(150,150);
        GameObjectManager.instance.add(player);
    }

    private void setupBackground() {
        Background background = new Background();
        background.position.set(200,300);
        GameObjectManager.instance.add(background);
    }


}
