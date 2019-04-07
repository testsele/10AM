package pack;

public class Button {
	
	// Creating Variables
	int a; int b; String c;
	// Creating Constructor
	Button(int h, int w, String name){
		a=h; b=w; c=name;	}
	// Creating Methods
	void buttonCreate(){ 
		System.out.println("Button " + c + " Created Successfully");
	}
	void clickable(){System.out.println("Button " + c + " is clickable");}
	void doubleclickable(){System.out.println("Button " + c + " is Doubleclickable");}
	void rightclickable(){System.out.println("Button " + c + " is Rightclickable");}

	public static void main(String[] args) {
		Button ok=new Button(40, 60, "OK");
		ok.buttonCreate();ok.clickable();ok.doubleclickable();ok.rightclickable();
		
		Button save=new Button(70, 80, "Save");
		save.buttonCreate();save.clickable();
		
		Button del=new Button(40, 50, "Delete");
		del.buttonCreate();
		
	}
}
