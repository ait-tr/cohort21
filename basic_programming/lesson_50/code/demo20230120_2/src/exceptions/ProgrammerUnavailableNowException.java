package exceptions;

import java.util.List;

public class ProgrammerUnavailableNowException extends MyUncheckedException{
    public ProgrammerUnavailableNowException(String message) {
        super(message);
    }

}
