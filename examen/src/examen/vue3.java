package examen;



import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class vue3 extends JPanel implements observer{
	JPanel f=null;
	nombre model;
	JLabel car=new JLabel("");
	
	static JLabel lab=new JLabel("carré=");
	public vue3() {
		
	}
	public vue3(nombre o) {
		model=o;
		model.add(this);
		this.setLayout(null);
		lab.setBounds(10, 10,80, 80);
		this.add(lab);
		car.setBounds(100, 10, 80, 80);
		this.add(car);
		
	}//--------------------------
	
    
	@Override
	public void update() {
		lab.setText("carré="+model.getcarré());
	}

}
