class Solution {

    public char findKthBit(int n, int k) {
        String s = findString(n);
        return s.charAt(k - 1);
    }

    public String findString(int n) {

        if (n == 1) {
            return "0";
        }

        String prev = findString(n - 1);

        return prev + "1" + reverse(invert(prev));
    }

    public String reverse(String s) {

        char[] arr = s.toCharArray();
        int l = 0;
        int r = arr.length - 1;

        while (l < r) {
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }

        return new String(arr);
    }

    public String invert(String s) {

        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '0') {
                arr[i] = '1';
            } else {
                arr[i] = '0';
            }
        }

        return new String(arr);
    }
}
