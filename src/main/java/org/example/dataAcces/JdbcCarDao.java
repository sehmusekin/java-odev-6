package org.example.dataAcces;

import java.util.ArrayList;
import java.util.List;

import org.example.entities.Car;

public class JdbcCarDao implements CarDao{


    public List<Car> cars;

    public JdbcCarDao() {
        cars = new ArrayList<Car>();
    }


    @Override
    public void add(Car car) {
        cars.add(car);
        System.out.println(car.getBrand() + " JDBC ile başarıyla veritabanına eklendi. ");
    }

    @Override
    public void deleteById(int id) {
        Car carX = null;
        for (Car car : cars) {
            if(id == car.getId()) {
                carX = car;
            }
        }
        cars.remove(carX);
        System.out.println("id'si " + id + " olan " + carX.getBrand() + " JDBC ile veritabanından silindi !");
    }

    @Override
    public void update(Car car) {
        for (Car c : cars) {
            if(car.getId() == c.getId()) {
                System.out.println("Marka: " + c.getBrand() + ", Fiyat: " + c.getUnitPrice());
                c.setBrand(car.getBrand());
                c.setUnitPrice(car.getUnitPrice());
            }
        }
        System.out.println("** GÜNCELLEME BAŞARILI **");
        System.out.println("Marka: " + car.getBrand() + ", Fiyat: " + car.getUnitPrice());
    }

    @Override
    public void getById(int id) {
        for (Car car : cars) {
            if(car.getId() == id) {
                System.out.println(id + " numaralı id'ye sahip araç : " + car.getBrand());
            }
        }
    }

    @Override
    public List<Car> getAll() {
        return cars;
    }

}