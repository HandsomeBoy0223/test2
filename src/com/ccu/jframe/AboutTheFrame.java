package com.ccu.jframe;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class AboutTheFrame {
	
	public AboutTheFrame() {
		JFrame jf = new JFrame("���ڱ���Ʒ");
		
		JLabel jl1 = new JLabel("С���Ա");
		jl1.setBounds(70, 40, 100 , 25);
		jl1.setFont(new Font("����",0,20));
		JLabel jl2 = new JLabel("ѧ��");
		jl2.setBounds(240, 40, 100, 25);
		jl2.setFont(new Font("����",0,20));
		JLabel jl3 = new JLabel("�ֹ����");
		jl3.setBounds(410, 40, 200, 25);
		jl3.setFont(new Font("����",0,20));
		
		JLabel lzy_jl1 = new JLabel("·־��");
		lzy_jl1.setBounds(70, 90, 100, 25);
		lzy_jl1.setFont(new Font("����",0,20));
		JLabel lzy_jl2 = new JLabel("041540223");
		lzy_jl2.setBounds(240, 90, 100, 25);
		lzy_jl2.setFont(new Font("����",0,20));
		JLabel lzy_jl3 = new JLabel("��ɲ��ִ���");
		lzy_jl3.setBounds(410, 90, 200, 25);
		lzy_jl3.setFont(new Font("����",0,20));
		
		JLabel zy_jl1 = new JLabel("����");
		zy_jl1.setBounds(70, 140, 100, 25);
		zy_jl1.setFont(new Font("����",0,20));
		JLabel zy_jl2 = new JLabel("041540223");
		zy_jl2.setBounds(240, 140, 100, 25);
		zy_jl2.setFont(new Font("����",0,20));
		JLabel zy_jl3 = new JLabel("��������Լ��ĵ�׫д");
		zy_jl3.setBounds(410, 140, 200, 25);
		zy_jl3.setFont(new Font("����",0,20));
		
		JLabel lmy_jl1 = new JLabel("����ң");
		lmy_jl1.setBounds(70, 190, 100, 25);
		lmy_jl1.setFont(new Font("����",0,20));
		JLabel lmy_jl2 = new JLabel("041540220");
		lmy_jl2.setBounds(240, 190, 100, 25);
		lmy_jl2.setFont(new Font("����",0,20));
		JLabel lmy_jl3 = new JLabel("��ɲ��ִ���");
		lmy_jl3.setBounds(410, 190, 200, 25);
		lmy_jl3.setFont(new Font("����",0,20));
		
		JLabel lt_jl1 = new JLabel("����");
		lt_jl1.setBounds(70, 240, 100, 25);
		lt_jl1.setFont(new Font("����",0,20));
		JLabel lt_jl2 = new JLabel("041540203");
		lt_jl2.setBounds(240, 240, 100, 25);
		lt_jl2.setFont(new Font("����",0,20));
		JLabel lt_jl3 = new JLabel("��������Լ��ĵ�׫д");
		lt_jl3.setBounds(410, 240, 200, 25);
		lt_jl3.setFont(new Font("����",0,20));
		
		JLabel finalLabel = new JLabel("���в���֮������������������");
		finalLabel.setBounds(140, 320, 500, 30);
		finalLabel.setFont(new Font("����",0,30));
		
		jf.add(jl1);
		jf.add(jl2);
		jf.add(jl3);
		jf.add(lzy_jl1);
		jf.add(lzy_jl2);
		jf.add(lzy_jl3);
		jf.add(zy_jl1);
		jf.add(zy_jl2);
		jf.add(zy_jl3);
		jf.add(lmy_jl1);
		jf.add(lmy_jl2);
		jf.add(lmy_jl3);
		jf.add(lt_jl1);
		jf.add(lt_jl2);
		jf.add(lt_jl3);
		jf.add(finalLabel);
		
		jf.setLayout(null);
		jf.setBounds(450, 150, 700, 450);
		jf.setResizable(false);
		jf.setVisible(true);
	}
}
