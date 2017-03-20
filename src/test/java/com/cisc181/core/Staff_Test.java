package com.cisc181.core;

import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;


public class Staff_Test {

	static ArrayList<Staff> staff1 = new ArrayList<Staff>();
	static Staff Staff1;
	
	
	
	public static Date newDate(int yearr, int month, int day) {
		Calendar data = Calendar.getInstance();
		data.set(yearr, month, day);
		return data.getTime();
	}

	@BeforeClass

	public static void setup() throws PersonException {
		staff1.add( new Staff("Zhu", "Yi", "Man", newDate(1999, 12, 12), "Newark", "(302)-530-1111",
				"zhuyi@udel.edu", "T",  1,5000, newDate(2017, 7, 7), eTitle.MR));

		staff1.add(new Staff("Zhu", "Yii", "Man1", newDate(1999, 11, 11), "Newark", "(302)-530-2222",
				"zhuyi@udel.edu", "T",  2,0000, newDate(2017, 6, 6), eTitle.MR));

		staff1.add(new Staff("Zhu", "Yiii", "Man2", newDate(1999, 10, 10), "Newark", "(302)-530-3333",
				"zhuyi@udel.edu", "T",  3,15000, newDate(2017, 5, 5), eTitle.MR));

		staff1.add(new Staff("Zhu", "Yiiii", "Man", newDate(1999, 9,9), "Newark", "(302)-530-4444",
				"zhuyi@udel.edu", "T",  4,20000, newDate(2017, 4, 4), eTitle.MR));


		staff1.add(new Staff("Zhu", "Yiiiii", "Man", newDate(1999, 8, 8), "Newark", "(302)-530-5555",
				"zhuyi@udel.edu", "T",  5,25000, newDate(2017, 3, 3), eTitle.MR));
		
	}

	@Test
	public void testStaffSalary() throws PersonException {
		double total = 0;
		for (Staff avgStaff : staff1) {
			total += avgStaff.getSalary();
		}
		double average = total / staff1.size();
		assertEquals(average, 5,15000);
	}

	@Test(expected = PersonException.class)
	public void testDOBException() throws PersonException{
		new Staff("Zhu", "Yi", "Man", newDate(2009, 12, 12), "Newark", "(302)-530-1111",
				"zhuyi@udel.edu", "T",  5,25000, newDate(2017, 7, 7), eTitle.MR);
	}

	@Test(expected = PersonException.class)
	public void  testPhoneNumxception() throws PersonException {
		new Staff("Zhu", "Yiii", "Man2", newDate(1999, 10, 10), "Newark", "(302)-530-3333",
				"zhuyi@udel.edu", "T",  5,25000, newDate(2017, 5, 5), eTitle.MR);
	}
}