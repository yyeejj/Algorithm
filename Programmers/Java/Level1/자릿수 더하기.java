import java.util.stream.Stream;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int arr[] = Stream
            .of(String.valueOf(n).split(""))
            .mapToInt(Integer::parseInt).toArray();
        
        for(int number : arr) {
            answer += number;
        }
        return answer;
    }
}