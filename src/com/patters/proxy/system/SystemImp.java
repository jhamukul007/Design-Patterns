package com.patters.proxy.system;

import com.patters.proxy.Employee;
import com.patters.proxy.Project;
import com.patters.proxy.System;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SystemImp implements System {

    protected SystemImp() {
    }

    @Override
    public void notifyOnLeave(Employee emp) {
        java.lang.System.out.println("sending leave notification to emp " + emp.getName());
    }

    @Override
    public void autoProjectAllocation(Employee emp, List<Project> projects) {
        Collections.sort(projects, (o1, o2) -> o2.getAvailablePosition() - o1.getAvailablePosition());
        java.lang.System.out.println("emp " + emp.getName() + "has assign to project " + projects.get(0).getName());
        projects.get(0).reduceAvailablePosition();
    }

}
