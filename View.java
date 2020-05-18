package ThirdNumPack;

import java.io.IOException;

public interface View{
    void openWindow() throws IOException;
    void drawMenu() throws IOException;
    void drawInitGameProcess() throws IOException;
    boolean drawGameScene(int i) throws IOException;

    int getHeight();
    int getWidth();
    void checkModel(ModelStarShip S);
    void printDescrition();
}
