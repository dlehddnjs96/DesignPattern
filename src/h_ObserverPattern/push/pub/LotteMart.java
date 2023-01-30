package h_ObserverPattern.push.pub;

import h_ObserverPattern.push.sub.Customer;

import java.util.ArrayList;
import java.util.List;

public class LotteMart implements Mart {

    // 고객명단
    private List<Customer> customerList = new ArrayList<>();

    @Override
    public void add(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public void remove(Customer customer) {
        customerList.remove(customer);
    }

    @Override
    public void received() {
        try {
            for(int i = 0; i < 7; i++) {
                System.out.println(".");
                Thread.sleep(1000);
            }
            notify("롯데 상품입고");
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void notify(String msg) {
        customerList.forEach((customer)->{
            customer.update(msg);
        });
    }
}
