package sr.unasat.traffics;

import java.util.Objects;
import java.util.PriorityQueue;

public class CarList {
    private String carName;
    private double priority;

    public CarList(String carName, double priority) {
        this.carName = carName;
        this.priority = priority;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public double getPriority() {
        return priority;
    }

    public void setPriority(double priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarList carList = (CarList) o;
        return Double.compare(carList.priority, priority) == 0 &&
                Objects.equals(carName, carList.carName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName, priority);
    }

    @Override
    public String toString() {
        return "CarList{" +
                "carName='" + carName + '\'' +
                ", priority=" + priority +
                '}';
    }

    //Vergelijkt de auto's prioriteiten met elkaar
    public int compareTo(CarList car) {
        if (this.getPriority() > car.getPriority()) {
            return 1;
        } else if (this.getPriority() < car.getPriority()) {
            return -1;
        } else {
            return 0;
        }
    }

}