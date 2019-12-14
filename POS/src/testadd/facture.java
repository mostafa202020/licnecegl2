package testadd;

import java.util.*;

public class facture implements observable{
ArrayList<item> a;
ArrayList<observer> obs;
public facture() {
	
	obs=new ArrayList<observer> ();
	a=new ArrayList<item>();
	}
public double gettotal() {
	double total=0;
	for (item i:a) {
		
		total=total+i.price*i.qte;
		
	}
	return total;
}

public void setitem(int i, item p) {
	
	a.set(i,p);
}

public ArrayList<item>  getitems() {
	
	return a;
}
public void additem( item p) {
	
	a.add(p);
	notifyall();
}


@Override
public void add(observer o) {
	// TODO Auto-generated method stub
	obs.add(o);
}
@Override
public void notifyall() {
	// TODO Auto-generated method stub
for (int i=0;i<obs.size();i++)	
{
	obs.get(i).update();
}
}

}

