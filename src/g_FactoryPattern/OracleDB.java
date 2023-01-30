package g_FactoryPattern;

public class OracleDB implements DB{
    private String url;

    // 쿼리실행 메서드
    public int execute(String sql){
        if (url == null){
            throw new NullPointerException("Url Null");
        }

        if(sql.equals("select")){
            System.out.println("Query Execute: " + url + sql);
            return 1;
        }else {
            System.out.println("Query Fail: Syntax Error");
            return -1;
        }
    }

    // URL 세팅 메서드
    public void setUrl(String url){
        this.url = url;

    }
}
