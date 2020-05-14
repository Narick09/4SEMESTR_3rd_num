package ThirdNumPack;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;

//создаем окно с менюшкой
//в нем кнопка старт
//тыкаем старт - скрываем кнопку и начинаем игру.
public class View {
    private int width = 0;
    private int height = 0;
    GamePannel frame;//scene here
    private String description;
    private boolean skipDescriptionFlag = false;
    private ModelStarShip S = null;

    private Statistic statistic;
    private class Menu{
        JButton Start;
        JButton Description;
        JButton Score;
    }

    View(ModelStarShip s, int width, int height) throws IOException {
        this.S = s;
        statistic = new Statistic();
        frame = new GamePannel();
        description = "smt description";

        this.width = width;
        this.height = height;
        this.frame.setSize(width, height);
    }
//    public void setWindowParameters(int width, int height) {
//        this.width = width;
//        this.height = height;
//        this.frame.setSize(width, height);
//    }
    public void openWindow() throws IOException {
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //JButton but = new JButton("tararara");
//        but.setBounds(50, 20, 100, 20);
//        but.setHideActionText(Boolean.parseBoolean("sss"));
        //but.setVisible(true);
//        ActionListener l1 = new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                System.out.println("sss");
//                but.setText("ureureure");
//                but.setVisible(false);
//            }
//        };
//        but.addActionListener(l1);
//        frame.add(but);
//        frame.setSize(500,500);
        //backgroundImage = ImageIO.read(new File("C:\\Users\\Даниил\\Downloads\\prog\\3rdNumber\\Background.jpg"));
        //frame.setLayout(null);
        //frame.setVisible(true);
    }
    public int getWidth(){
        return width;
    }
    public int getHeight() {
        return height;
    }

    public void drawMenu() {

    }
    public void drawInitGameProcess() throws IOException {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    void checkCoordinates(ModelStarShip S){
        //this.
    }
    public void checkModel(ModelStarShip S){

    }
    public boolean drawGameScene(int i){
        ArrayList<Picture> pictures = new ArrayList<>();
        try {
            pictures.add(new Picture("C:\\Users\\Даниил\\IdeaProjects\\3rdNum\\out\\production\\3rdNum\\ThirdNumPack\\Pictures\\Background.jpg",0, 0));
            pictures.add(new Picture("C:\\Users\\Даниил\\IdeaProjects\\3rdNum\\out\\production\\3rdNum\\ThirdNumPack\\Pictures\\BattleShip.png",450 + (200*i), 550));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene sc = new Scene(pictures);
        frame.reDraw(sc);
        return true;
    }
    public void printDescrition() {
        while(!skipDescriptionFlag){
            //doing smt
            //flag = true, if button "Skip" is pressed

        }
    }
}
