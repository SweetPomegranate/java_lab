package org.example;

public class ITCompanyBuilderImpl implements ITCompanyBuilder {

    private ITCompany company = new ITCompany();

    @Override
    public ITCompanyBuilder setName(String name) {
        company.setName(name);
        return this;
    }

    @Override
    public ITCompanyBuilder setAge(int age) {
        company.setAge(age);
        return this;
    }

    @Override
    public ITCompanyBuilder setAddress(String address) {
        company.setAddress(address);
        return this;
    }

    @Override
    public ITCompanyBuilder setIndustryType(String type) {
        company.setIndustryType(type);
        return this;
    }

    @Override
    public ITCompanyBuilder setEmployeeCount(int count) {
        company.setEmployeeCount(count);
        return this;
    }

    @Override
    public ITCompany build() {
        return company;
    }
}
