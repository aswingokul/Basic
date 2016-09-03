<<<<<<< HEAD
/**
 * 
 */
package pkg_Threads;

import java.util.Vector;

/**
 * @author Aswin
 *
 */
public class Producer implements Runnable{
	static final int MAX_QUEUE = 5;
	private Vector<String> msgs = new Vector<String>(); 
	
	public void run(){
		System.out.println("*********Running Producer Thread**********");
		try{
			while(true){
				putMessage();
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
	public synchronized void putMessage() throws InterruptedException{
		while(msgs.size() == MAX_QUEUE){
			this.wait();
		}
		msgs.addElement(new java.util.Date().toString());
		System.out.println("Put message");
		this.notifyAll();
	}
	
	public synchronized String getMessage() throws InterruptedException{
		notify();
		while(msgs.size() == 0){
			this.wait();
		}
		String message = msgs.firstElement();
		msgs.removeElement(message);
		return message;
	}
}
=======
/**
 * 
 */
package pkg_Threads;

import java.util.Vector;

/**
 * @author Aswin
 *
 */
public class Producer implements Runnable{
	static final int MAX_QUEUE = 5;
	private Vector<String> msgs = new Vector<String>(); 
	
	public void run(){
		System.out.println("*********Running Producer Thread**********");
		try{
			while(true){
				putMessage();
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
	public synchronized void putMessage() throws InterruptedException{
		while(msgs.size() == MAX_QUEUE){
			this.wait();
		}
		msgs.addElement(new java.util.Date().toString());
		System.out.println("Put message");
		this.notifyAll();
	}
	
	public synchronized String getMessage() throws InterruptedException{
		notify();
		while(msgs.size() == 0){
			this.wait();
		}
		String message = msgs.firstElement();
		msgs.removeElement(message);
		return message;
	}
}
>>>>>>> e1183d48c51150798e555e5c155c1abae0f1ee10
