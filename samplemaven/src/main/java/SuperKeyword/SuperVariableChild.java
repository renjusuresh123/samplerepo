package SuperKeyword;

public class SuperVariableChild extends SuperVariable {
String s="Blue";
public void display()
{
System.out.println(s);
System.out.println(super.s);
}
	public static void main(String[] args) {
		SuperVariableChild obj=new SuperVariableChild();
		obj.display();
	}

}
