package Inheritance;

public class ChildB extends HeirarchicalParent{
	public void display2()
	{
		System.out.println("Child B");
	}
	public static void main(String[] args) {
		ChildB obj=new ChildB();
		obj.display();
		obj.display2();

	}

}
