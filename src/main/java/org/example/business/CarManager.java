package org.example.business;

import org.example.core.logging.Logger;
import org.example.dataAcces.CarDao;
import org.example.entities.Car;

public class CarManager implements CarService{

    private CarDao carDao;
    private Logger[] loggers;


    public CarManager(CarDao carDao, Logger[] loggers) {
        this.carDao = carDao;
        this.loggers = loggers;
    }


    @Override
    public void add(Car car) {
        if(checkIfExist(car)) {
            System.out.println("Araç sisteme eklenemedi ! Bu isimde bir araç zaten bulunmakta.");
            return;
        }else {
            carDao.add(car);
            for (Logger logger : loggers) {
                logger.log(car.getBrand());
            }
        }
    }

    @Override
    public void deleteById(int id) {
        for (Car c : carDao.getAll()) {
            if(id == c.getId()) {
                carDao.deleteById(id);
                return;
            }
        }
        System.out.println("Silme işlemi başarısız ! Bu id'ye ait bir araç bulunamadı.");
    }

    @Override
    public void update(Car car) {
        for (Car c : carDao.getAll()) {
            if(car.getId() == c.getId()) {
                carDao.update(car);
                return;
            }
        }
        System.out.println("Güncelleme işlemi başarısız ! Bu id'ye ait bir araç bulunamadı.");
    }

    @Override
    public void getById(int id) {

        for (Car c : carDao.getAll()) {
            if(id == c.getId()) {
                carDao.getById(id);
                return;
            }
        }
        System.out.println("Bu id'ye ait bir araç bulunamadı !");
    }

    @Override
    public void getAll() {
        System.out.println("~ Tüm Araçların Listesi ~");
        for (Car c : carDao.getAll()) {
            System.out.println("id: " + c.getId() + " | marka: " + c.getBrand() + " | fiyat: " + c.getUnitPrice());
        }
    }

    @Override
    public boolean checkIfExist(Car car) {
        for (Car c : carDao.getAll()) {
            if(car.getBrand().equals(c.getBrand())) {
                return true;
            }
        }
        return false;
    }


}