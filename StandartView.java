package ThirdNumPack;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

//создаем окно с менюшкой
//в нем кнопка старт
//тыкаем старт - скрываем кнопку и начинаем игру.
public class StandartView implements View, ActionListener {
    private int width = 0;
    private int height = 0;
    GamePannel frame;//scene here
    private String description;
    private boolean skipDescriptionFlag = false;
    private Model S = null;
    private Controller C = null;

    Timer timer = null;
    //int delete = 0;

    private Statistic statistic;

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        C.moving(true, false, false,false);
        //frame.reDraw(1,S.getCoordinates());
    }

    private class Menu{
        JButton Start;
        JButton Description;
        JButton Score;
    }

    StandartView(Model s, Controller c, int width, int height) throws IOException {
        this.S = s;
        this.C = c;
        statistic = new Statistic();
        frame = new GamePannel(this.S);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        description = "smt description";
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.width = width;
        this.height = height;
        this.frame.setSize(width, height);
        //можно ли добавить 2 кейлистенера, чтобы они работали параллельно?
        frame.addKeyListener(new KeyListener() {
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                if(key == KeyEvent.VK_W) {
                    C.moving(false,false,true,false);
                    //System.out.println("wwwwwwwwwwwwwwwwwww");
                    frame.reDraw(1,S.getCoordinates());
                    //delete++;
                }
                if(key == KeyEvent.VK_S) {
                    C.moving(false,false,false,true);
                    //System.out.println("sssssssssssssssssss");
                    frame.reDraw(1,S.getCoordinates());
                    //delete++;
                }
                if(key == KeyEvent.VK_A) {
                    C.moving(false,true,false,false);
                    //System.out.println("aaaaaaaaaaaaaaaaaaaa");
                    frame.reDraw(1,S.getCoordinates());
                    //delete++;
                }
                if(key == KeyEvent.VK_D) {
                    C.moving(true,false,false,false);
                    //System.out.println("dddddddddddddddddddd");
                    frame.reDraw(1,S.getCoordinates());
                    //delete++;
                }
            }
            public void keyReleased(KeyEvent e) {
                int key = e.getKeyCode();
                if(key == KeyEvent.VK_Q){
                    drawGameScene();
                    frame.reDraw(1,S.getCoordinates());
                }
                //System.out.println("wwwwwwwwwwwwwwwww");
            }
            public void keyTyped(KeyEvent e) {
                //System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrr");
            }
        });
    }

    public int getWidth(){
        return width;
    }
    public int getHeight() {
        return height;
    }

    public void drawMenu() {
    }
    public void checkModel(ModelStarShip S){
        this.frame.getScene().moveElement(0, this.S.getCoordinates());
    }
    public boolean drawShip(){
        return false;//тут см за изменениями в координатах, и от них вызываем перерисовку картины на мув корабля.
        //PS реальные координаты меняем или не меняем только контроллером! Он же и смотрит за тем, чтобы корабль не вылезал за рамки.
    }
    public boolean drawGameScene(){
//        ArrayList<Picture> pictures = new ArrayList<>();
//        try {
//            pictures.add(new Picture("C:\\Users\\Даниил\\IdeaProjects\\3rdNum\\out\\production\\3rdNum\\ThirdNumPack\\Pictures\\Background.jpg",0, 0));
//            pictures.add(new Picture("C:\\Users\\Даниил\\IdeaProjects\\3rdNum\\out\\production\\3rdNum\\ThirdNumPack\\Pictures\\BattleShip.png",450 + (200*i), 550));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        //Scene sc = new Scene(pictures);
//        frame.reDraw(pictures);

        // период срабатывания таймера мс
        timer = new Timer(100, this);
        timer.start();
        Thread run = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        //C.moving(true, false, false,false);
                        frame.reDraw(1,S.getCoordinates());
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
        run.start();
        return true;
    }
    public void printDescrition() {
        while(!skipDescriptionFlag){
            //doing smt
            //flag = true, if button "Skip" is pressed
        }
    }
}
