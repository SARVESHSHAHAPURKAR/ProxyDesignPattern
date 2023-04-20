package EmployeeTable;

public interface EmployeeTableInterface {

    public void create(String client, EmployeeObject employeeObj);
    public void get(String client, int employeeId);
    public void delete(String client, int employeeId);
}
