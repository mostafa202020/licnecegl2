package testadd;

import java.awt.GridLayout;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

public class vue4 implements observer{
	
	static JPanel f = new JPanel(null);
	facture model;
	
	static JLabel lab=new JLabel("total=");
	public vue4() {
		
	}
	public vue4(facture o) {
		model=o;
		model.add(this);
	}//--------------------------
	
    static JLabel j=new JLabel("");
	public static JPanel main1() {
		j.setBounds(10,10,80,30);
	    f.add(j) ;
	   lab.setBounds(130,10,80,30);
		f.add(lab);
	    return f;
	   }
	@Override
	public void update() {
		lab.setText("total="+model.gettotal());
	}

}
