package emreunaldi.companyemployeeapi.utilities.results;

import lombok.Data;
import lombok.Getter;

@Getter
public class Result {
    private Boolean success;
    private String message;

    public Result(Boolean success) {
        this.success = success;
    }

    public Result(String message) {
        this.message = message;
    }

    public Result(Boolean success, String message) {
        this.success = success;
        this.message = message;
    }
}
