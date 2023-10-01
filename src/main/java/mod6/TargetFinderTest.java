package mod6;

import java.util.Arrays;

class TargetFinder{
    int[] aiCoords;
    int[][] targets;
    int x;
    int y;
   int[] targetsMin;

    public int[] getTargetsMin() {
        return targetsMin;
    }

    public int[] getAiCoords() {
        return aiCoords;
    }

    public int[][] getTargets() {
        return targets;
    }

    public int[] findTarget(int[] aiCoords, int[][] targets){
        x = aiCoords[0];
        y = aiCoords[1];
        int min = 10000;
        int distance = 0;
        int[] target;
        for(int i = 0; i < targets.length; i++) {
                target = targets[i];
                int x1 = target[0];
                int y1 = target[1];
                distance = (int) Math.sqrt(Math.pow((x1 - x), 2) + Math.pow((y1 - y), 2));
                if (min > distance) {
                    min = distance;
                    targetsMin = targets[i];
                }
        }
        return targetsMin;
    }
}




class TargetFinderTest {
    public static void main(String[] args) {
        int[] aiCoords = {10, 10};
        int[][] targets = {
                {20, 20},
                {15, 14},
                {30, 5}
        };

        TargetFinder targetFinder = new TargetFinder();
        int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);

        //Expect [15, 14]
        System.out.println(Arrays.toString(nearestTarget));
    }
}
