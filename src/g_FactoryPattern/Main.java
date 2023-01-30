package g_FactoryPattern;

public class Main {
    public static void main(String[] args) {
        // 메서드의 이름의 통일과 구체화에 의존하지 않기 위해 공통된 메서드는 인터페이스를 통해 추상화하고 구현
        // MariaDB mariaDB = new MariaDB();
        DB mariaDB = new MariaDB();
        // 팩토리 패턴을 사용하여 정해진 순서와 형식이 있는 경우 그것들을 DBFactory 클래스에서 정해둔다.
        mariaDB.setUrl("jdbc:mariadb://");
        mariaDB.execute("select");

        // OracleDB oracleDB = new OracleDB();
        DB oracleDB = new OracleDB();
        oracleDB.setUrl("jdbc:oracle:thin://");
        oracleDB.execute("select");

        // DBFactory 클래스는 여러번 만들어질 필요가 없으므로 싱글톤으로 생성
        DBFactory dbFactory = DBFactory.getInstance();
        // mariaDB 객체를 알 필요가 없고 setUrl, execute 메서드의 순서를 생각하지 않아도 되며 문자열만으로 DB를 생성할 수 있다.
        DB db = dbFactory.createDB("maria");
        db.execute("select");












    }
}
