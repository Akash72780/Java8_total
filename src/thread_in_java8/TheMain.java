package thread_in_java8;

public class TheMain {
	
	public static void ready() {
		Thread.currentThread().setName("Thread with methor reference");
		for(int i=0;i<5;i++) {
			System.out.println("method thread "+String.valueOf(i));
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// create a thread with lamba interface
		
		Runnable runnable1=()->{
			Thread.currentThread().setName("Thread with lamba");
			for(int i=0;i<5;i++) {
				System.out.println("lamba thread "+String.valueOf(i));
				try {
					Thread.sleep(15);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Runnable runnable2=TheMain::ready;
		
		Thread thread1=new Thread(runnable1);
		Thread thread2=new Thread(runnable2);
		
		thread1.start();
		thread2.start();

	}

}
