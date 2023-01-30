package e_TemplateMethodPattern.teacher;

public class JavaTeacher extends Teacher{

    // 재정의 : 부모 클래스에서 추상화 되어있는 메서드의 기능을 재정의하는 것이다. (동적바인딩)
    // Override : 부모 클래스에서 정의된 메서드의 기능을 재정의하는 것이다.
    void 강의하기() {
        System.out.println("Java 강의시작");
    }
}
