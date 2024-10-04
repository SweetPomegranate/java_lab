package org.example;

/**
 * Interface for building ITCompany instances.
 */
interface ITCompanyBuilder {
    ITCompanyBuilder setName(String name);
    ITCompanyBuilder setAge(int age);
    ITCompanyBuilder setAddress(String address); // Додаємо новий метод
    ITCompanyBuilder setIndustryType(String type); // Додаємо новий метод
    ITCompanyBuilder setEmployeeCount(int count); // Додаємо новий метод
    ITCompany build();
}
