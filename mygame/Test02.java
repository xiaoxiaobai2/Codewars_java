package mygame;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 测试物体的移动
 *
 */
public class Test02 extends Frame {
    private int x=100,y=100;
    private boolean left=true;

    public void launchFrame(){
        setLocation(200,200);
        setSize(500,500);

        setVisible(true);
        setTitle("游戏界面测试");
        //每40ms刷新一次界面

        new Test02.paintthread().start();
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
        g.fillOval(x,y,10,10);
        if(left){
            x +=3;
        }
        else {
            x-=3;
        }
        if (x >500){
            left =false;
        }
        if (x<0){
            left = true;
        }
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
        Test02 test02 = new Test02();
        test02.launchFrame();
    }
}