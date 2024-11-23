package encapsulation;

public class human {
	public static void main (String[]args) {
		man obj= new man();
		obj.age=20;
		obj.name="pradeep";
		System.out.println(obj.age);
		System.out.println(obj.name);
	}

}
class man{
	int age;
	String name;
}
