package counting;

import data.AngleOfAttack;
import data.IPlane;

public interface ICountStallSpeed {
    public double countStallSpeed(IPlane srcPlane, AngleOfAttack srcAoA, double M, double ro);
}
