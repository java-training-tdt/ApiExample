package my.example.controller;

import my.example.entity.Employee;

import java.util.List;

public class EmployeeResponse {

    List<Employee> results;

    public EmployeeResponse(List<Employee> results) {
        this.results = results;
    }

    public List<Employee> getResults() {
        return results;
    }

    public void setResults(List<Employee> results) {
        this.results = results;
    }
}
