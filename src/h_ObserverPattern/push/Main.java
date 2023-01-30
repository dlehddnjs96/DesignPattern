package h_ObserverPattern.push;

import h_ObserverPattern.push.pub.LgMart;
import h_ObserverPattern.push.pub.LotteMart;
import h_ObserverPattern.push.pub.Mart;
import h_ObserverPattern.push.sub.Cus1;
import h_ObserverPattern.push.sub.Cus2;
import h_ObserverPattern.push.sub.Cus3;
import h_ObserverPattern.push.sub.Customer;

public class Main {
    public static void main(String[] args) {
        // 옵저버 패턴을 사용하여 객체의 상태변화를 감지하여 통지
        // 풀 방식 : 클라이언트가 서버 상태의 변화가 궁금할 때, 클라이언트의 목록을 등록하고 상태가 변화 되었을 때 서버가 목록에 등록된 클라이언트에 상태변화를 알려주는 것
        Mart lotteMart = new LotteMart();
        Mart lgMart = new LgMart();
        Customer cus1 = new Cus1();
        Customer cus2 = new Cus2();
        Customer cus3 = new Cus3();

        // 고객등록
        lotteMart.add(cus1);
        lgMart.add(cus1);
        lotteMart.add(cus2);
        lotteMart.add(cus3);

        // 고객등록취소 (lg 상품으로 주문)
        lotteMart.remove(cus2);
        lgMart.add(cus2);

        // 상품입고 (5초 후에 notify 메서드에 상품입고를 알리는 로직이 포함)
        // 동기적 실행이 아닌 동시적 실행을 위해 main 쓰레드로 2개의 쓰레드를 실행
        new Thread(()->{
            lotteMart.received();
        }).start() ;

        new Thread(()->{
            lgMart.received();
        }).start();



    }
}
