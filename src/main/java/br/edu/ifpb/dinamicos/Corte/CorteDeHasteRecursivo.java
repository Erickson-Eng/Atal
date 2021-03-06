package br.edu.ifpb.dinamicos.Corte;

public class CorteDeHasteRecursivo {

    public static int cutRod(int price[], int n) {
        if (n <= 0)
            return 0;
        int max_val = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++)
            max_val = Math.max(max_val,
                    price[i] + cutRod(price, n - i - 1));

        return max_val;
    }
}

