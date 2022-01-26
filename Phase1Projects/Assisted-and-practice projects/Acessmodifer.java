package project;

public class Acessmodifer {
public int a=10;
private int b=20;
int c=30;
protected int d=40;
public void hello(){
System.out.print(a);
System.out.print(b);
System.out.print(c);
System.out.print(d);

}
}	//public static void main(String[] args) {

class j{
	public static void main(String[] args)
	{
		Acessmodifer out=new Acessmodifer();
		out.hello();
	}
}

