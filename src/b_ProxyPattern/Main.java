package b_ProxyPattern;

public class Main {
    public static void main(String[] args) {
        // HunterProxy 클래스는 Hunter 클래스를 상속받기 때문에 Hunter 타입으로 선언이 가능
        Hunter hunter = new HunterProxy();
        Cat cat = new Cat();
        Mouse mouse = new Mouse();

        // 프록시 패턴을 사용하여 클래스의 기능을 변경 (OCP원칙 의존)
        hunter.abstract_hunting(cat);
        hunter.abstract_hunting(mouse);

    }
}
