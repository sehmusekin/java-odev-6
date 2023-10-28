package org.example.dataAcces;

import java.util.List;

import org.example.entities.Car;

public interface CarDao {


    void add(Car car);

    void deleteById(int id);

    void update(Car car);

    void getById(int id);

    List<Car> getAll();

}