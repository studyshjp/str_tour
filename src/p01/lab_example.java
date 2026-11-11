package p01;

public class lab_example extends lab {
	
	interface LabAction {
		void run();
		}
/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		void run();
*/
		
		
		class WelcomeAction implements LabAction {
			@Override
			public void run() {
				System.out.println("연구소에 오신 것을 환영합니다!");
			}
			}
		
			public class AnonymousExample {
			public static void main(String[] args) {
			
			// 1. class 
			// 2. anonymous class / 람다식	
				
				/*
				LabAction action = new LabAction {
				@Override
				public void run() {
					System.out.println("연구소에 오신 것을 환영합니다!");
				
				}
				
				 }
				 */
			// 3. 람다식
			LabAction action = () -> System.out.println("환영합니다");
			
			
			// LabAction action = new WelcomeAction();
			// LabAction run() 실행
			// action.run();
				
			}
			}
		
	}

// }
