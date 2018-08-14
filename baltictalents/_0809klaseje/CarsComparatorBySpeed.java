package lt.baltictalents._0809klaseje;

import java.util.Comparator;

class CarsComparatorBySpeed implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        return car1.getMaxSpeed() - car2.getMaxSpeed();
    }
}