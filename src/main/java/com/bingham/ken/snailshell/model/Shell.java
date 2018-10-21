package com.bingham.ken.snailshell.model;

import java.util.List;

public class Shell {

    List<Double> listOfXAngles;
    List<Double> listOfYAngles;
    List<Double> listOfZAngles;

    public Shell(List<Double> listOfXAngles, List<Double> listOfYAngles, List<Double> listOfZAngles) {
        this.listOfXAngles = listOfXAngles;
        this.listOfYAngles = listOfYAngles;
        this.listOfZAngles = listOfZAngles;
    }

    public List<Double> getListOfXAngles() {
        return listOfXAngles;
    }

    public void setListOfXAngles(List<Double> listOfXAngles) {
        this.listOfXAngles = listOfXAngles;
    }

    public List<Double> getListOfYAngles() {
        return listOfYAngles;
    }

    public void setListOfYAngles(List<Double> listOfYAngles) {
        this.listOfYAngles = listOfYAngles;
    }

    public List<Double> getListOfZAngles() {
        return listOfZAngles;
    }

    public void setListOfZAngles(List<Double> listOfZAngles) {
        this.listOfZAngles = listOfZAngles;
    }
}
