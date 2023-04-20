package ProxyPattern;

import EmployeeTable.EmployeeObject;
import EmployeeTable.EmployeeTableProxy;

public class Main {
    public static void main(String[] args) {

        EmployeeTableProxy proxy = new EmployeeTableProxy();

        proxy.create("admin", new EmployeeObject(1234));
        proxy.get("admin",1234);
        proxy.delete("admin", 1234);
    }
}