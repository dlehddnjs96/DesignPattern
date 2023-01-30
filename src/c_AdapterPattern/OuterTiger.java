package c_AdapterPattern;

public class OuterTiger {
    // 현재 클래스를 외부에서 가져온 라이브러리 같은 외부요소라고 설정

    // 외부요소를 사용하기 위해 현재 클래스를 수정하게 되면 OCP원칙을 위배하게 된다.
    // 따라서 새로운 OuterTigerAdapter 클래스를 만들어 현재 시스템에 맞게 수정한다.
    private  String fullName = "Tiger";

    public String getFullName(){
        return fullName;
    }
}
