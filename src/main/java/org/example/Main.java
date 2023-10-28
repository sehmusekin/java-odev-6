package org.example;

import org.example.business.CarManager;
import org.example.core.logging.FileLogger;
import org.example.core.logging.Logger;
import org.example.core.logging.MailLogger;
import org.example.dataAcces.HibernateCarDao;
import org.example.dataAcces.JdbcCarDao;
import org.example.entities.Car;

public class Main {

    public static void main(String[] args) {


        Car car1 = new Car(1, "Auidi", 1750000,2016 , "A7");
        Car car2 = new Car(2, "Porshe ", 500000,2023,"Taykan");
        Car car3 = new Car(3, "BMW", 100000,2024,"İ7" );
        Car car4 = new Car(4, "Volkswagen", 170000,2016 , "Jeta" );
        Car car5 = new Car(5 , "Toyota" ,1200000,2008,"Corolla");
        Car car6 = new Car(6,"Renault" , 10000,0,"Toros");


        Logger[] loggers = {new FileLogger(), new MailLogger()};
        CarManager carManager = new CarManager(new HibernateCarDao(), loggers);

        carManager.add(car1);
        carManager.add(car2);
        carManager.add(car3);
        carManager.add(car4);
        carManager.add(car5);


        Car car7 = new Car(8, "BMW", 1250000,2024,"İ7" );
        carManager.add(car7);


        carManager.getAll();


        Car car9 = new Car(11, "Mercedes", 1750000,2028,"AMG GT");
        Car car10= new Car(12,"Toyota",2500000,2023,"Corolla");
        carManager.update(car9);
        carManager.update(car10);


        carManager.deleteById(7);


        carManager.getAll();


    }
}