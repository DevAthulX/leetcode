class problem_679 {
    public boolean judgePoint24(int[] cards) {
        double[] nums = new double[cards.length];
        for (int i = 0; i < cards.length; i++) {
            nums[i] = (double) cards[i];
        }
        return solve(nums);
    }

    public boolean solve(double[] nums) {
        int n = nums.length;
        if (n == 1) {
            return Math.abs(nums[0] - 24.0) < 0.000001;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    double[] next = new double[n - 1];
                    int idx = 0;
                    for (int k = 0; k < n; k++) {
                        if (k != i && k != j) {
                            next[idx] = nums[k];
                            idx++;
                        }
                    }

                    for (double val : compute(nums[i], nums[j])) {
                        next[next.length - 1] = val;
                        if (solve(next)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public double[] compute(double a, double b) {
        return new double[] {
            a + b,
            a - b,
            b - a,
            a * b,
            b != 0 ? a / b : Double.NaN,
            a != 0 ? b / a : Double.NaN
        };
    }
}