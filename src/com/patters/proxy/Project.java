package com.patters.proxy;

public class Project {
    private Integer projectId;
    private String name;
    private String location;
    private Integer availablePosition;

    public Project(Integer projectId, String name, String location) {
        this.projectId = projectId;
        this.name = name;
        this.location = location;
        this.availablePosition = 50;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public Integer getAvailablePosition() {
        return availablePosition;
    }

    public void reduceAvailablePosition() {
        this.availablePosition = this.availablePosition-1;
    }
}
