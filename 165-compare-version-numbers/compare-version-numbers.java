class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int len = Math.max(v1.length, v2.length);
        for(int i=0; i<len; i++){
            Integer temp1 = i < v1.length ? Integer.parseInt(v1[i]) : 0;
            Integer temp2 = i < v2.length ? Integer.parseInt(v2[i]) : 0;
            int temp = temp1.compareTo(temp2);
            if(temp != 0){
                return temp;
            }
        }

        return 0;
    }
}