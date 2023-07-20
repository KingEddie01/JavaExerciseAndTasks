package tdd;

public class ElectricLight {


    public static void main(String[] args) {
        switchNumberLight("11111111");
    }
    public static void switchNumberLight(String numbers) {
        String[][] lights = {{"#", "#", "#", "#"},
                             {"#", "#", "#", "#"},
                             {"#", "#", "#", "#"},
                             {"#", "#", "#", "#"},
                             {"#", "#", "#", "#"}
        };
        for (int counter = 0; counter < lights.length; counter++) {
            for (int num = 0; num < lights[counter].length; num++) {
                System.out.print(lights[counter][num]);
                if (numbers.charAt(7) == '1'){
                    if (numbers.charAt(0) == '0') {
                        lights[0][1] = " ";
                        lights[0][2] = " ";
                    }
                    if (numbers.charAt(1) == '0'){
                        lights[1][]
                    }


                    }













                }


            }

        }

    }









