package p01;

import java.util.function.Consumer;

/*
class Start implements Runnable() {
	public void run () {
		System.out.println("thread");
		
	}
	
}

*/

public class ld_example {

	public static void main(String[] args) {
		Consumer<String> greeting = name ->
		System.out.println(name + "반갑습니다");
		greeting.accept("aa");
		
		public static void say(String name){
			System.out.println(name = "반갑습니다");
		}		
		
		/*
		// TODO Auto-generated method stub
		//Runnable interface thread
		Start start = new Start();
		Thread work = new Thread(start);
		
		work.start();		
		// Runnable start = () ->
		// public void run() {
		Runnable Start = () -> 
		System.out.println("thread");
			
		// }
		start.run();
		*/
		
		
	}

}
