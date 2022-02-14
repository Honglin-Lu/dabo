package tech.honglin.dashboard.base;

public enum ResultStatus {

    /**
     * 1xxx
     * Business operation tips
     */
    S100(100,"Operation is success."),

    S401(401, "You do not have permission to access"),
    /**
     * 3xxx
     * Operation failed
     */
    S900(900, "Operation is failed."),

    /**
     * 5xxx
     * All kinds of system error
     */
    S500(500,"System error.");

    private final int code;
    private final String message;

    ResultStatus(int code, String message){
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
