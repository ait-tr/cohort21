public class Main {
    class Temp{  // внутренние классы
        private String str;

        public Temp(String str) {
            this.str = str;
        }
    }

    Temp temp;




    public static void main(String[] args) {

    }

    public void method(int day, int month, int year){
        class Date { // локальный внутренний класс
            int day;
            int month;
            int year;

            public Date(int day, int month, int year) {
                this.day = day;
                this.month = month;
                this.year = year;
            }
        }
    }

}