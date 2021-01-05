package com.ycic;

public final class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//createThreadUsingAnonymousClass();	
		createThreadUsingLambdaClass();
	}

	private static void createThreadUsingLambdaClass() {
		// convert runnable functional interface into lambda
		Runnable r = () -> { System.out.println("My task is executing in lambda"); };
		
		Thread thread = new Thread(r);
		thread.start();
	}

	private static void createThreadUsingAnonymousClass() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("My task is executing in a thread");
			}	
		};
		
		Thread thread = new Thread(r);
		thread.start();
	}

}
