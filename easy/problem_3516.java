class Solution {
    public int findClosest(int x, int y, int z) {
        if (Math.abs(z-x)==Math.abs(z-y)) return 0;
        return Math.abs(z-x)<Math.abs(z-y)?1:2;
    }
}