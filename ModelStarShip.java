package ThirdNumPack;

import java.io.IOException;

public class ModelStarShip implements Model{
    private Coordinates coordinates;
    private int moveStep = 0;
    private Actions Act = null;//shoot
    private int shipHeight = 0;
    private int shipWidth = 0;
    private Picture ShipModelPicture;
    class Ammunition {
        //private Coordinates coordinates;
        private int speedFlying;

    }
    private Ammunition bullets = null;

    ModelStarShip(int x, int y, int moveStep) throws IOException {
        coordinates = new Coordinates();
        coordinates.setCoordinates(x, y);
        ShipModelPicture = new Picture("C:\\Users\\Даниил\\IdeaProjects\\3rdNum\\out\\production\\3rdNum\\ThirdNumPack\\Pictures\\BattleShip.png", this.coordinates.getX(), this.coordinates.getY());
        this.shipHeight = ShipModelPicture.getImage().getWidth(null);
        this.shipWidth = ShipModelPicture.getImage().getWidth(null);
        this.moveStep = moveStep;
        System.out.println(this.shipHeight + " " + this.shipWidth);
    }

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

    @Override
    public Picture getPicture() {
        return this.ShipModelPicture;
    }

    public int getShipWidth(){
        return this.shipWidth;
    }
//shooting
    public void doACt(){

    }
}
