package defaultInterface;

public class TheMain implements Default1,Default2 {

	public static void main(String[] args) {
		TheMain obj=new TheMain();
		obj.show();
	}
	
	public void show() {
		Default2.super.show();
	}

}
