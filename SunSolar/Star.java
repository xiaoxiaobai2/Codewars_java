package SunSolar;

import java.awt.*;

public class Star {
    Image img;
    double x,y;//星球坐标（左上角）
    double width,height;//图片宽高的一半

    public void draw(Graphics g){
        g.drawImage(img,(int)(x-width),(int)(y-height),null);
    }

    public Star(){

    }

    public Star(Image img, double x, double y) {
        this.img = img;
        this.x = x;
        this.y = y;
        this.width = img.getWidth(null)/2;
        this.height = img.getHeight(null)/2;
    }
}
