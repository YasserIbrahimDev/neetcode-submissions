

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length() ){
            return false;
        }
        HashMap<Character,Integer> map = new  HashMap<Character,Integer>();
        int size = s.length();
        for(int i = 0; i< size; i++){
            char letterOfS = s.charAt(i);
            char letterOfT = t.charAt(i);
            map.put(letterOfS,map.getOrDefault(letterOfS,0)+1);
            map.put(letterOfT,map.getOrDefault(letterOfT,0)-1);
        }
        for(int value : map.values() ){
            if (value != 0){
                return false;
            }
        }
        return true;
        


    }
}
