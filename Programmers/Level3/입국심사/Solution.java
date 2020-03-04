import java.util.Arrays;

class Solution {
    public long solution(int noPersonInLine, int[] times) {

        Arrays.sort(times);

        long low = 1;
        long high = (long)times[times.length - 1] * noPersonInLine;
        long mid;
        long sum;
        long answer = high;

        while(low <= high) {
            mid = (low + high) / 2;
            sum = 0;

            // 해당 시간안에 심사할 수 있는 최대 승객 수
            for(int time : times) {
                sum += mid / (long)time;
            }

            if(sum >= noPersonInLine) {
                high = mid - 1;
                answer = mid;
            } else {
                low = mid + 1;
            }
        }

        return answer;
    }
}
