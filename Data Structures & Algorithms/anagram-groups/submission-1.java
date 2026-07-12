class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(int i =0; i<strs.length; i++){
            int[] count = new int[26];
            //counting the elements of the string
            for(char c: strs[i].toCharArray()){
                count[c - 'a']++;
            }

            //key generation
            StringBuilder sb = new StringBuilder();
            for(int m=0; m<count.length; m++){
                sb.append(count[m]);
                sb.append("#");
            }
            

            if (map.containsKey(sb.toString())){
                map.get(sb.toString()).add(strs[i]);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(sb.toString(), list);
            }
        }

        return new ArrayList<>(map.values());

    }
}
