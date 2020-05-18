package ThirdNumPack;

import java.io.IOException;

public class ModelStarShip implements Model{
    private Coordinates coordinates;
    private int moveStep = 1;
    private Actions Act = null;//shoot
    private int shipHeight = 0;
    private int shipWidth = 0;
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
        this.shipHeight = ShipModelPicture.getHeight();
        this.shipWidth = ShipModelPicture.getWidth();
    }
//    ModelStarShip(View v){
//        int w = v.getWidth();
//        int h = v.getHeight();
//    }

    public void moveLeft(){
        this.coordinates.changeX(-1*moveStep);
    }
    public void moveRight(){
        this.coordinates.changeX(moveStep);
    }
    public void moveDown(){
        this.coordinates.changeY(moveStep);
    }
    public void moveUp(){
        this.coordinates.changeY(-1*moveStep);
    }

    public Coordinates getCoordinates(){
        return this.coordinates;
    }
    public int getX(){
        return this.coordinates.getX();
    }
    public int getY(){
        return this.coordinates.getY();
    }
    public int getShipHeight(){
        return this.shipHeight;
    }
    public int getShipWidth(){
        return this.shipWidth;
    }
//shooting
    public void doACt(){

    }
}
