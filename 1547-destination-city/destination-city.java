class Solution {
    public String destCity(List<List<String>> paths) {
        List<String> temp = new ArrayList<>();
        
        for(List<String> i : paths){
            temp.add(i.get(0));
        }

        for(List<String> i : paths){
            if(!temp.contains(i.get(1))){
                return i.get(1);
            }
        }

        return "";
    }
}