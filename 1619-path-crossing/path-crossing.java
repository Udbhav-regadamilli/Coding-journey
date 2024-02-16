class Solution {
    public boolean isPathCrossing(String path) {
        Map<Character, Pair<Integer, Integer>> moves = new HashMap();
        moves.put('N', new Pair(0, 1));
        moves.put('S', new Pair(0, -1));
        moves.put('W', new Pair(-1, 0));
        moves.put('E', new Pair(1, 0));

        Set<Pair<Integer, Integer>> visited = new HashSet();

        int x = 0, y = 0;
        visited.add(new Pair(x, y));

        for(Character c : path.toCharArray()){
            Pair<Integer, Integer> temp = moves.get(c);
            x += temp.getKey();
            y += temp.getValue();

            if(visited.contains(new Pair(x, y))){
                return true;
            }

            visited.add(new Pair(x, y));
        }

        return false;
    }
}