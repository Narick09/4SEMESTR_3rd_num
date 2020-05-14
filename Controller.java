package ThirdNumPack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.Scanner;

public class Controller {
    private boolean flag_game_started = false;
    private boolean flag_game_pause = false;
    private boolean flag_game_finished = false;
    private boolean flag_exit = false;
    private View Viewer = null;
    private ModelStarShip SpaceShip = null;

    Controller(View Interface, ModelStarShip Ship){
        this.Viewer = Interface;
        this.SpaceShip = Ship;
    }

    public void startControl() throws IOException {
        Viewer.openWindow();//перенести в майн
        Viewer.drawMenu();
        Viewer.drawInitGameProcess();
    }
    public void destroyEnemies(){//moving & shooting
        //while(!flag_exit && !flag_game_pause){
        Scanner scan = null;
        scan = new Scanner(System.in);
        int i = 0;
        while(Viewer.drawGameScene(i)){
             if(scan.next().equals("d"))
                 break;
             i++;

            //KeyListener
            //в разных слушателях continue
            //добавить методы управления в модель. Последняя будет связываться с вивером и передавать данные об изменении положения.
        }
    }
}
