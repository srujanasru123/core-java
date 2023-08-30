package com.association.applicatons.rule.boot;

import com.association.applicatons.Education;
import com.association.applicatons.rule.College;
import com.association.applicatons.rule.University;

public class EducationRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("invoking main in EducationRunner");
		Education education=new College();
		University university=new University();
		university.setEducation(education);
		university.skill();
	}

	}


