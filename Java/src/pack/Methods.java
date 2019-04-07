package pack;

public class Methods {
	
	public static void a1(){
		int a=30; int b=40;
		System.out.println(a*b);
	}
	public void b1(){
		int a=30; int b=80;
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		a1();
		Methods m=new Methods();
		m.b1();
	}

}
