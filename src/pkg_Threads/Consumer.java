/**
 * 
 */
package pkg_Threads;

/**
 * @author Aswin
 *
 */
public class Consumer implements Runnable{
	Producer prod;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producer pro = new Producer();
		Thread pThread = new Thread(pro,"Producer Thread");
		pThread.start();
		Thread cThread = new Thread(new Consumer(pro),"Consumer Thread");
		cThread.start();
	}
	
	public Consumer(Producer p){
		prod =p;
	}
	
	public void run(){
		try{
			while(true){
				String message = prod.getMessage();
				System.out.println("Got Message: "+ message);
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}
