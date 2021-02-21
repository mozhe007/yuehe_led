package heyue.listen_led.common;

public enum ResultCodeEnum {

    MISS_PARAM("1","缺少参数");

    private String code;
    private String text;

    ResultCodeEnum (String code ,String text){
        this.code = code;
        this.text = text;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
