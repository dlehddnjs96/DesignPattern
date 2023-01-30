package d_SingletonPattern;

public class Hunter {
    
    // 아래 로직을 통해 오직 1개의 인스턴스를 선언
    // ------------------------------------------------------------------------------------------------------
    // private 접근자로 접근을 막았기 때문에 static 키워드를 통해 스스로 선언하여 메모리에 적재한다.
    // static 키워드 main 메서드를 출력하기 전에 메모리에 올리는 키워드이다.
    private static Hunter hunter = new Hunter();
    // 외부에서 접근할 수 있는 메서드를 생성
    // static 키워드 붙어있지 않으면 메모리 영역 중 heap 영역에서 관리하면 객체를 생성할 수 없기 때문에 static 키워드를 붙혀준다.
    public static Hunter getInstance(){
        return hunter;
    }

    private Hunter() {
    }
    // ------------------------------------------------------------------------------------------------------

    // 파라미터로 Mouse 한 개의 객체만 받을 수 있어 비효율적이다.
    public void hunting(Mouse mouse){
        System.out.println(mouse.getName() + " KILL!!");
    }

    // 큰 개념의 추상화 클래스를 만들고 작은 개념의 구체화된 클래스가 상속 받도록 설정
    // 파리미터에 Animal 추상클래스에 의존하여 상속받는 모든 클래스를 받을 수 있어 효율적이다.
    public void abstract_hunting(Animal animal){
        System.out.println(animal.getName() + " KILL!!");
    }


}
