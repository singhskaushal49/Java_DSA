package Lec23;

public class Person_Client {
	public static void main(String[] args) {

		Person p1 = new Person("kausja;", 21);
		Person p2 = new Person("ramu", 32);
		System.out.println(p1.age + "" + p1.name);
		p2.age = -9;

	}
}
