class Solution {
    public int countDigits(int num) {

        int temp = num;
        int count = 0;

        do{
            int digit = temp % 10;

            if (num % digit == 0){
                count++;
            }

            temp /= 10;
            

        
        }
        while (temp > 0);

        return count;

        


       
        
    }
}