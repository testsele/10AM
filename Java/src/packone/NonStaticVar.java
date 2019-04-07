package packone;

public class NonStaticVar {
	
	public int a=30; public int b=40;
	
	public static void main(String[] args) {
		
		NonStaticVar n=new NonStaticVar();
		System.out.println(n.a*n.b);
	}

}
