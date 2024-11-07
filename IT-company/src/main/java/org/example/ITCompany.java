package org.example;

import java.util.Objects;

public class ITCompany {
    private String name;
    private int age;
    private String address;
    private String industryType;
    private int employeeCount;

    // Getters and setters with validation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIndustryType() {
        return industryType;
    }

    public void setIndustryType(String industryType) {
        this.industryType = industryType;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        if (employeeCount < 0) {
            throw new IllegalArgumentException("Employee count cannot be negative");
        }
        this.employeeCount = employeeCount;
    }

    @Override
    public String toString() {
        return "ITCompany{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", industryType='" + industryType + '\'' +
                ", employeeCount=" + employeeCount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ITCompany)) return false;
        ITCompany company = (ITCompany) o;
        return age == company.age &&
                employeeCount == company.employeeCount &&
                Objects.equals(name, company.name) &&
                Objects.equals(address, company.address) &&
                Objects.equals(industryType, company.industryType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, address, industryType, employeeCount);
    }
}
