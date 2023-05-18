import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for(int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for(int i = 0; i < callings.length; i++) {
            int index = map.get(callings[i]);

            String temp = players[index - 1];
            players[index - 1] = players[index];
            players[index] = temp;

            // HashMap도 순서를 바꿔준다.
            map.put(callings[i], index-1);
            map.put(temp, index);
        }

        return players;
    }
}