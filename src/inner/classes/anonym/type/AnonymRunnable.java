package inner.classes.anonym.type;

public class AnonymRunnable {
	
	public AnonymRunnable() {
		
		Runnable r = new Runnable() {
			public void run() {
				for(int i = 1; i <= 5; i++) {
					System.out.println(i);
				}
			}
		};
		new Thread(r).start();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnonymRunnable ar = new AnonymRunnable();
	}

}
