package f_DecoratorPattern.notification;

public class BasicNotifier implements Notifier{
    // 파리미터 생성자가 존재하지 않는 기본생상자로 마지막에 대입되는 객체로 wrapper가 없는 데코레이터이다.
    @Override
    public void send() {
        System.out.println("기본알림");
    }
}
