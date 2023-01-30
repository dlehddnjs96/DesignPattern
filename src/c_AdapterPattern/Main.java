package c_AdapterPattern;

public class Main {
    public static void main(String[] args) {
        Hunter hunter = new Hunter();
        Cat cat = new Cat();
        Mouse mouse = new Mouse();
        // 어댑터 패턴을 사용하여 현재 시스템에 맞게 클래스를 변경 (OCP원칙 의존)
        OuterTigerAdapter outerTigerAdapter = new OuterTigerAdapter(new OuterTiger());


        hunter.abstract_hunting(cat);
        hunter.abstract_hunting(mouse);
        hunter.abstract_hunting(outerTigerAdapter);

    }
}
