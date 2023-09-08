public class ThreadDemo {
	public static void main(String[] args) {
		Runnable td=()->{
			try{
				for (int i=0;i<5;i++)
					System.out.println(i+" "+Thread.currentThread().getName());
			}
			catch(Exception e){}
		};
		Thread t=new Thread(td);
		t.start();
		try{
		for (int i=0;i<5;i++)
			System.out.println(i+" "+Thread.currentThread().getName());
		}
		catch(Exception e){}
	}

}
