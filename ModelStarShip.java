package ThirdNumPack;

import java.io.IOException;

public class ModelStarShip {
    private Coordinates coordinates;
    private int leftBorder = 0;
    private int rightBorder = 0;
    private int downBorder = 600;
    private int upBorder = 0;

    private Picture ShipModelPicture;
    class Ammunition {
        //private Coordinates coordinates;
        private int speedFlying;

    }
    private Ammunition bullets = null;

    ModelStarShip(int x, int y) throws IOException {
        coordinates = new Coordinates();
        coordinates.setCoordinates(x, y);
        ShipModelPicture = new Picture("C:\\Users\\Даниил\\IdeaProjects\\3rdNum\\out\\production\\3rdNum\\ThirdNumPack\\Pictures\\BattleShip.png", x, y);
    }
    ModelStarShip(View v){
        int w = v.getWidth();
        int h = v.getHeight();
    }

    public void moveLeft(){

    }
    public void moveRight(){}
    public void moveDown(){}
    public void moveUp(){}

    public int getX(){
        return this.coordinates.getX();
    }
    public int getY(){
        return this.coordinates.getY();
    }

    public void shoot(){

    }
}
