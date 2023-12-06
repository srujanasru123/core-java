package com.Abstract.app;

public class ProjectMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
				System.out.println("Running main in ProjectMaker");
				
				Project project=new FinalProject();
				
				project.start();
				project.pause();
				project.resume();
				project.complete();
				project.reportStatus();

		       
		        System.out.println(project.getProjectType());
		        project.assignTeam();
		        project.implement();
		        project.review();
		        project.deliver();

			}

	}


