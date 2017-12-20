package com.ccu.jframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.ccu.db.DB;

public class CarFindByPriceFrame{
	
		private static ArrayList<HashMap<String,String>> carlist = null;
		
		CarFindByPriceFrame(String n){
			
		}
		
		CarFindByPriceFrame(){
		JFrame jf = new JFrame();
		jf.setTitle("精确查找");
		JButton jb1 = new JButton("查找");
		JButton jb2 = new JButton("重置");
		JLabel jl0 = new JLabel("请输入所查询的汽车的价格范围");
		JLabel word = new JLabel("到");
		
		jb1.setBounds(165, 140, 60, 25);
		jb2.setBounds(269, 140, 60, 25);
		
		JLabel jl1 = new JLabel("价格范围");
		jl1.setBounds(220, 40, 100, 25);
		
		JTextField t1 = new JTextField();
		t1.setBounds(155, 90, 80, 25);
		JTextField t2 = new JTextField();
		t2.setBounds(259, 90, 80, 25);
		
		word.setBounds(240, 86, 30, 30);
		
		jf.add(word);
		jf.add(jl1);
		jf.add(t1);
		jf.add(t2);
		jf.add(jb1);
		jf.add(jb2);
		
		jl0.setBounds(5, 243, 300, 25);
		jf.add(jl0);
		jf.setLayout(null);
		jf.setBounds(450, 150, 500, 300);
		jf.setResizable(false);
		jf.setVisible(true);
		
		//添加事件
		
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				DB d = new DB();
				String min = t1.getText();
				String max = t2.getText();
				ArrayList<HashMap<String,String>> list = d.queryList("SELECT * FROM carinfo WHERE price>=? and price<=?",new String[]{min,max});
				if(list.size()>0){
					carlist = list;
					jf.dispose();
					new CarFindByPrice2Frame();
				}else{
					jl0.setText("没有此范围价格的车型，请重新输入！");
					t1.setText("");
					t2.setText("");
				}
			}
		});
		
		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
					t1.setText("");
					t2.setText("");
					jl0.setText("重置成功！");
			}
		});
	}
		
	public ArrayList<HashMap<String,String>> getList(){
		return this.carlist;
	}
}
