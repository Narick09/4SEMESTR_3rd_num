package ThirdNumPack;

import java.io.IOException;

public class Game {
    public void gaming(){
        try {
            Model Spaceship = new ModelStarShip(0, 0, 50);//initialisation
            Controller Control = new StandartController(Spaceship);//initialisation
            View Interface = new StandartView(Spaceship, Control, 1200,800);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
