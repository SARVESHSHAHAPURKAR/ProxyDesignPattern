package EmployeeTable;

public class EmployeeTableProxy implements EmployeeTableInterface{

    public EmployeeTableImpl employeeTableImpl = new EmployeeTableImpl();


    @Override
    public void create(String client, EmployeeObject employeeObj) {

        if(client.equalsIgnoreCase("ADMIN")) {
            employeeTableImpl.create(client, new EmployeeObject());
        }

    }

    @Override
    public void get(String client, int employeeId) {

        if(client.equalsIgnoreCase("ADMIN")) {
            employeeTableImpl.get(client, employeeId);
        }

    }

    @Override
    public void delete(String client, int employeeId) {

        if(client.equalsIgnoreCase("ADMIN")) {
            employeeTableImpl.delete(client, employeeId);
        }

    }
}
