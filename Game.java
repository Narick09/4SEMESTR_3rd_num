package ThirdNumPack;

import java.io.IOException;

public class Game {
    public void gaming(){
        try {
            Model Spaceship = new ModelStarShip(500, 800);//initialisation
            Controller Control = new StandartController(Spaceship);//initialisation
            View Interface = new StandartView(Spaceship, Control, 1200,900);
            Interface.openWindow();
            Interface.drawMenu();
            Interface.drawInitGameProcess();
            //Control.controlling();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //игра:
    //модель корабля вверх - стрелять на опр клавишу - через акшион листенер
    //надо будет передавать координаты положения корабля, чтобы знать, откуда производить выстрел
    //этим будет занимать контроллер
}