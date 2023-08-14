package com.Abstract.app;

public class WorkPerson extends Person {
	@Override
    public String getOccupation() {
        return "Chef";
    }

    @Override
    public void study() {
        System.out.println("Person is studying.");
    }

    @Override
    public void celebrateBirthday() {
        System.out.println("Person is celebrating their birthday.");
    }

    @Override
    public void exercise() {
        System.out.println("Person is exercising.");
    }

    @Override
    public void getHome() {
        System.out.println("Person have home.");
    }

}
