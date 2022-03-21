package com.csi.jdkfeatures;

interface Employee
{
	void get();
}
public class LambadaExpressionConcept {
	public static void main(String[] args) {

		Employee ee = ()->
		{
			System.out.println("Hello");
		};
		
		ee.get();
	}
}
