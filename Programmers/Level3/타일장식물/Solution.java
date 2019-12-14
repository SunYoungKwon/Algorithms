class Solution {
    public long solution(int n) {
        long answer = 0;

        long[] sides = new long[] { 1, 1 };

        for (int i = 0; i < n - 2; i++) {
            sides[i % 2] = sides[0] + sides[1];
        }

        if (n % 2 == 1)
            answer = (sides[0] * 4) + (sides[1] * 2);
        else
            answer = (sides[1] * 4) + (sides[0] * 2);

        return answer;
    }
}