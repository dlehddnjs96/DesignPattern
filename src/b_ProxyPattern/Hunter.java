package b_ProxyPattern;

public class Hunter {

    // 파라미터로 Mouse 한 개의 객체만 받을 수 있어 비효율적이다.
    public void hunting(Mouse mouse){
        System.out.println(mouse.getName() + " KILL!!");
    }

    // 큰 개념의 추상화 클래스를 만들고 작은 개념의 구체화된 클래스가 상속 받도록 설정
    // 파리미터에 Animal 추상클래스에 의존하여 상속받는 모든 클래스를 받을 수 있어 효율적이다.
    public void abstract_hunting(Animal animal){
        System.out.println(animal.getName() + " KILL!!");
    }

    // 위 메서드의 기능을 변경하기 위해 새로운 클래스를 생성하여 상속하고 변경한다.


}
