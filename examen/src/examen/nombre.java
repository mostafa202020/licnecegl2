package examen;

import java.util.ArrayList;


public class nombre implements observabel{
int f=1;int n;
ArrayList<observer> obs;
public nombre() {
	
	obs=new ArrayList<observer> ();
	
	}
public int getfact() {
	f=1;
	for (int i=1;i<=n;i++) {
		
		f=f*i;
		
	}
	return f;
}

public int getcarré() {
	
	return this.n*this.n;
}
public void add(observer o) {
	// TODO Auto-generated method stub
	obs.add(o);
}

public void setnumber( int n) {
	
	this.n=n;
	notifyall();
}

@Override
public void notifyall() {
	// TODO Auto-generated method stub
for (int i=0;i<obs.size();i++)	
{
	obs.get(i).update();
}
}}