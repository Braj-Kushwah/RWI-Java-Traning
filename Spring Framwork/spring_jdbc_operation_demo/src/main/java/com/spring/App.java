
package com.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;

import com.spring.daoimpl.EmployeeDaoImpl;
import com.spring.entity.Employee;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "program Started.........." );
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        EmployeeDaoImpl dao=context.getBean("employeeDao",EmployeeDaoImpl.class);
        
        //insert data 
        Employee emp=new Employee();
        emp.setId(33);
        emp.setName("Ram");
        emp.setSalary(45000);
        emp.setAddress("Knw");
        int result=dao.insert(emp);
        System.out.println("Employee inserted:"+result);
        
        //delete employee
        int result2=dao.delete(33);
        System.out.println("employee deleted :"+result2);
        
        //update Employee
        Employee emp1=new Employee();
        emp1.setId(33);
        emp1.setName("Raj");
        emp1.setSalary(47000);
        emp1.setAddress("Bpl");
        int result3=dao.update(emp1);
        System.out.println("Employee updated :"+result3);
        
    }
}
