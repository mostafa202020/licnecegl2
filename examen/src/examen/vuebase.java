package examen;



import java.awt.BorderLayout;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class vuebase {
	public static void main(String[] args) {
	      // création de l'application
	      JFrame f1 = new JFrame();
 
	  f1.setLayout(null);
	      
	      nombre fff=new nombre(); 
	      vue1 v1=new vue1(fff);
	      vue2 v2=new vue2(fff);
	      vue3 v3=new vue3(fff);
	      System.out.println("eeeeeeeeeee="+v1.l1.getText());
	      controlvue1 ctrl=new controlvue1( v1,fff);
	     v1.setctrlvue1(ctrl);
	      
	   f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      f1.setPreferredSize(new Dimension(900, 900));
	      //f1.setLocation(100,100); 
	    // f1.setLocationRelativeTo(null); 

	     v1.setBounds(10, 10, 300, 100); 
	   f1.add(v1);
	   v2.setBounds(10, 310, 300, 100);
	    f1.add(v2);
	    v3.setBounds(10, 420, 300,100);
	    f1.add(v3);

	   f1.pack();
	      
	    f1.setVisible(true);
	   }
}
