package pack;

public class Sample {
	
	public Sample(){
		System.out.println("This is COnstructor");
	}
	
	public void a1(){
		System.out.println("This is Method");
	}
	
	public static void main(String[] args) {
		
		Sample s=new Sample();
		s.a1();
		
		
	}

}
