package pack;

public class Student {
	
	int a; int b; int m3;
	
	Student(int m1, int m2){
		a=m1; b=m2;
	}
	Student(int m1, int m2, int m3){
		a=m1; b=m2; this.m3=m3;
	}
	
	void total(){System.out.println(a+b);	}
	void percentage(){System.out.println((a+b)/2);}
	void total1(int internals){System.out.println(a+b+m3+internals);	}
	void percentage1(){System.out.println((a+b+m3)/3);}
	
	public static void main(String[] args) {
		Student s=new Student(60, 100);
		s.total();s.percentage();
		
		Student s1=new Student(60, 80);
		s1.total();s1.percentage();
		
		Student s2=new Student(80,60,40);
		s2.total1(20);s2.percentage1();
		
		
		
		
	}

}
