import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        int noNumbers = numbers.length;
        
        String[] strNumbers = new String[noNumbers];
        
        // 정수 배열을 문자열 배열로 변환
        for(int i = 0; i < noNumbers; i++) {
            strNumbers[i] = Integer.toString(numbers[i]);
        }
        
        // 정렬 기준 설정
        Comparator<String> numbersComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s2 + s1).compareTo(s1 + s2);
            }
        };
        
        Arrays.sort(strNumbers, numbersComparator);
        
        // 가장 큰 수가 0이라면
        if(strNumbers[0].equals("0")) {
            return "0";
        }
        
        for(int i = 0; i < noNumbers; i++) {
            answer += strNumbers[i];
        }
        
        return answer;
    }
}
