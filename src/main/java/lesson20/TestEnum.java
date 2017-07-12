package lesson20;

import org.testng.annotations.Test;

public class TestEnum {

    @Test
    public void alalal(){

        ERROR invalidEmail = ERROR.INVALID_EMAIL;

        /*switch (invalidEmail){
            case INVALID_EMAIL:
                System.out.println("INVALID_EMAIL");
                break;
            case LOGIN_ERROR:
                System.out.println("LOGIN_ERROR");
                break;
            case MISSING_LINK:
                System.out.println("MISSING_LINK");
                break;
            case SEND_MESAGE:
                System.out.println("SEND_MESAGE");
                break;
        }
        */
        System.out.println(invalidEmail.getMessage());
    }
}

