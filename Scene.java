package ThirdNumPack;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public class Scene extends JPanel
{
    private ArrayList<Picture> pictures = new ArrayList<>();
    public Scene(Model S) throws IOException {
        pictures.add(new Picture("C:\\Users\\Даниил\\IdeaProjects\\3rdNum\\out\\production\\3rdNum\\ThirdNumPack\\Pictures\\Background.jpg",0, 0));
        pictures.add(S.getPicture());
        for(Picture pic: pictures){
            pic.setBounds(pic.getX(), pic.getY(), pic.getWidth(), pic.getHeight());
            this.add(pic);
        }
        repaint();
        setVisible(true);
    }
//    public Scene(ArrayList<Picture> pictures){
//        this.pictures = pictures;
//    }

    public void moveElement(int index, Coordinates coordinates){
        pictures.get(index).setCoordinates(coordinates.getX(), coordinates.getY());
        //pictures.get(index).setBounds(coordinates.getX(), coordinates.getY(), pictures.get(index).getWidth(), pictures.get(index).getHeight());
        repaint();
    }
    public void addToScene(String PictureFileName, int x, int y) throws IOException {
        this.pictures.add(new Picture(PictureFileName, x, y));
    }
    public void setScene(ArrayList<Picture> pictures){
        if(pictures != null){
            this.pictures = pictures;
        }
    }
    public void move(){

    }

    public void paint(Graphics g)
    {
        for (Picture picture : pictures) {
            g.drawImage(picture.getImage(), picture.getX(), picture.getY(), null);
        }
    }
    //private ArrayList<Image> images = new ArrayList<>();
}
