package lc;

public class GasStaion {
    public static void main(String[] args) {
        int[] gas = {1, 2, 3, 4, 5, 4, 1, 1, 8};
        int[] cost = {3, 4, 5, 1, 2, 1, 2, 10, 1};

        Printa.print(gas);
        Printa.print(cost);

        function(gas, cost);
    }

    public static void function(int[] gas, int[] cost) {
        int sum = 0, total = 0, position = 0;

        for (int i = 0; i < gas.length; i++) {
            sum = sum + (gas[i] - cost[i]);

            if (sum < 0) {
                total = total + sum;
                sum = 0;
                position = i + 1;
            }
        }

        total = total + sum;

        int startingIndex = total >= 0 ? position : -1;
        System.out.println(startingIndex);
    }
}
