import java.sql.Timestamp;

public class PasswordChangeEvent implements Event {   // implements is for extending Interface

    private final Long createdTimestamp;
    private final String id;

    public PasswordChangeEvent(String id) {
        this.id = id;
        this.createdTimestamp = new Timestamp(System
                                .currentTimeMillis()).getTime();
    }


    // click on a red lamp (after writing "implements Event" to implement methods by IDE -> @Override
    @Override
    public Long getTimeStamp() {
        return this.createdTimestamp;
    }

    @Override
    public void process() {
        System.out.println("Customer " + id + " changed their password. " +
                           "Sending a confirmation email to the customer.");
    }

}
