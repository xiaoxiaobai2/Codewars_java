package SunSolar;

import java.awt.*;

public class Planet extends Star {
    double longaxis;
    double shortaxis;
    double x,y;//该行星坐标
    double speed;
    Image img;
    Star center;//围绕某颗行星转
    double degree = 0;//角度，初始为0；
    double width,height;//图片宽高的一半
    boolean satellite = false;//是否是卫星，如果是，则不画轨道

    public Planet(Star center,Image img, double longaxis, double shortaxis,double speed) {
        this.longaxis = longaxis + width;
        this.shortaxis = shortaxis + height;
        this.img = img;
//        图片的起始坐标
        this.x = center.x + this.longaxis;
        this.y = center.y;
        this.center =center;
        this.speed = speed;
        this.width = img.getWidth(null)/2;
        this.height = img.getHeight(null)/2;
    }

    public Planet(Star center,Image img, double longaxis, double shortaxis,double speed,boolean satellite) {
        this.longaxis = longaxis + width;
        this.shortaxis = shortaxis + height;
        this.img = img;
//        图片的起始坐标
        this.x = center.x + this.longaxis;
        this.y = center.y;
        this.center =center;
        this.speed = speed;
        this.width = img.getWidth(null)/2;
        this.height = img.getHeight(null)/2;
        this.satellite = satellite;
    }

    @Override
    public void draw(Graphics g) {
        //以图片中心为基准点
        g.drawImage(img,(int)(x-width),(int)(y-height),null);
        x = center.x +longaxis*Math.cos(degree);
        y = center.y +shortaxis*Math.sin(degree);
        degree +=speed;
        //不是卫星，画轨道
        if (!satellite) {
            draw_trace(g);
        }
    }
    public void draw_trace(Graphics g){
        Color color = g.getColor();
        g.setColor(Color.blue);
        //画轨道
        g.drawOval((int)(center.x-longaxis),(int)(center.y-shortaxis),(int)(longaxis*2),(int)(shortaxis*2));
        g.setColor(color);//恢复画笔颜色
    }
}
