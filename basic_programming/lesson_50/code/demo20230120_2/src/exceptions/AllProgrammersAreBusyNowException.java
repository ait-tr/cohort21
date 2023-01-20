package exceptions;

import java.util.List;

public class AllProgrammersAreBusyNowException extends MyCheckedException{
    private List<String> reasons;
    public AllProgrammersAreBusyNowException(String message, List<String> reasons) {
        super(message);
        this.reasons = reasons;
    }

    public List<String> getReasons() {
        return reasons;
    }
}
