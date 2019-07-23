package mygame;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test01 extends Frame{
    //先创建image对象
    Image image = GameUtil.getimage("image/tank.jpg");
    int x=100,y=100;
    public void launchFrame(){
        setLocation(200,200);
        setSize(500,500);

        setVisible(true);
        setTitle("游戏界面测试");
        //每40ms刷新一次界面

        new paintthread().start();
        //设置关闭按钮
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
    }
    //重写paint
    @Override
    public void paint(Graphics g) {
        g.drawOval(100,100,200,100);//画圆、椭圆
        g.drawLine(100,100,200,200);//画直线
        Color color = g.getColor();
        g.setColor(Color.red);
        Font font = new Font("宋体",Font.BOLD,20);
        g.setFont(font);
        g.drawString("我的游戏界面！",200,200);
        g.draw3DRect(300,300,100,100,false);
        g.fillArc(100,100,100,100,50,50);//扇形
        g.setColor(color);//用完画笔需要还原为原色，防止出现混乱，因为是回调方法
        g.fillRect(x,y,20,20);
        x +=3;
        y +=3;
//        g.drawImage(image,0,0,null);
    }

    public class paintthread extends Thread{
        @Override
        public void run() {

            while (true){
                //循环重画
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
        Test01 test01 = new Test01();
        test01.launchFrame();
    }
}

