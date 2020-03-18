class Solution {
    private int answer = 0;
    private int[] numbers;
    private int target;
    
    public int solution(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;
        
        dfs(0);
        
        return answer;
    }
    
    private void dfs(int curPosition) {
        dfs(curPosition + 1, numbers[0]);
        dfs(curPosition + 1, numbers[0] * -1);
    }
    
    private void dfs(int curPosition, int curResultNumber) {
    
        // 배열의 끝까지 탐색이 끝났다면
        if(curPosition >= numbers.length) {
            // 계산 결과가 target과 일치한다면
            if(curResultNumber == target) {
                answer++;
            }
        } else {
            dfs(curPosition + 1, curResultNumber + numbers[curPosition]);
            dfs(curPosition + 1, curResultNumber - numbers[curPosition]);
        }
    }
}
