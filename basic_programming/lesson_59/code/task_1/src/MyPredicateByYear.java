public class MyPredicateByYear implements MyPredicate{

        private int year;
        @Override
        public boolean test(Car car) {
            return car.getYear()==year;
        }
        public MyPredicateByYear(int year) {
            this.year = year;
        }
        public void setYear(int year) {
            this.year = year;
        }
    }

