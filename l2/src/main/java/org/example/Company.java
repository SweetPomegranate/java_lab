package org.example;

public class Company {
    protected String name;
    protected int numberOfEmployees;
    protected double revenue;

    public Company(String name, int numberOfEmployees, double revenue) {
        this.name = name;
        this.numberOfEmployees = numberOfEmployees;
        this.revenue = revenue;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public double getRevenue() {
        return revenue;
    }

    @Override
    public String toString() {
        return "Company{name='" + name + "', numberOfEmployees=" + numberOfEmployees + ", revenue=" + revenue + "}";
    }
}
