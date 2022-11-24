public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        String str1 = new String ("Hello");
        char chr1 = '5';
        Character chr2 = 'b';
        int a;
        int b;
        boolean check = false;
        if(Character.isDigit(chr1)){
            check= true;
        }
        System.out.println(check);
        String str2=str1.toLowerCase();
        System.out.println(str2);
        str1 = str1.toLowerCase();
        System.out.println(str1);

        String str3 = new String("Hello"); // создание переменной типа строка

        String [] strings1 = new String[10]; // создание массива стрингов
        char[] chars1 = {' ','w','o','r','d'};
        char[] chars2 = str3.toCharArray();
        String str4 = new String(chars1);
        System.out.println(str4);
        str3=str3+str4;
        System.out.println(str3);
        System.out.println(str3.length());
        for(int i=0; i<str3.length(); i++){
            System.out.println(str3.charAt(i));
        }
        String str6 = new String();
        System.out.println(str6.length());
        String str7 = " WORLD"; //
        String str8 = " world";
        System.out.println(str7.equals(str8));
        System.out.println(str7.equalsIgnoreCase(str8));

        System.out.println(str7.toLowerCase());
        System.out.println(str8.toUpperCase());

        System.out.println(str8.indexOf('w'));

        System.out.println(str8.indexOf("ld"));
        String str9 = new String("Hello world");
        //System.out.println(str9.indexOf('l'));
        //System.out.println(str9.lastIndexOf('l'));
        //System.out.println(str9.replace('l','z'));
        //str9=str9.replace('l', 'z');
        //System.out.println(str9.replace("ez", "ll"));
        System.out.println(str9.replaceFirst("l","z"));

        int z =15;
        Integer x= 18;
        System.out.println(z);
        z=Integer.valueOf(x);
        System.out.println(z);
        String str11 = "123";
        int y = Integer.valueOf(str11);
        System.out.println(y);
        int u = Integer.parseInt(str11);
        System.out.println(u);
        int s = Integer.MAX_VALUE;
        System.out.println(s);
        int l = 2147483647;
        long ll = 2147483648l;
        int mm = Integer.MIN_VALUE;
        System.out.println(mm);
        char ccc=str1.charAt(3);
        System.out.println(ccc);


















    }
}