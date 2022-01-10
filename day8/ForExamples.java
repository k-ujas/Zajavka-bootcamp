package zajavka.day8;

public class ForExamples {
    public static void main(String[] args) {
        //for (part1 ; part2 ; part3) { }
        // part1 - inicjalizacja zmiennych
        // part2 - deklaracja warunku
        // part3 - co robimy po wykonaniu petli np. i++
//        for (int i = 1; i < 3; i++) {
//            System.out.println("i: " + i);
//        }
//        for (int i = 1, j = 10; i < 10 && j > 5; i++, j--) {
//            System.out.println("i: " + i + ", j: " + j);
//        }
        for (int i = 0; i < 10; i++) {
            System.out.println("only i = " + i);
            if (i == 5){
                continue;//skip 5
            }
            for (int j = 0; j < 10; j++) {
                if (j == 2){
                    break;
                }
                System.out.println("both i and j, i = " + i + ", j = " + j);
            }
            
        }
    }
}
