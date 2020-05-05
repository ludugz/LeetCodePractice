/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 */
class Solution {
    public int reverse(int x) {
        int answer = 0;
        int number = x;
        System.out.println("test " + Integer.MAX_VALUE + "   " + Integer.MIN_VALUE);
        System.out.println("test2 " + 964632435 * 10);
        boolean isReverse = false;
        if (number < 0) {
            number = -number;
            isReverse = true;
        }
        while (number >= 1) {
            int sodu = number % 10;
            if (answer > Integer.MAX_VALUE / 10 || (answer == Integer.MAX_VALUE / 10 && sodu > 7)) return 0;
            if (answer < Integer.MIN_VALUE / 10 || (answer == Integer.MIN_VALUE / 10 && sodu < -8)) return 0;
            answer = answer * 10 + sodu;
            number = number / 10;
            System.out.println(answer);
        }
        if (isReverse) answer = -answer;
        return answer;
    }
}