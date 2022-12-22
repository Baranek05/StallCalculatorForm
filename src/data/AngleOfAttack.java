package data;

public class AngleOfAttack {
    double AoA, Czmax;

    public void setAngleOfAttack(double AoA) {this.AoA = AoA;}

    public void setFactor(double Czmax){this.Czmax = Czmax;}

    public double getAngleOfAttack(){return this.AoA;}

    public double getFactor(){return this.Czmax;}

    @Override
    public String toString() {
        return String.valueOf(this.AoA);
    }
}
