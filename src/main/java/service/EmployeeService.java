package service;

import model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    static  List<Employee> employees = new ArrayList<>();
    static {

        employees.add(new Employee("Mung","Nam Dinh","0949288546"));
        employees.add(new Employee("Hung","Nam Dinh","0949288541"));
        employees.add(new Employee("Manh","Nam Dinh","0949288542"));
        employees.add(new Employee("Linh","Nam Dinh","0949288543"));
    }
    public List<Employee> findAll(){
        return employees;
    }
    public void create(Employee employee){
        employees.add(employee);
    }
}
