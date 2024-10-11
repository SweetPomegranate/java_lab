package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<ITcompany> companies = List.of(
                new ITcompany("TechCorp", 500, 1500000.0),
                new ITcompany("Innovatech", 200, 900000.0),
                new ITcompany("CodeSolutions", 700, 2500000.0)
        );

        ITcompanyService service = new ITcompanyService();

        //сервісні
        System.out.println("Компанії з більш ніж 300 працівниками:");
        service.findCompaniesWithMoreEmployees(companies, 300).forEach(System.out::println);

        System.out.println("\nПошук компанії за назвою 'Innovatech':");
        service.findCompanyByName(companies, "Innovatech").ifPresent(System.out::println);

        System.out.println("\nСортування компаній за виручкою:");
        service.sortByRevenue(companies).forEach(System.out::println);

        System.out.println("\nСередня кількість працівників:");
        System.out.println(service.getAverageNumberOfEmployees(companies));

        System.out.println("\nНазви компаній:");
        service.getCompanyNames(companies).forEach(System.out::println);

        //Comparable
        List<ITcompany> sortedByEmployees = companies.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("\nСортування за кількістю працівників:");
        sortedByEmployees.forEach(System.out::println);

        //Comparator
        List<ITcompany> sortedByName = companies.stream()
                .sorted(Comparator.comparing(ITcompany::getName))
                .collect(Collectors.toList());
        System.out.println("\nСортування за назвою компанії:");
        sortedByName.forEach(System.out::println);

        //виручка > 1000000
        List<ITcompany> highRevenueCompanies = companies.stream()
                .filter(company -> company.getRevenue() > 1000000)
                .collect(Collectors.toList());
        System.out.println("\nКомпанії з виручкою понад 1000000:");
        highRevenueCompanies.forEach(System.out::println);
    }
}