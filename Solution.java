class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for (int num = left; num <= right; num++) {
            if (isPrime(countBits(num))) {
                count++;
            }
        }
        return count;
    }
    
    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    private int countBits(int num) {
        int count = 0;
        for (int bit = 0; bit < 32; bit++) {
            if (hasBit(bit, num)) {
                count++;
            }
        }
        return count;
    }
    
    private boolean hasBit(int bit, int num) {
        return ((1 << bit) & num) != 0;
    }
}
