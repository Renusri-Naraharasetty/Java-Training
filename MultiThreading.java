public class MultiThreading extends Thread{
	public static void main(String[] args) {
		MultiThreading thread = new MultiThreading();
		thread.start();
		MultiThreading thread1 = new MultiThreading();
		thread1.start();
		MultiThreading thread3 = new MultiThreading();
		thread3.start();
	}
	@Override 
	public void run() {
		for(int i=0;i<=20;i++) {
			System.out.println(i);
		}
	}
}

//public class MultiThreading implements Runnable {
//    public static void main(String[] args) {
//        MultiThreading runnable=new MultiThreading();
//        Thread thread = new Thread(runnable);
//        thread.start();
//    }
//    @Override
//    public void run(){
//        for(int i=0;i<=20;i++)
//        {
//            System.out.println(i);
//        }
//    }
//}