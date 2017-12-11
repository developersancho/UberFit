package developersancho.uberfit.model;

/**
 * Created by developersancho on 11.12.2017.
 */

public class Result {
    private String message_id;

    public Result(String message_id) {
        this.message_id = message_id;
    }

    public Result() {
    }

    public String getMessage_id() {
        return message_id;
    }

    public void setMessage_id(String message_id) {
        this.message_id = message_id;
    }
}
