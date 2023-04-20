package EmployeeTable;

public class EmployeeTableImpl implements  EmployeeTableInterface{


    @Override
    public void create(String client, EmployeeObject employeeObj) {

        System.out.println("Employee created");

    }

    @Override
    public void get(String client, int employeeId) {

        System.out.println("Employee with id "+employeeId+" fetched");

    }

    @Override
    public void delete(String client, int employeeId) {

        System.out.println("Employee with id "+employeeId+" deleted");

    }
}
