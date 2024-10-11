package org.example;

import java.util.*;
import java.util.stream.Collectors;

class ITcompanyService {

    //працівників > зазначеної
    public List<ITcompany> findCompaniesWithMoreEmployees(List<ITcompany> companies, int employeeCount) {
        return companies.stream()
                .filter(company -> company.getNumberOfEmployees() > employeeCount)
                .collect(Collectors.toList());
    }

    //пошук за назвою
    public Optional<ITcompany> findCompanyByName(List<ITcompany> companies, String name) {
        return companies.stream()
                .filter(company -> company.getName().equalsIgnoreCase(name))
                .findFirst();
    }

    // сортування за виручкою
    public List<ITcompany> sortByRevenue(List<ITcompany> companies) {
        return companies.stream()
                .sorted(Comparator.comparingDouble(Company::getRevenue).reversed())
                .collect(Collectors.toList());
    }

    //середня кількость працівників
    public double getAverageNumberOfEmployees(List<ITcompany> companies) {
        return companies.stream()
                .mapToInt(Company::getNumberOfEmployees)
                .average()
                .orElse(0);
    }

    //всі нази компаній
    public List<String> getCompanyNames(List<ITcompany> companies) {
        return companies.stream()
                .map(Company::getName)
                .collect(Collectors.toList());
    }
}

