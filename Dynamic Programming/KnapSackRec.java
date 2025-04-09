public class KnapSackRec {
    static int knap(int cost[], int weight[], int index, int W) {
        int take = Integer.MIN_VALUE, notTake = 0, max;
        if (index == 0) {
            if (weight[0] <= W) return cost[0];
            else return 0;
        }
        notTake = notTake + knap(cost, weight, index - 1, W);
        if (weight[index] <= W) {
            take = cost[index] + knap(cost, weight, index - 1, W - weight[index]);
        }
        max = Math.max(take, notTake);

        return max;
    }

    public static void main(String[] args) {
        int cost[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int W = 50;
        int n = cost.length;
        System.out.println("Maximum value = " + knap(cost, weight, n - 1, W));
    }
}
