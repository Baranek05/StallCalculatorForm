package collections;

import data.AngleOfAttack;
import data.IPlane;
import data.Plane;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AoACollection {

    List<AngleOfAttack> AoAList;
    public AoACollection() {
        AoAList = new ArrayList<>();
    }


    public double getCzmax(int iter){
        AngleOfAttack angle = new AngleOfAttack();

        switch(iter){
            case 0:
                angle.setAngleOfAttack(0);
                angle.setFactor(0.55);
                break;
            case 1:
                angle.setAngleOfAttack(5);
                angle.setFactor(1.05);
                break;
            case 2:
                angle.setAngleOfAttack(10);
                angle.setFactor(1.45);
                break;
            case 3:
                angle.setAngleOfAttack(15);
                angle.setFactor(1.7);
                break;
            case 4:
                angle.setAngleOfAttack(20);
                angle.setFactor(1.65);
                break;
            case 5:
                angle.setAngleOfAttack(25);
                angle.setFactor(1.45);
                break;
            default:
                break;
        }
        this.AoAList.add(angle);
        return angle.getAngleOfAttack();
    }

    public String toString() {
        int iter = 0;
        String tmp = "";
        IPlane angle;
        for(Iterator it = this.AoAList.iterator(); it.hasNext(); tmp = tmp + "AngleOfAttack = " + angle.getAngleOfAttack() + " | Factor = " + angle.getFactor() + "\n") {
            angle = (IPlane)it.next();
        }
        return tmp;
    }

    public List<AngleOfAttack> getAoAList() {return this.AoAList;}

    public AngleOfAttack getFactorByAngleOfAttack(AngleOfAttack AoA){
        Iterator it = this.AoAList.iterator();
        AngleOfAttack angle;
        do {
            if (!it.hasNext()) {
                return null;
            }
            angle = (AngleOfAttack) it.next();
        } while(!AoA.equals(angle));
        return angle;
    }
}
