package ThirdNumPack;

import javax.swing.*;
import java.io.IOException;

public class GamePannel extends JFrame {
    Scene presentScene = null;
    public GamePannel() throws IOException {
        setTitle("GAMA Bullet");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
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
    public boolean reDraw(Scene component){
        if(component != null) {
            this.remove(this.presentScene);
            this.presentScene = component;
            //this.presentScene.setScene();
            this.add(this.presentScene);
            return true;
        }
        return false;
    }
    public boolean reDraw(){
        return false;
    }

        public static final int DEFAULT_WIDTH = 1200;
    public static final int DEFAULT_HEIGHT = 900;
}

