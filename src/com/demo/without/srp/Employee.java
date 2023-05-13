package com.demo.without.srp;

// Employee.java
class Employee {
    private String name;
    private int empId;
    private String jobTitle;

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

    // method for calculating salary
    public double calculateSalary() {
        // ... logic to calculate salary based on employee information
        return 100;
    }
    // method for managing attendance
    public void manageAttendance() {
        // ... logic to manage attendance for the employee
    }

    // method for generating report
    public void generateReport() {
        // ... logic to generate report for the employee
    }
}
