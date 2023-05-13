package com.demo.srp;
// Employee.java
class Employee {
    private String name;
    private int empId;
    private String jobTitle;

    // constructor
    public Employee(String name, int empId, String jobTitle) {
        this.name = name;
        this.empId = empId;
        this.jobTitle = jobTitle;
    }

    // getter and setter methods

    public String getName() {
        return name;
    }

    public int getEmpId() {
        return empId;
    }

    public String getJobTitle() {
        return jobTitle;
    }
}