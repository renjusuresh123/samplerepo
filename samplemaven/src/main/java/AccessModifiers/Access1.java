package AccessModifiers;

public class Access1 {

	public static void main(String[] args) {
		Access1 obj=new Access1();
		obj.display();
		obj.display1();
		obj.display2();
		obj.display3();

	}
public void display()
{
	System.out.println("Public");

}
private void display1()
{
	System.out.println("Private");

}
protected void display2()
{
	System.out.println("Protect");

}
 void display3()
{
	System.out.println("Default");

}

}
