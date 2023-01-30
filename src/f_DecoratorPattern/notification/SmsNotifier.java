package f_DecoratorPattern.notification;

public class SmsNotifier implements Notifier{
    private Notifier notifier;
    public SmsNotifier(Notifier notifier) {
        this.notifier = notifier;
    }
    // 빈 생성자를 생성하여 SmsNotifier 클래스를 단독으로도 사용할 수 있도록 한다.
    public SmsNotifier() {
    }

    @Override
    public void send() {
        // 빈 생성자를 통해 null 값이 들어왔을 때는 "이메일알림"만 출력되도록 설정
        if (notifier != null) {
            notifier.send();
        }
        System.out.println("SMS 알림");
    }
}
