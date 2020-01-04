import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int i;
        int j;
        
        for(int n = 0; n < commands.length; n++) {
            i = commands[n][0];
            j = commands[n][1];
            int[] temp = new int[j - i + 1];     // i~j로 자른 배열 생성
            
            for(int k = 0; k < temp.length; k++) {
                temp[k] = array[i - 1 + k];      // array의 i~j부분 복사
            }
            
            Arrays.sort(temp);    // 정렬
            
            answer[n] = temp[commands[n][2] - 1];   // k번째 수
        }
        
        return answer;
    }
}
