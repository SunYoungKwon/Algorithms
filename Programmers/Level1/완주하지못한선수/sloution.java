import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String result = null;
        Map<String, Integer> players = new HashMap<String, Integer>();      // 경기에 참여한 선수를 저장
        
        // key: 선수이름, value: 해당 이름을 가진 선수의 수(동명이인 고려)
        for(String name : participant) players.put(name, players.getOrDefault(name, 0) + 1);
        
        // 완주한 선수의 수를 value에서 제거
        for(String name: completion) players.put(name, players.get(name) - 1);
        
        // 남아있는 선수 조회
        for(String name : participant) {
            if(players.get(name) == 1) {
                result = name;
                break;
            }
        }
        
        return result;
    }
}
