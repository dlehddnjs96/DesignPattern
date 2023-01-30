package e_TemplateMethodPattern;

import e_TemplateMethodPattern.teacher.JavaTeacher;
import e_TemplateMethodPattern.teacher.PythonTeacher;
import e_TemplateMethodPattern.teacher.Teacher;

public class Main {
    public static void main(String[] args) {
        Teacher javaTeacher = new JavaTeacher();
        Teacher pythonTeacher = new PythonTeacher();

        // 템플릿 메서드 패턴을 사용하여 부모클래스에서 공통된 메서드를 정의하고 자주 변경되는 메서는 추상화하여 자식 클래스에서 재정의하여 사용한다.
        // 템플릿 메서드 패턴을 사용허면 객체지향적 구조로 중복코드를 줄이고 핵심 로직의 관리가 용이하다.
        // 나머지 메서드는 private 접근자로 선언되어 접근불가능
        // public 접근자 메서드에 다른 메서드를 선언하여 한꺼번에 사용하도록 설정
        javaTeacher.수업시작();
        pythonTeacher.수업시작();


    }
}
