package examen;

import java.awt.GridLayout;


import javax.swing.JLabel;
import javax.swing.JPanel;


public class vue2 extends JPanel implements observer{
	
	static JLabel fac=new JLabel();
	static JLabel lab=new JLabel("factoriel=");
	nombre model;
	
	public vue2() {
		
	}
	public vue2(nombre o) {
		model=o;
		model.add(this);
		this.setLayout(null);
		lab.setBounds(10, 10,80, 80);
		this.add(lab);
		fac.setBounds(100, 10, 80, 80);
		this.add(fac);
	}//--------------------------
	
    
	
	@Override
	public void update() {
		lab.setText("factoriel="+model.getfact());
	}

}
