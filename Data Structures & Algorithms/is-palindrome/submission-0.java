class Solution {
    public boolean isPalindrome(String s) {

        List<Character> arr = new ArrayList<>();
        for (char a : s.toCharArray()){
            if((a>='a' && a<='z') || (a>='A' && a<='Z') || (a>='0' && a<='9')){
                arr.add(Character.toLowerCase(a));
            }
        }
        int left = 0; 
        int right = arr.size()-1;

        while(left<right){
            if(arr.get(left)!=arr.get(right)) {
                 return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
