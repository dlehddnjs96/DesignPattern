package b_ProxyPattern;

public class HunterProxy extends Hunter{

    // Hunter 클래스의 기능을 변경하기 위해 상속 후 재정의
    public void abstract_hunting(Animal animal){
        System.out.println("Proxy!!");
        super.abstract_hunting(animal);
    }



}
