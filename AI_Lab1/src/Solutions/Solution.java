package Solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Solution {
    public static String pb1(String sentence){
        //Să se determine ultimul (din punct de vedere alfabetic) cuvânt care poate apărea
        // într-un text care conține mai multe cuvinte separate
        // prin ” ” (spațiu). De ex. ultimul (dpdv alfabetic) cuvânt din ”Ana are mere rosii si galbene” este cuvântul "si".
        //complexitate de timp O(n)
        //complexitate de spatiu O(n)
        String[] words=sentence.split(" ");
        String maxWord=words[0];
        for(String word:words)
        {
            if(word.compareTo(maxWord)>0)
                maxWord=word;
        }
        return maxWord;
    }

    public static double pb2(double x1,double y1,double x2, double y2){
        //Să se determine distanța Euclideană între două locații
        // identificate prin perechi de numere. De ex. distanța între (1,5) și (4,1) este 5.0
        //complexitate de timp O(1)
        //complexitate de spatiu O(1)
        double distance=Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
        return distance;

    }

    public static double pb3(List<Double> v1, List<Double> v2){
        //Să se determine produsul scalar a doi vectori rari care conțin numere reale.
        // Un vector este rar atunci când conține multe elemente nule. Vectorii pot avea oricâte dimensiuni.
        // De ex. produsul scalar a 2 vectori unisimensionali [1,0,2,0,3] și [1,2,0,3,1] este 4.
        //complexitate de timp O(n)
        //complexitate de spatiu O(1)
        double produsScalar=0.0;

        for(int i=0;i<v1.size();i=i+1){
            produsScalar=produsScalar+v1.get(i)*v2.get(i);
        }
        return produsScalar;
    }

    public static List<String> pb4(String sentence){
        //Să se determine cuvintele unui text care apar exact o singură dată în acel text.
        // De ex. cuvintele care apar o singură dată în ”ana are ana are mere rosii ana" sunt: 'mere' și 'rosii'.
        //complexitate de timp O(n)
        //complexitate de spatiu O(1)
        String[] words=sentence.split(" ");
        List<String> result=new ArrayList<>();
        for(String word:words){
            if(sentence.replace(word,"").length()==sentence.length()-word.length())
                result.add(word);
        }
        return result;
    }

    public static int pb5(List<Integer> v){
        //Pentru un șir cu n elemente care conține valori din mulțimea {1, 2, ..., n - 1}
        // astfel încât o singură valoare se repetă de două ori, să se identifice acea valoare care se repetă.
        // De ex. în șirul [1,2,3,4,2] valoarea 2 apare de două ori.
        //complexitate de timp O(n)
        //complexitate de spatiu O(1)

        int sum=v.stream().mapToInt(Integer::intValue).sum();
        return sum-v.size()*(v.size()-1)/2;
    }

    public static int pb6(List<Integer> v){
        //Pentru un șir cu n numere întregi care conține și duplicate, să se determine elementul majoritar (care apare de mai mult de n / 2 ori).
        // De ex. 2 este elementul majoritar în șirul [2,8,7,2,2,5,2,3,1,2,2].
        //complexitate de timp O(n)
        //complexitate de spatiu O(1)
        Collections.sort(v);
        int nr=1;
        for(int i=1;i<v.size();i=i+1){
            if(Objects.equals(v.get(i), v.get(i - 1)))
                nr=nr+1;
            else nr=1;
            if(nr>v.size()/2)
                return v.get(i);
        }
        return -1;
    }

    public static int pb7(int k, List<Integer> v){
        //Să se determine al k-lea cel mai mare element al unui șir de numere cu n elemente (k < n).
        // De ex. al 2-lea cel mai mare element din șirul [7,4,6,3,9,1] este 7
        // complexitate de timp O(log n)
        //complexitate de spatiu O(1)
        Collections.sort(v);
        return v.get(v.size()-k);
    }

    public static List<String> pb8(int n){
        //Să se genereze toate numerele (în reprezentare binară) cuprinse între 1 și n.
        //De ex. dacă n = 4, numerele sunt: 1, 10, 11, 100.
        //complexitate de timp O(n)
        //complexitate de spatiu O(n)
        List<String> result=new ArrayList<>();
        for(int i=1;i<=n;i=i+1){
            result.add(Integer.toBinaryString(i));
        }
        return result;
    }

    public static int pb9(int[][] matrix, int p, int q, int r, int s){
        //Considerându-se o matrice cu n x m elemente întregi și o listă cu perechi formate din coordonatele a 2 căsuțe din matrice ((p,q) și (r,s)),
        // să se calculeze suma elementelor din sub-matricile identificate de fieare pereche.
        //
        //De ex, pt matricea
        //[[0, 2, 5, 4, 1],
        //[4, 8, 2, 3, 7],
        //[6, 3, 4, 6, 2],
        //[7, 3, 1, 8, 3],
        //[1, 5, 7, 9, 4]]
        //și lista de perechi ((1, 1) și (3, 3)), ((2, 2) și (4, 4)), suma elementelor din prima sub-matrice este 38,
        // iar suma elementelor din a 2-a sub-matrice este 44.
        //complexitate de timp O(n^2)
        //complexitate de spatiu O(1)
        int sum=0;
        for(int i=p;i<=r;i=i+1){
            for(int j=q;j<=s;j=j+1){
                sum=sum+matrix[i][j];
            }
        }
        return sum;
    }

    public static int pb10(int[][] matrix){
        //Considerându-se o matrice cu n x m elemente binare (0 sau 1) sortate crescător pe linii,
        // să se identifice indexul liniei care conține cele mai multe elemente de 1.
        //
        //De ex. în matricea
        //[[0,0,0,1,1],
        //[0,1,1,1,1],
        //[0,0,1,1,1]]
        //a doua linie conține cele mai multe elemente 1.
        //complexitate de timp O(n^2)
        //complexitate de spatiu O(1)
        int row=matrix.length;
        int col=matrix[0].length;
        int maxSum=0;
        int maxIndex=0;
        for(int i=0;i<row;i=i+1){
            int sum=0;
            for(int j=0;j<col;j=j+1){
                sum=sum+matrix[i][j];
            }
            if(sum>maxSum){
                maxSum=sum;
                maxIndex=i;
            }
        }
        return maxIndex+1;
    }
}
