package dh.proxy;

/**
 * @Description: $description$
 * @Author: daihong
 * @Date: Created in  2018/10/17
 */
public class ProxyTest {
    public static void main(String[] args){
        BuyHouse buyHouse = new BuyHouseImpl();
        buyHouse.buyHouse();
        BuyHouseProxy buyHouseProxy = new BuyHouseProxy(buyHouse);
        buyHouseProxy.buyHouse();
    }
}
