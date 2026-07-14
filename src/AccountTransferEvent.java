import java.sql.Timestamp;

public class AccountTransferEvent implements Event {   // implements is for extending Interface

    private Long createdTimestamp;
    private String id;

    public AccountTransferEvent(String id) {
        this.createdTimestamp = new Timestamp(System
                .currentTimeMillis()).getTime();
        this.id = id;
    }

    // click on a red lamp (after writing "implements Event" to implement methods by IDE -> @Override
    @Override
    public Long getTimeStamp() {
        return this.createdTimestamp;
    }

    @Override
    public void process() {
        System.out.println("Customer " + id + " needs to transfer " +
                "their service. Reaching out to CTE to remove " +
                "service from old device and add service to new device.");
    }
}
