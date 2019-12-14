package testadd;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class vue3 {
	public static void main(String[] args) {
	      // création de l'application
	      JFrame p = new JFrame();
	      JPanel f1=new JPanel();
	      f1.setLayout(null);
	      
	      facture fff=new facture(); 
	      vue1 v1=new vue1(fff);
	      vue2 v2=new vue2(fff);
	      vue4 v4=new vue4(fff);
	      controlvue1 ctrl=new controlvue1( v1,fff);
	     v1.setctrlvue1(ctrl);
	      
	      p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      p.setPreferredSize(new Dimension(1000, 1000));
	      p.setLocation(100,100); 
	      p.setLocationRelativeTo(null); 
	     JPanel j=vue1.main2();
	     JPanel j2=vue2.main1();
	     JPanel j3=vue4.main1();
	     j.setBounds(10, 10, 900, 100);
	     j2.setBounds(10, 40, 100, 300);
	     j3.setBounds(10, 200, 600, 100);
	      f1.add(j);
	      f1.add(j2);
	      f1.add(j3);
	      p.add(f1);;
	      p.pack();
	      p.setVisible(true);
	   }
}
