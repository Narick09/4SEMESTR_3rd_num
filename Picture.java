package ThirdNumPack;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Picture extends JComponent {
    private final Image Im;
    private Coordinates coordinates= new Coordinates();
    public Picture(String FileName, int x, int y) throws IOException {
        Im = ImageIO.read(new File(FileName));
        coordinates.setCoordinates(x, y);
    }
    public Image getImage() {
        return this.Im;
    }
    public void setX(int x){
        this.coordinates.setX(x);
    }
    public void setY(int y){
        this.coordinates.setY(y);
    }
    public void setCoordinates(int x, int y){
        this.coordinates.setCoordinates(x,y);
    }
    public int getX(){
        return this.coordinates.getX();
    }
    public int getY(){
        return this.coordinates.getY();
    }
}