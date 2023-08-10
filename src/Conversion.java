public class Conversion {
    public static void main(String[] args) {
        String number = "Tomide5";
        String num = "Eddie4";

                int convert = Integer.parseInt(String.valueOf(number.charAt(6)));
        System.out.println(convert);

        int convert1 = Integer.parseInt(String.valueOf(num.charAt(5)));
        System.out.println(convert1);

        int add = convert + convert1;

        System.out.println(add);


        String ValueOfInt = String.valueOf(convert);
        System.out.println(ValueOfInt);

    }
}
