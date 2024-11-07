package org.example;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {

            Employee emp1 = new Employee("John Doe", "Developer", 60000);
            Employee emp2 = new Employee("Jane Smith", "Manager", 80000);


            Department department = new Department("IT Department");
            department.addEmployee(emp1);
            department.addEmployee(emp2);


            JsonEntitySerializer<Department> jsonSerializer = new JsonEntitySerializer<>(Department.class);
            String jsonData = jsonSerializer.serialize(department);
            System.out.println("Serialized JSON Data: \n" + jsonData);


            File jsonFile = new File("department.json");
            jsonSerializer.writeToFile(department, jsonFile);


            Department readJsonDepartment = jsonSerializer.readFromFile(jsonFile);
            System.out.println("Deserialized Department from JSON: \n" + readJsonDepartment);


            YamlEntitySerializer<Department> yamlSerializer = new YamlEntitySerializer<>(Department.class);
            String yamlData = yamlSerializer.serialize(department);
            System.out.println("Serialized YAML Data: \n" + yamlData);

           
            File yamlFile = new File("department.yaml");
            yamlSerializer.writeToFile(department, yamlFile);


            Department readYamlDepartment = yamlSerializer.readFromFile(yamlFile);
            System.out.println("Deserialized Department from YAML: \n" + readYamlDepartment);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
