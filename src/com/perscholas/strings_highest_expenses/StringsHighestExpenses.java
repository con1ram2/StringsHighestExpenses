package com.perscholas.strings_highest_expenses;

import java.util.Arrays;

public class StringsHighestExpenses {

	public static void main(String[] args) {
		String bill = "Bill-25-39-101";
		String tom = "Tom-44-25-71";
		String maria = "Maria-56-23-66";
		String claire = "Claire-99-21-80";
		String maxName = "";
		int maxTotalBill = 0;
		int totalBill = 0;
		
		String[] peopleArr = new String[] {bill, tom, maria, claire};
		String[] s = new String[peopleArr.length];
		
		for (String person: peopleArr) {
			s = person.split("-");
			for (int i = 1; i < s.length; i++) {
				totalBill += Integer.parseInt(s[i]);
				}
			if (totalBill > maxTotalBill) {
				maxTotalBill = totalBill;
				maxName = s[0];
			}
			person += "-" + totalBill;
			totalBill = 0; // reset totalBill
			System.out.println(person);			
		}
		System.out.println(maxName + " has the highest total bills of $" + maxTotalBill + ".");
	}
}
