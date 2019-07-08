package com.igeek;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

/*
 *  1��myball extends JFrame
 *  2����дpaint���� : paint()
 *  3��ʵ��KeyListener �ӿڣ���д���󷽷�
 *  
 *  java���¼�ί�ɴ������
 *  
 */

public class Myball extends JFrame implements KeyListener{
	
	//��Ա����
	int x = 40;
	int y = 40;
	int speed = 10;
	
	//���캯��
	public Myball() throws HeadlessException {
		super();
		setVisible(true);
		setSize(500,500);
		setLocation(100,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//ע�����
		this.addKeyListener(this);
	}
	
	/*
	 * ��������д������������
	 * Graphics ������
	 */

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		//int x = 0;  //�ֲ��������޸�ֵ�򱨴�
		super.paint(g);
		//���û��ʵ���ɫ
		g.setColor(Color.red);
		//��һ��Բ
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
		//���»���
		repaint();
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
