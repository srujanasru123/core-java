package com.association.applicatons.rule;

import com.association.applicatons.Education;

public class University {
	private Education education;
	public void skill()
	{
		System.out.println("invoking skill in University");
		this.education.skill();
	}
	public void setEducation(Education education)
	{
		System.out.println("invoking setEducation in University");
		this.education=education;
	}
}
