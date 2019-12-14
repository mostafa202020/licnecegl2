package examen;


import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Observer;

import javax.swing.*;
public class vue1 extends JPanel implements observer {
	JTextField j1=new JTextField();;
	 JLabel l1=new JLabel("Nombre=");
	  
	    JButton tb=new JButton("modifier");

nombre f;
static controlvue1 ctrl;

public  void setctrlvue1 ( controlvue1 ctrl1) {
	ctrl=ctrl1;
	this.tb.addActionListener(ctrl);	
}
public vue1 ( nombre f) {
	this.f=f;
	f.add( this);
	
this.setLayout(null);
this.setSize(new Dimension(100,100));

l1.setBounds(10, 10,80, 40);
	this.add(l1);
	tb.setBounds(90, 10, 100, 40);
	this.add(tb);
	j1.setBounds(180, 10, 80, 40);
	this.add(j1);
	
}

   
   
   
   
   
  public String getchamps1() {
	  System.out.println("eeeeeeeeeee");
	  return j1.getText();
  }
  
  
@Override
public void update() {
	// TODO Auto-generated method stub
	
}
}