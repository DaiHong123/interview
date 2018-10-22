package dh.proxy;

/**
 * @Description: $description$
 * @Author: daihong
 * @Date: Created in  2018/10/17
 */
public class BuyHouseProxy implements BuyHouse {
    private BuyHouse buyHouse;
    public BuyHouseProxy(final BuyHouse buyHouse){
        this.buyHouse = buyHouse;
    }
    @Override
    public void buyHouse() {
        System.out.println("买房前准备");
        buyHouse.buyHouse();
        System.out.println("买房后装修");
    }
}
