class Solution {

    public int robotSim(int[] commands, int[][] obstacles) {
        Set<String> set = new HashSet<>();
        for(int[] item : obstacles) {
            set.add(item[0] + "," +item[1]);
        }

        int currentX = 0;
        int currentY = 0;

        int[][] dirs = new int[][] {{0, 1},{1,0}, {0, -1}, {-1, 0}};

        int currentDir = 0;
        int ans = 0;
        for(int c : commands) {
            if(c == -1) {
                currentDir = (currentDir + 1)%4;
            } else if(c == -2) {
                currentDir = currentDir - 1;
                if(currentDir < 0) currentDir = 3;
            } else {
                int stepX = dirs[currentDir][0];
                int stepY = dirs[currentDir][1];
                boolean interrupted = false;
                for(int i =0; i < c; i++) {
                    int newX = currentX + stepX;
                    int newY = currentY + stepY;
                    if(set.contains(newX + "," + newY)) {
                        break;
                    }
                    currentX = newX;
                    currentY = newY;
                    ans = Math.max(ans, currentX * currentX + currentY * currentY);
                }
            }
        }
        return ans;
    }
}