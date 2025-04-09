package Inheritance;

public class SingleChild extends SingleParent{
	public void display1()
	{
		System.out.println("This is the child");
	}
	public static void main(String[] args) {
		SingleChild obj=new SingleChild();
		obj.diplay();
		obj.display1();
		

	}


}
