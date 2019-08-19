import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        int no_phone_book = phone_book.length;
        
        for (int i = 0; i < no_phone_book - 1; i++){
            for (int j = i + 1; j < no_phone_book; j++){
                if (phone_book[j].startsWith(phone_book[i]))
                    return false;
            }
        }
        
        return true;
    }
}