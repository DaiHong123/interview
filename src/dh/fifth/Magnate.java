package dh.fifth;

/**
 * @Description: $description$
 * @Author: daihong
 * @Date: Created in  2018/10/17
 */

public class Magnate {
    public static void main(String[] args){
        try {
            Car car = Drive.driverCar("Benz");
            car.drive();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
