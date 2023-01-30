package e_TemplateMethodPattern.teacher;

public abstract class Teacher {

    // 공통된 기능들은 템플릿으로 사용하고 자주 변경될 기능들은 추상 메서드로 선언하여 자식 클래스에서 구현하도록 설정한다.

    private void 입장하기(){
        System.out.println("선생님 입장");
    }
    
    private void 출석부르기(){
        System.out.println("출석확인");
    }

    abstract void 강의하기();
    
    private void 퇴장하기(){
        System.out.println("선생님 퇴장");
    }

    public void 수업시작(){
        입장하기();
        출석부르기();
        강의하기();
        퇴장하기();
    }

}
