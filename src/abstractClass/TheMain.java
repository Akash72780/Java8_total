package abstractClass;
//fibona series
public class TheMain extends AbsClass1 {

	public static void main(String[] args) {
		
		TheMain obj=new TheMain();
		obj.display();
		int a=0,b=1,c;
		System.out.println(a);
		while(AbsClass1.count-->0) {
			System.out.println(b);
			c=AbsClass1.add(a, b);
			a=b;
			b=c;
		}
		
		obj.show();

	}

	@Override
	public void show() {
		System.out.println("end up fibona series");
		
	}

}
