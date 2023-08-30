package com.qtyhxy.ui;

import javax.swing.*;

public class RegisterJFrame extends JFrame {

    //空参构造（初始化）
    public RegisterJFrame() {
        initJFrame();


        //设置是否可见
        this.setVisible(true);
    }


    private void initJFrame() {
        //设置宽高
        this.setSize(488, 500);
        //设置标题
        this.setTitle("注册");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


}
