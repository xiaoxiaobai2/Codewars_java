package mygame;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TaiqiuGame extends MyFrame {
    private double x=10;
    private double y=40;
    private double speed=40;
    private double degree = Math.PI/3;
    Image image = GameUtil.getimage("image/ball.jpg");


    @Override
    public void paint(Graphics g) {
        setTitle("台球小游戏！");
        g.drawImage(image,(int)x,(int)y,null);
        x +=speed*Math.cos(degree);
        y +=speed*Math.sin(degree);
        if(speed>0){
            speed -=0.1;
        }
        if(y<40||y>490){
            degree = -degree;
        }
        if(x<10||x>490){
            degree = Math.PI-degree;
        }
    }

    //40ms刷新一次
    public class paintThread extends Thread{
        @Override
        public void run() {
            while (true){
                repaint();
                try {
                    Thread.sleep(40);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) {
        TaiqiuGame taiqiuGame = new TaiqiuGame();
        taiqiuGame.lunchFrame();
    }

}
