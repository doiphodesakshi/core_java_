package session_09;

public class Demo {
	public static void main(String[] args) {
		Demo d1= new Demo();
		Demo d2= new Demo();
		Demo d3=d2;
		Demo d4=d1;
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		System.out.println(d3.hashCode());
		System.out.println(d4.hashCode());
	}

}
