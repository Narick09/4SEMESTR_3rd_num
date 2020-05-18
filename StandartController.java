package ThirdNumPack;


import java.io.IOException;


public class StandartController implements Controller {
    private boolean flag_game_started = false;
    private boolean flag_game_pause = false;
    private boolean flag_game_finished = false;
    private boolean flag_exit = false;
    private int leftBorder = 0;
    private int rightBorder = 1200;
    private int downBorder = 900;
    private int upBorder = 0;
    //private View Viewer = null;
    private Model SpaceShip = null;
    //private KeyListener ac = null;
    StandartController(Model Ship){
        //this.Viewer = Interface;
        this.SpaceShip = Ship;
    }

    public void controlling() throws IOException{
        int r = 0;
        while(r < 100){
            this.SpaceShip.moveRight();
        }
        //destroyEnemies();
    }
//    public void move(){
//
//    }
    public void moving(boolean Right, boolean Left, boolean Up, boolean Down){
        if(Right && !Left && !Up && !Down)
            if(SpaceShip.getX() + SpaceShip.getShipWidth() < rightBorder)
                SpaceShip.moveRight();
        if(!Right && Left && !Up && !Down)
            if(SpaceShip.getX() > leftBorder)
                SpaceShip.moveLeft();
        if(!Right && !Left && Up && !Down)
            if(SpaceShip.getX() > upBorder)
                SpaceShip.moveUp();
        if(!Right && !Left && !Up && Down)
            if(SpaceShip.getX() + SpaceShip.getShipHeight() < downBorder)
                SpaceShip.moveDown();
    }
    public void destroyEnemies() throws IOException {//moving & shooting
        //while(!flag_exit && !flag_game_pause){


//        while(Viewer.drawGameScene(i)){
//             if(scan.next().equals("d"))
//                 break;
//             i++;
//            //Thread.sleep(500);
//            //KeyListener
//            //в разных слушателях continue
//            //добавить методы управления в модель. Последняя будет связываться с вивером и передавать данные об изменении положения.
//        }
    }
}
