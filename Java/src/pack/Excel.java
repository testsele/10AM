package pack;

public class Excel {
	
	public static void openSheet(String sname){		
		System.out.println("Sheet " + sname + " Opened Successfully");		
	}
	public static void openSheet(int snumber){
		System.out.println("Sheet " + snumber + " Opened Successfully");
	}
	public static void main(String[] args) {
		
		openSheet("abcd");
		openSheet("xyz");
		openSheet("klmn");
		openSheet(67);
		openSheet(11);
		openSheet("mnop");
	}

}
