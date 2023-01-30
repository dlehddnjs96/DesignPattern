package h_ObserverPattern.polling;

public class Main {
    public static void main(String[] args) {
        // 옵저버 패턴을 사용하여 객체의 상태변화를 감지하여 통지
        // 폴링 방식 : 클라이언트가 서버 상태의 변화가 궁금할 때, 계속 상태를 물어봐야 하는데 이렇게 계속 상태를 물어보는 것
        LotteMart lotteMart = new LotteMart();
        Customer1 customer1 = new Customer1();
        Customer2 customer2 = new Customer2();

        // 다른 쓰레드가 상품을 입고 (5초가 지나야 입고)
        new Thread(()->{
            lotteMart.setValue();
        }).start();

        // 메인 쓰레드 실행 : 5초 후에 상품이 입고 되기 때문에 1초 간격으로 계속 물어봐야 한다.
        // 물어보는 시간이 짧으면 상품이 들어오는 것을 빨리 알 수 있지만 프로그램에 부담이 가고
        // 물어보는 시간이 길면 상품이 들어오는 것을 빨리 알 수 없지만 프로그램에 부담이 덜 간다.
        while (true) {
            try {
                System.out.println("상품이 들어왔나요....?");
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            if (lotteMart.getValue() != null) {
                customer1.update(lotteMart.getValue() + "이 들어왔습니다.");
                customer2.update(lotteMart.getValue() + "이 들어왔습니다.");
                break;
            } else {
                System.out.println("상품이 아직 들어오지 않았습니다.");
            }
        }

    }
}
