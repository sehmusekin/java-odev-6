package org.example.business;

import org.example.entities.Car;

public interface CarService {


    void add(Car car);

    void deleteById(int id);

    void update(Car car);

    void getById(int id);

    void getAll();

    boolean checkIfExist(Car car);


}
