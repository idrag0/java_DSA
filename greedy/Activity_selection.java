package greedy;

import java.util.*;

public class Activity_selection {
    public static void main(String args[]){
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};
        
        int maxActivities = getMaxActivities(start, end);
        System.out.println("Max activities = " + maxActivities);
    }

    public static int getMaxActivities(int[] start, int[] end) {
        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i; // index
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2])); // sort by end time

        int maxAct = 1; // at least one activity will be performed
        int lastEnd = activities[0][2];
        for (int i = 1; i < end.length; i++) {
            if (activities[i][1] >= lastEnd) {
                maxAct++;
                lastEnd = activities[i][2];
            }
        }
        
        return maxAct;
    }
}
