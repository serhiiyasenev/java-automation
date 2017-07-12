package lesson20;


public enum ERROR {

    LOGIN_ERROR ("LOGIN_ERROR", 2),
    INVALID_EMAIL ("INVALID_EMAIL", 1),
    SEND_MESAGE ("SEND_MESAGE", 4),
    MISSING_LINK ("MISSING_LINK", 3);

    private String message;
    private int errorId;

    public String getMessage(){
        return message;
    }
    public int getErrorId(){
        return errorId;
    }

    ERROR (String message, int errorId){
        this.message = message;
        this.errorId = errorId;

    }
}

