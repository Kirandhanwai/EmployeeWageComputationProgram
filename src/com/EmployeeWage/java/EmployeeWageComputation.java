package com.EmployeeWage.java;

public class EmployeeWageComputation {
		public static final int is_full_time = 1;
		public static final int is_part_time = 2;
		public static final int Employee_wage_per_Hour = 20;
		public static final int number_of_working_day= 20;
		
		public static void main(String[] args) {
			
			int empHrs = 0;
			int empwage = 0;
			int totalempwage = 0;
			
			for (int day = 0; day < number_of_working_day; day++) {
			int empcheck = (int) Math.floor(Math.random()*100) % 3;
			switch (empcheck) {
			
				case is_full_time:
					empHrs = 8;
					break;
			
				case is_part_time:
			    	empHrs = 4;
			    	break;
			
				default:
					empHrs = 0;
				}
			empwage = empHrs * Employee_wage_per_Hour;
			    System.out.println("empwage: " + empwage);
			}
			System.out.println("Total Emp Wage: " + totalempwage );
			
		}
			
}


