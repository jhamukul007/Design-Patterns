package com.patters.proxy;

import java.util.List;

public interface System {
    void notifyOnLeave(Employee emp);
    void autoProjectAllocation(Employee emp, List<Project> projects);
}
