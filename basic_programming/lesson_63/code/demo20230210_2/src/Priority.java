public enum Priority {

    LOW(1, "low", new Printable() {
        @Override
        public void print() {
        }
    }),
    HIGH(2, "high", new Printable() {
        @Override
        public void print() {

        }
    }),
    URGENTLY(3, "boss say urgently", new Printable() {
        @Override
        public void print() {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
    });

    private int value;
    private String strValue;
    private  Printable printer;




    Priority(int value, String strValue, Printable printer) {
        this.value = value;
        this.strValue = strValue;
        this.printer = printer;
    }


    public int getValue() {
        return value;
    }

    public String getStrValue() {
        return strValue;
    }

    public Printable getPrinter() {
        return printer;
    }

    @Override
    public String toString() {
        return this.name();
    }       /*
        return "Priority{" +
                "value=" + value +
                ", strValue='" + strValue + '\'' +
                '}';
    }

         */
}
