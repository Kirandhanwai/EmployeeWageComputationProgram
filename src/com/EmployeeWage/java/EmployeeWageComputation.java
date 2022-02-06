package com.EmployeeWage.java;

public class EmployeeWageComputation {
	public static void main(String[] args) {
		int is_full_time = 1;
		double empcheck = Math.floor(Math.random() * 100) % 2;
	if ( empcheck == is_full_time )
				System.out.println("Employee is Presnet");
	else
				System.out.println("Employee is Absent");
			
	}
}
