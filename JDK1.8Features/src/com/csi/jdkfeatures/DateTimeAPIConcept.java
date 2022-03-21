package com.csi.jdkfeatures;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class DateTimeAPIConcept {
	public static void main(String[] args) {

		System.out.println("\n JDK 1.7 Date: "+new Date());
		
		System.out.println("\n JDK 1.8 Local Date: "+ LocalDate.now() );
	
		System.out.println("\n JDK 1.8 Local Date Time: "+ LocalDateTime.now() );
	
	}
}
