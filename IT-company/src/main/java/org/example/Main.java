package org.example;

public class Main {
    public static void main(String[] args) {
        ITCompanyBuilderImpl builder = new ITCompanyBuilderImpl();
        ITCompany company = builder
                .setName("Tech Innovations")
                .setAge(10)
                .setAddress("123 Tech Street")
                .setIndustryType("Software Development")
                .setEmployeeCount(200)
                .build();

        // Display the created company
        System.out.println("Created ITCompany: " + company);
    }
}
