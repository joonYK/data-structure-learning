package doIt.ch06;

import java.util.Arrays;

/**
 * 정렬을 마친 두 배열의 병합
 */
public class MergeArray_06_11 {

    //정렬을 마친 a, b를 병합하여 배열 c에 저장
    static void merge(int[] a, int na, int[] b, int nb, int[] c) {
        int pa = 0;
        int pb = 0;
        int pc = 0;

        //작은 값을 저장
        while (pa < na && pb < nb)
            c[pc++] = (a[pa] <= b[pb]) ? a[pa++] : b[pb++];

        //a에 남아 있는 요소를 복사
        while (pa < na)
            c[pc++] = a[pa];

        //b에 남아 있는 요소를 복사
        while (pb < nb)
            c[pc++] = b[pb++];
    }

    public static void main(String[] args) {
        int[] a = {2, 4, 6, 8, 11, 13};
        int[] b = {1, 2, 3, 4, 9, 16, 21};
        int[] c = new int[13];

        System.out.println("두 배열의 병합");
        merge(a, a.length, b, b.length, c);

        System.out.println("배열 a와 b를 병합하여 배열 c에 저장했습니다.");
        System.out.println("배열 a : " + Arrays.toString(a));
        System.out.println("배열 b : " + Arrays.toString(b));
        System.out.println("배여 c : " + Arrays.toString(c));
    }

}
