package org.example;

public class Main {
    public static void main(String[] args) {
        ITCompany techCompany = new ITCompanyBuilderImpl()
                .setName("Tech Solutions")
                .setAge(5)
                .setAddress("123 Tech Lane")
                .setIndustryType("Software Development")
                .setEmployeeCount(50)
                .build();

        ITCompany techCompany2 = new ITCompanyBuilderImpl()
                .setName("Tech Solutions")
                .setAge(5)
                .setAddress("123 Tech Lane")
                .setIndustryType("Software Development")
                .setEmployeeCount(50)
                .build();





        System.out.println(techCompany);
    }
}
