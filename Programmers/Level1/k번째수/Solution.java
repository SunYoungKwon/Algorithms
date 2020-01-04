import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int i;
        int j;
        
        for(int n = 0; n < commands.length; n++) {
            i = commands[n][0];
            j = commands[n][1];
            int[] temp = Arrays.copyOfRange(array, i - 1, j);     // array의 i번째부터 j번째까지 복사
            
            Arrays.sort(temp);      // 정렬
            
            answer[n] = temp[commands[n][2] - 1];   // k번째 수 저장
        }
        
        return answer;
    }
}
