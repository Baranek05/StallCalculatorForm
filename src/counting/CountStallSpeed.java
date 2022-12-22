package counting;

import data.AngleOfAttack;
import data.IPlane;

public class CountStallSpeed implements ICountStallSpeed{

    public CountStallSpeed(){}



    @Override
    public double countStallSpeed(IPlane srcPlane, AngleOfAttack srcAoA, double M, double ro)
    {
        return 1.9438444924 * Math.sqrt((2 * (10 * srcPlane.getWeight() + 10 * M)) / (ro * srcPlane.getSurface() * srcAoA.getFactor()));
    }


}
