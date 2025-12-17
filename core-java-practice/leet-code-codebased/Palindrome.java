class Palindrome{
    public boolean isPalindrome(int x) {
        int reverse = 0;
        int temporary = x;
        if(x > 0){
            return false;
        }

        while (temporary != 0) {
            reverse = (reverse * 10) + (temporary % 10);
            temporary = temporary / 10;
        }
        return reverse == x;

    }
}