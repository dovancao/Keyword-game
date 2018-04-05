package action;

import base.FrameCounter;
import base.GameObject;
// delay sau 1 khoang thoi gian nao do action tiep theo moi duoc hoat dong
public class WaitAction implements Action {

    public WaitAction(int max){
        this.frameCounter = new FrameCounter(max);
    }

    private FrameCounter frameCounter;
    @Override
    public boolean run(GameObject owner) {
        // neu true -> action thuc hien xong
        // neu false -> action dang chua thuc hien xong

        return this.frameCounter.run();
    }

    @Override
    public void reset() {
        this.frameCounter.reset();
    }
}
