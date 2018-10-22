package dh.fifth;

/**
 * @Description: $description$
 * @Author: daihong
 * @Date: Created in  2018/10/17
 */
public class Drive {
    public static Car driverCar(String s) throws Exception{
        if(s.equals("Benz")){
            return new Benz();
        }else if(s.equals("Bmw")){
            return new Bmw();
        }else{
            throw new Exception();
        }
    }
}
