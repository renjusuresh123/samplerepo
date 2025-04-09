package SuperKeyword;

public class SuperMethodChild extends SuperMethodParent {
	public void display1()
	{
		super.display();
		System.out.println("SuperMethodChild");
	}
	public static void main(String[] args) {
		SuperMethodChild obj=new SuperMethodChild();
		obj.display1();

	}

}
