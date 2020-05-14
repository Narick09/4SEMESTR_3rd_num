package ThirdNumPack;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

//мб добавить класс, к-ый будет хранить в себе местоположения и начальные координаты картинок
//и добавить в пикчу конструктор, принимающий массив этих классов

public class Scene extends JComponent
{

    private ArrayList<Picture> pictures = new ArrayList<>();
    public Scene() throws IOException {
        pictures.add(new Picture("C:\\Users\\Даниил\\IdeaProjects\\3rdNum\\out\\production\\3rdNum\\ThirdNumPack\\Pictures\\Background.jpg",0, 0));
        pictures.add(new Picture("C:\\Users\\Даниил\\IdeaProjects\\3rdNum\\out\\production\\3rdNum\\ThirdNumPack\\Pictures\\BattleShip.png",450, 550));
    }
    public Scene(ArrayList<Picture> pictures){
        this.pictures = pictures;
    }

    public boolean setScene(ArrayList<Picture> pictures){
    if(pictures != null){
        this.pictures = pictures;
        return true;
    }
    return false;
}
//    public boolean setScene(Scene S){
//        S.getX()
//    }
    public void paintComponent(Graphics g)
    {
        for (Picture picture : pictures) {
            g.drawImage(picture.getImage(), picture.getX(), picture.getY(), null);
        }
    }

    //private ArrayList<Image> images = new ArrayList<>();
}