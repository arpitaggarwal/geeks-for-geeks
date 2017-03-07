package com.test.core;

import java.io.FileNotFoundException;

public class ReturnInsideFinally {
	public Integer catchBlock() {

		try {
			throw new RuntimeException();
		} catch (Exception ex) {
			System.out.println("Catch Executed");
			
			/*try {*/
				throw new FileNotFoundException(); // Here it will not complain to either catch or throws at method level, because it is handled in finally block by return statement. If we comment return in finally block than it will complain to either catch it or throws at method level. Also it is checked, if it is unchecked exception it will not complain.
			/*} catch (FileNotFoundException e) {
			//	e.printStackTrace();
				return 5;
			}*/
			
			
		//	return 0;
		} finally {
			System.out.println("Finally Executed");
			return 1;
		}
		
	}

	
}
