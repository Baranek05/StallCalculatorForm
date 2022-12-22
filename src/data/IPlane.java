package data;

public interface IPlane
{

    void setModel(String model);

    //void setDensity(double ro);

    void setWeight(double Q);

    void setSurface(double S);

    void setAngleOfAttack(double AoA );

    void setFactor(double Czmax);

    //void setMass(double M);

    void setCode(String code);

    String getModel();

    //double getDensity();

    double getWeight();

    double getSurface();

    double getAngleOfAttack();

    double getFactor();

    //double getMass();

    String getCode();

    //getPlanesList();


}
