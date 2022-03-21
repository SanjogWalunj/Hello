package com.csi.jdkfeatures;

@FunctionalInterface//SAM
interface EmpDetails
{
	void get();
	
	
	default void show(){
	//logic
		
	}
	
	default void show(int empId){
		
	}
	
	static void push()
	{
		
	}
	
	static void push(String empName)
	{
		
	}
}
public class FunctionalInterfaceConcept {
	public static void main(String[] args) {

	}
}
