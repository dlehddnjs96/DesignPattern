package d_SingletonPattern;

public class Main {
    public static void main(String[] args) {
        // 싱글톤 패턴을 사용하여 오직 1개의 인스턴스만 생성 (메모리, 데이터 공유를 위해 사용)
        Hunter hunter = Hunter.getInstance();
        // 새로운 객체가 아닌 이미 생성된 1개의 인스턴스를 사용
        Hunter hunter2 = Hunter.getInstance();
        Cat cat = new Cat();
        Mouse mouse = new Mouse();

        hunter.abstract_hunting(cat);
        hunter2.abstract_hunting(mouse);

    }
}
