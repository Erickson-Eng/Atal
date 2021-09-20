package br.edu.ifpb;

public class MedianaErickson {

    static int medianaParaDoisArrays(
            int[] array1, int[] array2, int inicio1,
            int inicio2, int final1, int final2){
        if (array1.length == 1) return (array1[0] + array2[0])/2;
        else {
            if (final1 - inicio1 == 1) {
                return (Math.max(array1[inicio1], array2[inicio2])
                        + Math.min(array1[final1], array2[final2]))/ 2; }
        }
        int m1 = mediana(array1, inicio1, final1);
        int m2 = mediana(array2, inicio2, final2);
        if (m1 == m2) {
            return m1;
        }
        else if (m1 < m2) {
            return medianaParaDoisArrays(
                    array1, array2, (final1 + inicio1 + 1) / 2,
                    inicio2, final1,
                    (final2 + inicio2 + 1) / 2);
        }
        else {
            return medianaParaDoisArrays(
                    array1, array2, inicio1,
                    (final2 + inicio2 + 1) / 2,
                    (final1 + inicio1 + 1) / 2, final2);
        }
    }
    static int mediana(int[] array, int start, int end)
    {
        int n = end - start + 1;
        if (n % 2 == 0) {
            return (array[start + (n / 2)]+ array[start + (n / 2 - 1)])/ 2;
        }
        else {
            return array[start + n / 2];
        }
    }

    public static void main(String[] args) {
        int ar1[] = {2, 3, 6, 7, 9};
        int ar2[] = {1, 2, 6, 10, 11};
        int ar3[] = {0, 1, 2, 4, 5};
        int ar4[] = {7, 9, 10, 12, 13};
        int n1 = ar1.length;
        int n2 = ar2.length;
        System.out.println(medianaParaDoisArrays(ar1, ar2, 0, 0,ar1.length - 1, ar2.length - 1));
        System.out.println(medianaParaDoisArrays(ar3,ar4,0,0,n1-1,n2-1));

    }
}
