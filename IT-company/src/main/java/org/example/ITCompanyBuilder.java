package org.example;

public interface ITCompanyBuilder {
    ITCompanyBuilder setName(String name);
    ITCompanyBuilder setAge(int age);
    ITCompanyBuilder setAddress(String address);
    ITCompanyBuilder setIndustryType(String type);
    ITCompanyBuilder setEmployeeCount(int count);
    ITCompany build();
}
