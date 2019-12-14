package testadd;
import java.awt.event.*;

public class controlvue1 implements ActionListener  {
vue1 v1;
facture f;
	public controlvue1( vue1 v, facture f) {
		this.f=f;
	v1=v;
	}
	public void actionPerformed(ActionEvent arg0) {
		
		//--item(int a, String des, int qte, double prix)
		// TODO Auto-generated method stub
	int  s1=Integer.parseInt(v1.getchamps1());
	String s2=v1.getchamps2();
	int s3=Integer.parseInt(v1.getchamps3());
	double s4=Double.parseDouble(v1.getchamps1());
	
	f.additem(new item(s1,s2,s3,s1));
	}

}
