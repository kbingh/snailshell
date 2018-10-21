package com.bingham.ken.snailshell.service;

import com.bingham.ken.snailshell.model.Shell;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShellService {

    double uMin = 0.00;
    double uMax = 6.28;
    double uStep = 0.32;

    double vMin = 0.00;
    double vMax = 12.57;
    double vStep = 0.128;

    /**
     * This function plots the points of a snail shell x y z axis
     * @return
     */
    public Shell getListOfAngles(){

        double u = uMin;
        double v = vMin;

        List<Double> xAngleList = new ArrayList<>();
        List<Double> yAngleList = new ArrayList<>();
        List<Double> zAngleList = new ArrayList<>();

        while(u <= uMax){

            while(v <= vMax) {
                double xAngle = cos(v)*(1+cos(u))*sin(v/8);
                xAngleList.add(xAngle);

                double yAngle = sin(u)*sin(v/8)+cos(v/8)*1.5;
                yAngleList.add(yAngle);

                double zAngle = sin(v)*(1+cos(u))*sin(v/8);
                zAngleList.add(zAngle);

                v += vStep;
            }
            u += uStep;
        }
        return new Shell(xAngleList, yAngleList, zAngleList);
    }

    private Double sin( double val ){

        return Math.sin( val );
    }

    private Double cos( double val ){

        return Math.cos( val );
    }
}
