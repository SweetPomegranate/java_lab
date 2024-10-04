package org.example;

import java.util.Objects;

public class ITCompany extends Company {
    private String address;
    private String industryType;
    private int employeeCount;

    public String getAddress() {
        return address;
    }

    public String getIndustryType() {
        return industryType;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setIndustryType(String industryType) {
        this.industryType = industryType;
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
        if (!super.equals(o)) return false;
        if (!(o instanceof ITCompany)) return false;
        ITCompany itCompany = (ITCompany) o;
        return employeeCount == itCompany.employeeCount &&
                Objects.equals(address, itCompany.address) &&
                Objects.equals(industryType, itCompany.industryType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), address, industryType, employeeCount);
    }
}
