import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int noCompletion = completion.length;
        
        for (int i = 0; i < noCompletion; i++){
            if (!participant[i].equals(completion[i]))
                return participant[i];
        }
        
        return participant[noCompletion];
    }
}