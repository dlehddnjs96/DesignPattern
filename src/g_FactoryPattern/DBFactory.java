package g_FactoryPattern;

public class DBFactory {

    private static DBFactory dbFactory = new DBFactory();
    private DBFactory(){}
    public static DBFactory getInstance(){
        return dbFactory;
    }

    // 새로운 DB를 추가하기 위해 메서드를 변경한다면 OCP원칙에 위배되지만
    // 패턴은 우리가 코드를 짤 때, 편하게 협업하고 클린한 코드를 짜게 해주는 것이기 때문에, 반드시 지켜야 하는것은 아니다.
    public DB createDB(String protocol){
        if (protocol.equals("maria")){
            DB mariaDB = new MariaDB();
            mariaDB.setUrl("jdbc:mariadb://");
            return mariaDB;
        }else if (protocol.equals("oracle")) {
            DB oracleDB = new OracleDB();
            oracleDB.setUrl("jdbc:oracle:thin://");
            return oracleDB;
        }else{
            throw new NullPointerException("db driver not found exception");
        }
    }



}
