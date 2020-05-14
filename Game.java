package ThirdNumPack;

import java.io.IOException;

public class Game {
    public void gaming(){
        try {
            ModelStarShip Spaceship = new ModelStarShip(500, 800);//initialisation
            View Interface = new View(Spaceship, 1200,900);
            Controller Control = new Controller(Interface, Spaceship);//initialisation
            Control.startControl();
            Control.destroyEnemies();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //игра:
    //модель корабля вверх - стрелять на опр клавишу - через акшион листенер
    //надо будет передавать координаты положения корабля, чтобы знать, откуда производить выстрел
    //этим будет занимать контроллер
}
