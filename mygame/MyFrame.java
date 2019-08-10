package mygame;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame {
    public void lunchFrame(){
        //初始化游戏界面
//        setTitle("台球小游戏");
        setLocation(20,10);
        setSize(500,500);
        setVisible(true);

        new paintThread().start();//每40ms更新一次
        //添加关闭按钮
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
    }
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
}
