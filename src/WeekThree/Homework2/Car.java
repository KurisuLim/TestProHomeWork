package WeekThree.Homework2;

import java.util.*;

public class Car {

    private String country;
    private String model;
    private String maker;

    //Custom getter and Setter
    public String getCarInfo(){
        return "Country: " + getCountry() + "\n" +
                "Model: " + getModel() + "\n" +
                "Maker: " + getMaker() + "\n";
    }

    //getter methods
    public String getCountry() {
        return country;
    }

    public String getModel() {
        return model;
    }

    public String getMaker() {
        return maker;
    }

    //setter method
    public void setCountry(String newCountry) {
        country = newCountry;
    }

    public void setModel(String newModel){
        model = newModel;
    }

    public void setMaker(String newMaker){
        maker = newMaker;
    }
}
