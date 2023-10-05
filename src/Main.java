public class Main {
    public static void main(String[] args) {

        int[] weights = {90, 91, 93, 97, 98, 95, 87, 86, 85, 0, 0, 0};
        int[] weightsCopy = {90, 91, 93, 97, 98, 95, 87, 86, 85, 0, 0, 0};
        boolean arraysAreEqual = true;
        arraysAreEqual = weights.length == weightsCopy.length;
        if (arraysAreEqual) {
            for (int i = 0; i < weightsCopy.length; i++) {
                if (weights[i] != weightsCopy[i]) {
                    arraysAreEqual = false;
                }
            }
        }
        if (arraysAreEqual) {
            System.out.println("Массивы одинаковые");
        } else {
            System.out.println("Масствы разные");
        }
        int maxWeight = -1;
        for (final int current : weights) {
            if (current > maxWeight) {
                maxWeight = current;
            }
        }
        System.out.println(maxWeight);
        for (int i = 0; i < weights.length - 1 && weights[i] != 0; i++) {
            System.out.println(weights[i + 1] - weights[i]);
        }
    }
}