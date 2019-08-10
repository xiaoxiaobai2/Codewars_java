package SunSolar;

import java.awt.*;

public class SunSolar extends MyFrame{

    final int P = 80;
    final int P2 = 10;
    final double Q = 0.2;
    Star sun = new Star(canstant.sun,canstant.game_width /2,canstant.game_height /2-100);

    //水星
    Planet mercury = new Planet(sun,canstant.mercury,(int)(0.387*P),(int)(0.387*P*0.6),1/0.24*Q);
    //金星
    Planet venus = new Planet(sun,canstant.venus,(int)(0.723*P),(int)(0.723*P*0.6),1/0.62*Q);
    //地球
    Planet earth = new Planet(sun,canstant.earth,(int)(1*P),(int)(1*P*0.6),1*Q);
    //月亮（地球的卫星）
    Planet moon = new Planet(earth,canstant.moon,(int)(10*P),(int)(0.5*P*0.6),0.1*Q,true);

    //火星
    Planet mars = new Planet(sun,canstant.mars,(int)(1.524*P),(int)(1.524*P*0.6),1/1.88*Q);
    //木星
    Planet jupiter = new Planet(sun,canstant.jupiter,(int)(5.205*P/2.5),(int)(5.205*P*0.6/2.5),4/11.86*Q);
    //土星
    Planet saturn = new Planet(sun,canstant.Saturn,(int)(9.576*P/3.5),(int)(9.576*P*0.6/3.5),0.25*Q);
    //天王星1
    Planet urans = new Planet(sun,canstant.Uranus,(int)(19.18*P/4.5),(int)(19.18*P*0.6/4.5),0.23*Q);
    //海王星
    Planet neptune = new Planet(sun,canstant.neptune,(int)(30.13*P/5.5),(int)(30.13*P*0.6/5.5),0.2*Q);

    @Override
    public void paint(Graphics g) {
        g.drawImage(canstant.bg,0,0,null);
        setTitle("太阳系");
        sun.draw(g);
        earth.draw(g);
        venus.draw(g);
        mercury.draw(g);
        mars.draw(g);
        jupiter.draw(g);
        saturn.draw(g);
        urans.draw(g);
        neptune.draw(g);
        moon.draw(g);
    }

    public static void main(String[] args) {
        new SunSolar().lunchFrame();
    }
}
