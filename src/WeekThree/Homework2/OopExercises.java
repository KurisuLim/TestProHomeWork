package WeekThree.Homework2;

import java.util.ArrayList;
import java.util.List;

public class OopExercises {
    /*
        Week 3 Homework 2 – OOP Exercises.

        Part 1
        Create a Car class.
        Create the following attributes:
        Country of car
        Model
        Maker

        Create methods:
        Set country – should set a country for car object
        Set model – should set a model for car object
        Set maker – – should set a maker for car objectGet country – Should return country of car
        Get model – Should return model of car
        Get maker – – Should return maker of car

        Part 2

        Create 3 cars objects
        Audi, bmw, audi
        set parameters to them and print country, model and maker

        Upload in txt file link to you Pull Request

        Part 3
        (Self Challenge)
        * Create a Class outside the main Class file
        * Practice Encapsulation, getter and setter
        * Use what you learned so far
    */

    public static void main(String[] args){
        // Solution
        Car audi = new Car();
        audi.setCountry("United States");
        audi.setModel("Audi Sports");
        audi.setMaker("Audi");
        System.out.println(audi.getCarInfo());

        Car bmw = new Car();
        bmw.setCountry("United Kingdom");
        bmw.setModel("The BMW 3 Series Gran Turismo");
        bmw.setMaker("BMW");
        System.out.println(bmw.getCarInfo());

        Car honda = new Car();
        honda.setCountry("Japan");
        honda.setModel("Civic");
        honda.setMaker("Honda");
        System.out.println(honda.getCarInfo());

        //Encapsulation Practice
        System.out.println("\n\nEncapsulation Testing:\n\n");
        myCar();
    }

    public static void myCar(){
        String[] country = {"United States", "Germany", "Japan"};
        String[] models = {"Everest", "Beetle", "Toyota"};
        String[] makers = {"Ford", "Volkswagen", "Corolla Hybrid"};

        List<Car> new_car = new ArrayList<>();

        for(int i = 0; i < makers.length; i++){
            Car car_type = new Car();
            car_type.setCountry(country[i]);
            car_type.setModel(models[i]);
            car_type.setMaker(makers[i]);
            new_car.add(car_type);
        }

        for(Car myCar : new_car){
            System.out.println(myCar.getCarInfo());
        }

    }
}
