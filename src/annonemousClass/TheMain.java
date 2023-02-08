package annonemousClass;
//fibona series
public class TheMain {

	public static void main(String[] args) {
		
		AbsClass1 obj=new AbsClass1() {	//this class implements AbsClass but don't have any name
			
			@Override
			public void show() {
				System.out.println("end up fibona series");
				
			}
		};
		
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

}
