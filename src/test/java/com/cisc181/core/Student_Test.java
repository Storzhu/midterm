package com.cisc181.core;

import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	static ArrayList<Student> students = new ArrayList<Student>();
	static ArrayList<Course> course = new ArrayList<Course>();
	static ArrayList<Semester> semester= new ArrayList<Semester>();
	static ArrayList<Section> section = new ArrayList<Section>();
	static ArrayList<Enrollment>fallbuiness=new ArrayList<Enrollment>();
	static ArrayList<Enrollment>fallchemistry=new ArrayList<Enrollment>();
	static ArrayList<Enrollment>fallcomputerl=new ArrayList<Enrollment>();
	static ArrayList<Enrollment>springbusiness=new ArrayList<Enrollment>();
	static ArrayList<Enrollment>springchemistry=new ArrayList<Enrollment>();
	static ArrayList<Enrollment>springcomputer=new ArrayList<Enrollment>();
	
	@BeforeClass
	public static void setup() throws PersonException {
		Course econ = new Course(UUID.randomUUID(),"business",100, eMajor.BUSINESS);
		Course chem = new Course(UUID.randomUUID(),"chemistry",100, eMajor.CHEM);
		Course cisc =new Course(UUID.randomUUID(),"computer",100, eMajor.COMPSI);
		course.add(econ);
		course.add(chem);
		course.add(cisc);
		Calendar c1= Calendar.getInstance();
		c1.set(2016,9,30);
		Calendar c2= Calendar.getInstance();
		c1.set(2017,1,1);
		Semester Fall=new Semester(UUID.randomUUID(),c1.getTime(),c2.getTime());
		Calendar c3= Calendar.getInstance();
		c1.set(2017,2,1);
		Calendar c4= Calendar.getInstance();
		c1.set(2017,8,31);
		Semester Spring=new Semester(UUID.randomUUID(),c3.getTime(),c4.getTime());
		semester.add(Fall);
		semester.add(Spring);
	
		Section fallbuiness =new Section(econ.getCourseID(),Fall.getSemesterID(),UUID.randomUUID(),101);
		Section fallchemistry =new Section(chem.getCourseID(),Fall.getSemesterID(),UUID.randomUUID(),102);
		Section fallcomputer =new Section(cisc.getCourseID(),Fall.getSemesterID(),UUID.randomUUID(),103);
		Section springbusiness =new Section(econ.getCourseID(),Spring.getSemesterID(),UUID.randomUUID(),104);
		Section springchemistry =new Section(chem.getCourseID(),Spring.getSemesterID(),UUID.randomUUID(),105);
		Section springcomputer =new Section(cisc.getCourseID(),Spring.getSemesterID(),UUID.randomUUID(),106);
	
		section.add(fallbuiness);
		section.add(fallchemistry);
		section.add(fallcomputer);
		section.add(springbusiness);
		section.add(springchemistry);
		section.add(springcomputer);
		Calendar dob=Calendar.getInstance();
		dob.set(1997, 12, 3);
		Student stud1= new Student("zhu1", " yi1", "111",dob.getTime(), eMajor.BUSINESS,
				"Simth Hall", "(302)-530-1111", "zhuyi@udel.edu");
		Student stud2= new Student("zhu2", " yi2", "222",dob.getTime(), eMajor.CHEM,
				"Simth Hall", "(302)-530-2222", "zhuyi@udel.edu");
		Student stud3= new Student("zhu3", " yi3", "333",dob.getTime(), eMajor.NURSING,
				"Simth Hall", "(302)-530-3333", "zhuyi@udel.edu");
		Student stud4= new Student("zhu4", " yi4", "444",dob.getTime(), eMajor.COMPSI,
				"Simth Hall", "(302)-530-4444", "zhuyi@udel.edu");
		Student stud5= new Student("zhu5", " yi5", "555",dob.getTime(), eMajor.CHEM,
				"Simth Hall", "(302)-530-5555", "zhuyi@udel.edu");
		Student stud6= new Student("zhu6", " yi6", "666",dob.getTime(), eMajor.BUSINESS,
				"Simth Hall", "(302)-530-6666", "zhuyi@udel.edu");
		Student stud7= new Student("zhu7", " yi7", "777",dob.getTime(), eMajor.PHYSICS,
				"Simth Hall", "(302)-530-7777", "zhuyi@udel.edu");
		Student stud8= new Student("zhu8", " yi8", "888",dob.getTime(), eMajor.COMPSI,
				"Simth Hall", "(302)-530-8888", "zhuyi@udel.edu");
		Student stud9= new Student("zhu9", " yi9", "999",dob.getTime(), eMajor.BUSINESS,
				"Simth Hall", "(302)-530-9999", "zhuyi@udel.edu");
		Student stud10= new Student("zhu0", " yi0", "000",dob.getTime(), eMajor.CHEM,
				"Simth Hall", "(302)-530-0000", "zhuyi@udel.edu");
		students.add(stud1);
		students.add(stud2);
		students.add(stud3);
		students.add(stud4);
		students.add(stud5);
		students.add(stud6);
		students.add(stud7);
		students.add(stud8);
		students.add(stud9);
		students.add(stud10);
		ArrayList<Integer> gradeShet1 = new ArrayList<Integer>();
		gradeShet1.add(98);
		gradeShet1.add(96);
		gradeShet1.add(94);
		gradeShet1.add(92);
		gradeShet1.add(90);
		gradeShet1.add(88);
		gradeShet1.add(86);
		gradeShet1.add(84);
		gradeShet1.add(82);
		gradeShet1.add(80);
		
		ArrayList<Integer> gradeShet2 = new ArrayList<Integer>();
		gradeShet2.add(100);
		gradeShet2.add(96);
		gradeShet2.add(95);
		gradeShet2.add(85);
		gradeShet2.add(75);
		gradeShet2.add(65);
		gradeShet2.add(64);
		gradeShet2.add(63);
		gradeShet2.add(60);
		gradeShet2.add(55);
		
		ArrayList<Integer> gradeShet3 = new ArrayList<Integer>();
		gradeShet3.add(97);
		gradeShet3.add(95);
		gradeShet3.add(92);
		gradeShet3.add(86);
		gradeShet3.add(80);
		gradeShet3.add(72);
		gradeShet3.add(71);
		gradeShet3.add(65);
		gradeShet3.add(60);
		gradeShet3.add(59);
		for (int i = 0; i < students.size();i++)
		{
			
		}

			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		