package exceptions;

public class TeamLeadUnavailableNowException extends MyUncheckedException{
    public TeamLeadUnavailableNowException(String message) {
        super(message);
    }
}
