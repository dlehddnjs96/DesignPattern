package a_StrategyPattern;

public class Main {
    public static void main(String[] args) {
        Hunter hunter = new Hunter();
        Cat cat = new Cat();
        Mouse mouse = new Mouse();

        // 전략 패턴을 사용하여 추상화된 클래스에 의존하게 설정 (DIP원칙 의존)
        hunter.abstract_hunting(cat);
        hunter.abstract_hunting(mouse);

    }
}
