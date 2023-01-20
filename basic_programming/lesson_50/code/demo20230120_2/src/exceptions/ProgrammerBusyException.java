package exceptions;

public class ProgrammerBusyException extends MyUncheckedException{
    public ProgrammerBusyException(String message) {
        super(message);
    }
}
