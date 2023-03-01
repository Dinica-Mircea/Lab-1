

import Solutions.Solution;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        System.out.println("Raspuns problema 1:");
        System.out.println(Solution.pb1("Ana are mere rosii si galbene"));

        System.out.println("Raspuns problema 2:");
        System.out.println(Solution.pb2(1,5,4,1));

        System.out.println("Raspuns problema 3:");
        System.out.println(Solution.pb3(Arrays.asList(1.0,0.0,2.0,0.0,3.0),Arrays.asList(1.0,2.0,0.0,3.0,1.0)));

        System.out.println("Raspuns problema 4:");
        System.out.println(Solution.pb4("ana are ana are mere rosii ana"));

        System.out.println("Raspuns problema 5:");
        System.out.println(Solution.pb5(Arrays.asList(1,2,3,4,2)));

        System.out.println("Raspuns problema 6:");
        System.out.println(Solution.pb6(Arrays.asList(2,8,7,2,2,5,2,3,1,2,2)));

        System.out.println("Raspuns problema 7:");
        System.out.println(Solution.pb7(2,Arrays.asList(7,4,6,3,9,1)));

        System.out.println("Raspuns problema 8:");
        System.out.println(Solution.pb8(4));

        int[][] matrixPb9=  {{0, 2, 5, 4, 1},
                            {4, 8, 2, 3, 7},
                            {6, 3, 4, 6, 2},
                            {7, 3, 1, 8, 3},
                            {1, 5, 7, 9, 4}};
        System.out.println("Raspuns problema 9 pt (1,1) si (3,3)");
        System.out.println(Solution.pb9(matrixPb9,1,1,3,3));
        System.out.println("Raspuns problema 9 pt (2,2) si (4,4)");
        System.out.println(Solution.pb9(matrixPb9,2,2,4,4));

        int[][] matrixPb10= {{0,0,0,1,1},
                            {0,1,1,1,1},
                            {0,0,1,1,1}};

        System.out.println("Raspuns problema 10:");
        System.out.println(Solution.pb10(matrixPb10));


    }
}