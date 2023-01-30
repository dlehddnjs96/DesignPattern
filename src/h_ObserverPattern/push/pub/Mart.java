package h_ObserverPattern.push.pub;

import h_ObserverPattern.push.sub.Customer;

public interface Mart {
    // 고객 등록
    void add(Customer customer);
    // 고객 해지
    void remove(Customer customer);
    // 상품입고
    void received();
    // 알림
    void notify(String msg);

}
