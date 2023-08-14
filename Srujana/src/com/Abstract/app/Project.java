package com.Abstract.app;

public abstract class Project {
	public void start() {
        System.out.println("Project has starting.");
    }

    public void pause() {
        System.out.println("Project has paused.");
    }

    public void resume() {
        System.out.println("Project has resumed.");
    }

    public void complete() {
        System.out.println("Project has completed.");
    }
    
    public void reportStatus() {
        System.out.println("Project has reported.");
    }

  
    public abstract String getProjectType();
    public abstract void assignTeam();
    public abstract void implement();
    public abstract void review();
    public abstract void deliver();
}
