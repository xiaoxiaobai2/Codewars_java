package SunSolar;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class GameUtil {
    public static Image getimage(String path){
        //注意，资源文件名含有_，读取不出来
        URL url = GameUtil.class.getClassLoader().getResource(path);//将相对路径转化为绝对路径
        System.out.println(url);
        BufferedImage image=null;
        try {
            image = ImageIO.read(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
    }
}
