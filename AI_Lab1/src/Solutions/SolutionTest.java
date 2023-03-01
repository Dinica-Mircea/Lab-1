package Solutions;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution=new Solution();
    @Test
    void pb1() {
        assertEquals(Solution.pb1("Ana are mere rosii si galbene"),"si");
    }

    @Test
    void pb2() {
        assertEquals(Solution.pb2(1,5,4,1),5.0);
    }

    @Test
    void pb3() {
        assertEquals(Solution.pb3(Arrays.asList(1.0,0.0,2.0,0.0,3.0),Arrays.asList(1.0,2.0,0.0,3.0,1.0)),4.0);
    }

    @Test
    void pb4() {
        assertEquals(Solution.pb4("ana are ana are mere rosii ana"),Arrays.asList("mere","rosii"));
    }

    @Test
    void pb5() {
        assertEquals(Solution.pb5(Arrays.asList(1,2,3,4,2)),2);
    }

    @Test
    void pb6() {
        assertEquals(Solution.pb6(Arrays.asList(2,8,7,2,2,5,2,3,1,2,2)),2);
    }

    @Test
    void pb7() {
        assertEquals(Solution.pb7(2,Arrays.asList(7,4,6,3,9,1)),7);
    }

    @Test
    void pb8() {
        assertEquals(Solution.pb8(4),Arrays.asList("1","10","11","100"));
    }

    @Test
    void pb9() {
        int[][] matrixPb9=  {{0, 2, 5, 4, 1},
                {4, 8, 2, 3, 7},
                {6, 3, 4, 6, 2},
                {7, 3, 1, 8, 3},
                {1, 5, 7, 9, 4}};
        assertEquals(Solution.pb9(matrixPb9,1,1,3,3),38);
        assertEquals(Solution.pb9(matrixPb9,2,2,4,4),44);
    }

    @Test
    void pb10() {
        int[][] matrixPb10= {{0,0,0,1,1},
                {0,1,1,1,1},
                {0,0,1,1,1}};
        assertEquals(Solution.pb10(matrixPb10),2);
    }
}