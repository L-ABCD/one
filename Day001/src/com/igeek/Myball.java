package com.igeek;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

/*
 *  1、myball extends JFrame
 *  2、重写paint方法 : paint()
 *  3、实现KeyListener 接口，重写抽象方法
 *  
 *  java的事件委派处理机制
 *  
 */

public class Myball extends JFrame implements KeyListener{
	
	//成员属性
	int x = 40;
	int y = 40;
	int speed = 10;
	
	//构造函数
	public Myball() throws HeadlessException {
		super();
		setVisible(true);
		setSize(500,500);
		setLocation(100,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//注册监听
		this.addKeyListener(this);
	}
	
	/*
	 * 方法的重写；方法的重载
	 * Graphics ：画笔
	 */

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		//int x = 0;  //局部变量若无赋值则报错
		super.paint(g);
		//设置画笔的颜色
		g.setColor(Color.red);
		//画一个圆
		g.drawOval(x,y,100,100);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	public void keyReleased(KeyEvent e) {
		
		if(e.getKeyCode() == KeyEvent.VK_DOWN){
			y += speed;
		}else if (e.getKeyCode() == KeyEvent.VK_UP){
			y -= speed;
		}else if (e.getKeyCode() == KeyEvent.VK_LEFT){
			x -= speed;
		}else if(e.getKeyCode() == KeyEvent.VK_LEFT){
			x += speed;
		}
		//重新绘制
		repaint();
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
