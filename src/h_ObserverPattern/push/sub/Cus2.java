package h_ObserverPattern.push.sub;

public class Cus2 implements Customer{
    @Override
    public void update(String msg) {
        System.out.println("손님2 알림 : " + msg);
    }
}
