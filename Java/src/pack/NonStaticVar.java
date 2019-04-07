package pack;

public class NonStaticVar {
	
	public int a=50; public int b=60;
	
	public static void main(String[] args) {
		
		NonStaticVar n=new NonStaticVar();
		System.out.println(n.a*n.b);
	}

}
