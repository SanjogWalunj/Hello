package com.csi.jdkfeatures;

import java.util.Optional;

public class OptionalClassConcept {
	public static void main(String[] args) {

		
		String companyName="CSI PUNE";
		

		Optional<String> cName = Optional.ofNullable(companyName);
		
		if(cName.isPresent())// It is used to avoid NullPointerException
		{
			System.out.println(companyName.length());
		}
		else
		{
			System.out.println("NULL");
		}
	}
}
