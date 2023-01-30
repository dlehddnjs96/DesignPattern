package c_AdapterPattern;

public class OuterTigerAdapter extends Animal {

    // OuterTiger 클래스를 현재 시스템에 사용하기 위해 컴포지션한다. (객체선언, 생성자 생성)
    private OuterTiger outerTiger;

    public OuterTigerAdapter(OuterTiger outerTiger) {
        this.outerTiger = outerTiger;
    }

    // OuterTiger 클래스를 현재 시스템에 맞추기 위해 오버라이드하여 사용
    @Override // Override : 덮어쓰다.
    public String getName() {
        return outerTiger.getFullName();
    }
}
