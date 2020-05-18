package ThirdNumPack;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

public class GamePannel extends JFrame {
    //private JPanel panel = null;
    private Scene presentScene = null;
    public GamePannel() throws IOException {
        setTitle("GAMA Bullet");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        //this.panel = new JPanel();
        // Добавление компонента к фрейму.
        presentScene  = new Scene();
        this.add(presentScene);
    }
    public GamePannel(Scene scene) throws IOException {
        setTitle("GAMA Bullet");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        // Добавление компонента к фрейму.
        presentScene  = scene;
        this.add(presentScene);
    }
    public Scene getScene(){
        return this.presentScene;
    }
    public void reDraw(Scene component){
        if(component != null) {
            this.remove(this.presentScene);
            this.presentScene = component;
            //this.presentScene.setScene();
            this.add(this.presentScene);
            //this.setVisible(true);
        }
    }
//    public void Add(ActionListener component){
//        this.addL(component);
//    }
    public void reDraw(ArrayList<Picture> pictures){
        this.presentScene.setScene(pictures);
        this.reDraw(presentScene);
    }
    //public boolean reDraw(int index)
    public void reDraw(int index, Coordinates coordinates){
        this.presentScene.moveElement(index, coordinates);
        this.reDraw(presentScene);
    }
    public static final int DEFAULT_WIDTH = 1200;
    public static final int DEFAULT_HEIGHT = 900;
}

