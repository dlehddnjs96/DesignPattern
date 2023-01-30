package h_ObserverPattern.polling;

public class LotteMart {
    
    private String value = null;
    
    // 상품확인
    public String getValue(){
        return value;
    }
    
    // 상품입고
    public void setValue() {
        // 상품입고 시간
        try {
            for(int i=0; i<5; i++){
                Thread.sleep(1000);
            }
            value = "상품";
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
