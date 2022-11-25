package com.patters.proxy;

import com.patters.proxy.system.SystemProxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyRunner {

    public static void main(String[] args) {

        Employee emp = new Employee(1, "Mukul");
        Employee emp1 = new Employee(2, "Rahul");
        List<Project> projects = new ArrayList<>();
        projects.add(new Project(1, "IBM", "Bangalore"));
        projects.add(new Project(2, "Google", "Bangalore"));
        // you can't access SystemImp
        //System system = new SystemImp();
        // SystemProxy working on behalf of SystemImp
        System system = new SystemProxy();
        system.notifyOnLeave(emp);
        system.autoProjectAllocation(emp, projects);
        system.autoProjectAllocation(emp1, projects);
    }

}
