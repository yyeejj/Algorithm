class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int sum = 0;
        
        for(int num : arr) {
            sum += num;
        }
        
        return (double)sum/arr.length;
    }
}