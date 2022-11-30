public class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        int c = 3;
        boolean result = isPossibleTriangle(a, b, c);
        System.out.println(result);
        System.out.println("____compare____");
        System.out.println(isPossibleTriangle(a, b, c));
        System.out.println(isPossibleTriangle2(a, b, c));
        System.out.println(isPossibleTriangle3(a, b, c));
    }

    public static boolean isPossibleTriangle(int a, int b, int c) {
        if (a + b < c) {
            return false;
        } else if (b + c < a) {
            return false;
        } else if (c + a < b) {
            return false;
        }
        return true;
    }

    public static boolean isPossibleTriangle2(int a, int b, int c) {
        return (a + b > c && b + c > a && c + a > b);
    }

    public static boolean isPossibleTriangle3(int a, int b, int c) {
//        if (a + b < c || b + c < a || c + a < b) {
//            return false;
//        }
//        return true;
        return !(a + b < c || b + c < a || c + a < b);
    }

    // метод принимает три стороны - три int
    // метод возвращет true - если возможно построить треугольник
    // метод возвращает false - если невозможно
    // подумайте как лучше назвать метод
    // метод для проверки того, возможно ли построить треугольник
}