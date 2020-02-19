import java.util.Arrays;

class Solution {
    
    public int solution(int[] budgets, int M) {

		Arrays.sort(budgets);

		int answer = 0;
		int low = budgets[0];
		int high = budgets[budgets.length - 1];
		int mid;
		long totalBudget = getTotalBudget(budgets, high);
		
        // 예산요청 총 합보다 국가예산이 많은 경우
		if(totalBudget <= M) {
			return high;
		}
        
        // 가장 작은 예산 요청 금액보다 국가예산이 적은 경우
        if(low * budgets.length > M) {
            return M / budgets.length;
        }

		while (high - low > 1) {
			mid = (high + low) / 2;
			totalBudget = getTotalBudget(budgets, mid);
			
			if (totalBudget == M || answer == mid) {
				System.out.println(totalBudget);
				return mid;
			} else if (totalBudget > M) {
				high = mid + 1;
			} else {
				answer = mid;
				low = mid - 1;
			}

		}

		return answer;
	}

	private long getTotalBudget(int[] budgets, int limit) {

		long totalBudget = 0;

		for (int budget : budgets) {
			if (budget >= limit) {
				totalBudget += limit;
			} else {
				totalBudget += budget;
			}
		}
		
		return totalBudget;
	}
    
}
