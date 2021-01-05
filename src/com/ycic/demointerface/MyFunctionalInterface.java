package com.ycic.demointerface;

@FunctionalInterface
public interface MyFunctionalInterface {
	void m1();			
	
	// can only have one abstract method
	//void m18();
	
	default void m2() {
		System.out.println("Default method 1");
	}
	
	default void m3() {
		System.out.println("Default method 2");
	}
	
	static void m4() {
		System.out.println("Static method 1");
	}
}
