// 2020.01.02

class Solution {
    public int[] solution(int[] answers) {
        int[][] sAnswer = {{1, 2, 3, 4, 5}, 
                         {2, 1, 2, 3, 2, 4, 2, 5}, 
                         {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
        int[] scores = new int[3];
        
        for(int i = 0; i < 3; i++) {
            scores[i] = getScore(sAnswer[i], answers);
        }
        
        int maxScore = getMaxScore(scores);
        int noMaxScore = countScore(maxScore, scores);
        int[] result = new int[noMaxScore];
        int index = 0;
        
        for(int i = 0; i < 3; i++) {
            if(scores[i] == maxScore) {
                result[index] = i + 1;
                index++;
            }
        }
        
        return result;
    }
    
    // 학생이 획득한 점수 출력
    public int getScore(int[] sAnswer, int[] answer) {
        int noProblem = answer.length;
        int noSAnswer = sAnswer.length;
        int score = 0;
        
        for(int i = 0; i < noProblem; i++) {
            if(sAnswer[i % noSAnswer] == answer[i])
                score++;
        }
        
        return score;
    }
    
    // 주어진 점수 배열 중 가장 큰 값 출력
    public int getMaxScore(int[] scores) {
        int maxScore = 0;
        int noScores = scores.length;
        
        for(int i = 0; i < noScores; i++) {
            if(maxScore < scores[i])
                maxScore = scores[i];
        }
        
        return maxScore;
    }
    
    // 주어진 점수와 같은 점수의 개수 출력
    public int countScore(int score, int[] scores) {
        int noScores = scores.length;
        int count = 0;
        
        for(int i = 0; i < noScores; i++) {
            if(scores[i] == score)
                count++;
        }
    
        return count;
    }
}
