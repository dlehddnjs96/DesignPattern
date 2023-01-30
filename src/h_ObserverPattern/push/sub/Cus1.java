package h_ObserverPattern.push.sub;

public class Cus1 implements Customer{
    @Override
    public void update(String msg) {
        System.out.println("손님1 알림 : " + msg);
    }
}
