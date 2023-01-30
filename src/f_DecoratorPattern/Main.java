package f_DecoratorPattern;

import f_DecoratorPattern.notification.BasicNotifier;
import f_DecoratorPattern.notification.EmailNotifier;
import f_DecoratorPattern.notification.Notifier;
import f_DecoratorPattern.notification.SmsNotifier;

public class Main {
    public static void main(String[] args) {

        // 데코레이터 패턴을 사용하여 같은 인터페이스를 구현하는 클래스들을 여러개 감싸 사용할 수 있다.
        // 기능 확장이 필요할 때 서브클래싱 대신 쓸 수 있는 유연한 대안이 될 수 있다.

        Notifier basicNotifier = new BasicNotifier();
        basicNotifier.send();
        System.out.println("----------------------");

        Notifier emailNotifier = new EmailNotifier(new BasicNotifier());
        emailNotifier.send();
        System.out.println("----------------------");

        Notifier smsNotifier = new SmsNotifier(new EmailNotifier(new BasicNotifier()));
        smsNotifier.send();



    }
}
