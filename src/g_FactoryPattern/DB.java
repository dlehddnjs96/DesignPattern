package g_FactoryPattern;

public interface DB {
    public int execute(String sql);
    public void setUrl(String url);
}
