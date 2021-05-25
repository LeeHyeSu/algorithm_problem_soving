import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        List<String> list = new ArrayList<>();
        list.add(words[0]);
        
        int[] answer = new int[2];

        for (int i = 1; i < words.length; i++) {
            if (list.contains(words[i]) 
                || (words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0))) {
                
                answer[0] = (i % n) + 1;    // 번호
                answer[1] = (i / n) + 1;    // 차례
                
                break;
            } else {
                list.add(words[i]);
            }
        }

        return answer;
    }
}