package data;

import org.w3c.dom.Element;

public class Plane implements IPlane{

    String model, code;
    double Q, S, Czmax;
    double AoA, M;

    public void setModel(String model){this.model = model;}

    public void setWeight(double Q){this.Q = Q;}


    public void setSurface(double S){this.S = S;}

    public void setAngleOfAttack(double AoA){this.AoA = AoA;}

    public void setFactor(double Czmax){this.Czmax = Czmax;}


    public void setCode(String code) {this.code = code;}

    public String getModel(){return this.model;}

    public double getWeight(){return this.Q;}


    public double getSurface(){return this.S;}

    public double getAngleOfAttack(){return this.AoA;}


    public double getFactor(){return this.Czmax;}

    public String getCode() {
        return this.code;
    }

    @Override
    public String toString() {
        return this.model;
    }




}
