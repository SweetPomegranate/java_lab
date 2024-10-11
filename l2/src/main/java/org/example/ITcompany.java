package org.example;
class ITcompany extends Company implements Comparable<ITcompany> {

    public ITcompany(String name, int numberOfEmployees, double revenue) {
        super(name, numberOfEmployees, revenue);
    }

    @Override
    public int compareTo(ITcompany other) {
        return Integer.compare(this.numberOfEmployees, other.numberOfEmployees);
    }

    @Override
    public String toString() {
        return "ITcompany{name='" + name + "', numberOfEmployees=" + numberOfEmployees + ", revenue=" + revenue + "}";
    }
}