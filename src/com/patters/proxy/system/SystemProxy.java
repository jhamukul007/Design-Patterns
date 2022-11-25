package com.patters.proxy.system;

import com.patters.proxy.Employee;
import com.patters.proxy.Project;
import com.patters.proxy.System;

import java.util.List;

public class SystemProxy implements System {
    System system;

    public SystemProxy() {
        this.system = new SystemImp();
    }

    @Override
    public void notifyOnLeave(Employee emp) {
        system.notifyOnLeave(emp);
    }

    @Override
    public void autoProjectAllocation(Employee emp, List<Project> projects) {
        java.lang.System.out.println("You can't access auto project project allocation");
        //system.autoProjectAllocation(emp, projects);

    }

}
