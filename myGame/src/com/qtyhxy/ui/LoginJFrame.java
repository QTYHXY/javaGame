package com.qtyhxy.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LoginJFrame extends JFrame {


    //空参构造
    public LoginJFrame() {
        initJFrame();



        //设置是否可见
        this.setVisible(true);
    }

    private void initJFrame() {
        //设置宽高和是否可见
        this.setSize(488, 430);
        //设置标题
        this.setTitle("登录");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //创建一个按钮对象
        JButton jtb = new JButton("点我呀");
        //设置位置和宽高
        jtb.setBounds(0,0,100,50);
        //给按钮添加动作监听
        //addActionListener:表示我要给组件添加哪一个事件监听（动作监听包括鼠标左键点击，空格
        jtb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("不要点我呀");
            }
        });

        //把按键添加到界面当中
        this.getContentPane().add(jtb);
    }
}


