class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //for storing the list
        Map<String, List<String>> map = new HashMap<>();
        
        //sort all the Strings
        for(String i : strs){
            char[] charS = i.toCharArray();
            Arrays.sort(charS);
            String m = new String(charS);
            if (map.containsKey(m)){
                // map.put(m, map.get(m).add(i));
                map.get(m).add(i);
            }
            else{
                List<String> p = new ArrayList<>();
                p.add(i);
                map.put(m, p);
            }
                
        }

        return new ArrayList<>(map.values());

        
    }
}
