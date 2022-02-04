package tech.honglin.dashboard.base;

import lombok.Data;

@Data
public class WrapResult<t> {

    private int status;
    private String message;
    private t data;
    private long timestamp ;

    public WrapResult(){
        this.timestamp = System.currentTimeMillis();
    }

    public static <t> WrapResult<t> success(t data) {
        WrapResult<t> resultData = new WrapResult<>();
        resultData.setStatus(ResultStatus.S100.getCode());
        resultData.setMessage(ResultStatus.S100.getMessage());
        resultData.setData(data);
        return resultData;
    }

    public static <t> WrapResult<t> fail(int code, String message) {
        WrapResult<t> resultData = new WrapResult<>();
        resultData.setStatus(code);
        resultData.setMessage(message);
        return resultData;
    }

}

