package testadd;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.*;

import javax.swing.*;
import javax.swing.DefaultListModel;

public class vue2 extends JFrame implements observer{
	static JPanel f = new JPanel(new GridLayout(4, 2));
	facture model;
	static DefaultListModel<String> m=new DefaultListModel();
	static JList liste = new JList(m);
	public vue2() {
		
	}
	public vue2(facture o) {
		model=o;
		model.add(this);
	}
	
    static JLabel j=new JLabel();
	public static JPanel main1() {
	      
	    f.add(j) ;   
		f.add(liste);
	    return f;
	   }
	@Override
	public void update() {
		m.removeAllElements();
ArrayList<item> a=((facture) model).getitems();
		
		for (item i:a) {
			String s1=String.valueOf(i.n);
			String s2=i.des;;
			String s3=String.valueOf(i.qte);
			String s4=String.valueOf(i.price);
			m.addElement(s1+s2+s3+s4);
	
		}
		
		 liste.setModel(m);	
		
	}
	

}
