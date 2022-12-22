package collections;

import data.IPlane;
import data.Plane;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PlanesCollection extends Plane {

    //Plane plane = new Plane();
    List<IPlane> planesList;
    private BufferedReader bufferedReader;
    private String output;

    public PlanesCollection() {
        planesList = new ArrayList<>();
    }

    public String getPlane(int iter){
        Plane pl = new Plane();

        switch(iter){
            case 0:
                pl.setModel("Boeing 737-800");
                pl.setWeight(41413);
                pl.setSurface(105.44);
                break;
            case 1:
                pl.setModel("Boeing 747-8");
                pl.setWeight(211700);
                pl.setSurface(576);
                break;
            case 2:
                pl.setModel("Boeing 777-300");
                pl.setWeight(139025);
                pl.setSurface(427.8);
                break;
            case 3:
                pl.setModel("Boeing 787-8");
                pl.setWeight(110000);
                pl.setSurface(325);
                break;
            case 4:
                pl.setModel("Airbus A320");
                pl.setWeight(38328);
                pl.setSurface(122.6);
                break;
            case 5:
                pl.setModel("Airbus A350-1000");
                pl.setWeight(202500);
                pl.setSurface(460);
                break;
            case 6:
                pl.setModel("Airbus A380");
                pl.setWeight(276000);
                pl.setSurface(845);
                break;
            default:
                break;
        }
        this.planesList.add(pl);
        return pl.getModel();
    }



    public String toString() {
        int iter = 0;
        String tmp = "";
        IPlane p;
        for(Iterator it = this.planesList.iterator(); it.hasNext(); tmp = tmp + "Model = " + p.getModel() + " | Weight = " + p.getWeight() + " | Surface = " + p.getSurface() + "\n") {
            p = (IPlane)it.next();
        }
        return tmp;
    }


    public List<IPlane> getPlanesList() {return this.planesList;}


}
