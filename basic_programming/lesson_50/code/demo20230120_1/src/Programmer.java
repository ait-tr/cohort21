public class Programmer {
    private String name;
    private String status;

    public Programmer(String name) {
        this.name = name;
        status="available";
    }

    public Programmer(String name, String status) {
        this.name = name;
        this.status=status;
    }



    public void setBusy(){
        status="busy";
    }
    public void setAvailable(){
        status="available";
    }

    public void setNotAvailable(){
        status="not available";
    }

    public String doWork(String taskMsg)
            throws ProgrammerUnavailableNowException, ProgrammerBusyException {
        if(status.equals("not available")) {
            throw new ProgrammerUnavailableNowException("Programmer "+ name + " is not available");
        }
        if(status.equals("busy")) {
            throw new ProgrammerBusyException("Programmer "+ name + " is busy");
        }

        return taskMsg.toUpperCase();

    }


}
