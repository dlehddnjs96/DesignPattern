package h_ObserverPattern.push.sub;

public class Cus3 implements Customer{
    @Override
    public void update(String msg) {
        System.out.println("손님3 알림 : " + msg);
    }
}
