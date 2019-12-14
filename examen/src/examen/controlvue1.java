package examen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class controlvue1 implements ActionListener  {
vue1 v1;
nombre f;
	public controlvue1( vue1 v, nombre f) {
		this.f=f;
	v1=v;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrr");
		
		//--item(int a, String des, int qte, double prix)
		// TODO Auto-generated method stub
	int  s1=Integer.parseInt(v1.getchamps1());
	
	
	
	
	f.setnumber(s1);
	}

}
