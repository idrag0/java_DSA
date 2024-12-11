package ADA;
// frictionalKnapsack using greedy algorithm

import java.util.Arrays;
import java.util.Comparator;

public class frictionalKnapsack {
    public static double getMaxValue(double[] weights, double[] values, double capacity) {
        int n = weights.length;
        Item[] items = new Item[n];

        // Create an array of items with their value-to-weight ratio
        for (int i = 0; i < n; i++) {
            items[i] = new Item(weights[i], values[i], i);
        }

        // Sort the items based on their value-to-weight ratio in descending order
        Arrays.sort(items, Comparator.comparingDouble(Item::getValueToWeightRatio).reversed());

        double maxValue = 0;

        for (int i = 0; i < n; i++) {
            if (capacity >= items[i].weight) {
                maxValue += items[i].value;
                capacity -= items[i].weight;
            } else {
                maxValue += (items[i].value / items[i].weight) * capacity;
                break;
            }
        }

        return maxValue;
    }

    public static void main(String[] args) {
        double[] weights = { 10, 20, 30 };
        double[] values = { 60, 100, 120 };
        double capacity = 50;

        double maxValue = getMaxValue(weights, values, capacity);
        System.out.println("Maximum value: " + maxValue);
    }

    static class Item {
        double weight;
        double value;
        int index;

        public Item(double weight, double value, int index) {
            this.weight = weight;
            this.value = value;
            this.index = index;
        }

        public double getValueToWeightRatio() {
            return value / weight;
        }
    }
}
