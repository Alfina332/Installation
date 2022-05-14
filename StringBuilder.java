import java.io.Serializable;

public class StringBuilder implements Serializable {
    private static final long serialVersionUID = 1L;
    private String status = "";

    public void RecordStatus(String status) {
        this.status = this.status + status;
    }

    public String getStatus() {
        return status;
    }
}

