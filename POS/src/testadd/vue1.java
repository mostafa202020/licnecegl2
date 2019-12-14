package testadd;
import javax.swing.*;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.*;
public class vue1 extends JFrame implements observer {static JTextField j1=new JTextField();

facture f;static controlvue1 ctrl;

public static void setctrlvue1 ( controlvue1 ctrl1) {
	ctrl=ctrl1;
	
}
public vue1 ( facture  f) {
	this.f=f;
	f.add( this);
	
}

   static JTextField j2=new JTextField();
   static JLabel l1=new JLabel("N=");
  static JTextField j3=new JTextField();
  static JLabel l2=new JLabel("designation:");
  static JTextField j4=new JTextField();
  static JLabel l3=new JLabel("qte=");
   static JButton tb=new JButton("Ajouter");
   static JLabel l4=new JLabel("prix=");
   public static  JPanel main2() {
	 
	   JPanel f = new JPanel(null);  
      f.setSize(100,800);  
     tb.addActionListener(ctrl);
     //tb.setMaximumSize(new Dimension(10,20));
     l1.setBounds(10,10,60,30);
      f.add(l1); 
      j1.setBounds(30,10,80,30);
      f.add(j1);
   l2.setBounds(130,10,80,30);
      f.add(l2);
      j2.setBounds(220,10,80,30);
      f.add(j2);
      l3.setBounds(300,10,80,30);
      f.add(l3);
      j3.setBounds(390,10,80,30);
      f.add(j3);
      l4.setBounds(460,10,80,30);
      f.add(l4);
     j4.setBounds(550,10,80,30);
      f.add(j4);
     tb.setBounds(700,10,80,30);
      f.add(tb);
    
      return f;
      
   }
   
  public String getchamps1() {
	  return j1.getText();
  }
  public String getchamps2() {
	  return j2.getText();
  }
  public String getchamps3() {
	  return j3.getText();
  }//--------------------------
  public String getchamps4() {
	  return j4.getText();
  }
@Override
public void update() {
	// TODO Auto-generated method stub
	
}
}