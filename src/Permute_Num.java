//class Solution {
//    public static void Permute(Set<ArrayList<Integer>> st,int nums[] ,ArrayList<Integer> temp, ArrayList<Integer> idx){
//        if(temp.size() == nums.length){
//            st.add(new ArrayList<>(temp));
//            return;
//        }
//        for(int i = 0; i < nums.length; i++){
//            if(!idx.contains(i)){
//                temp.add(nums[i]);
//                idx.add(i);
//                Permute(st, nums,temp, new ArrayList<>(idx));
//                temp.remove(temp.size()-1);
//                idx.remove(idx.size()-1);
//            }
//
//        }
//    }
//    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr , int n) {
//        // code here
//        int nums[] = new int[arr.size()];
//        for(int i = 0; i < arr.size(); i++){
//            nums[i] = arr.get(i);
//        }
//        ArrayList<Integer> idx = new ArrayList<>();
//        ArrayList<Integer> temp = new ArrayList<>();
//        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
//        Set<ArrayList<Integer>> st = new HashSet<>();
//        Permute(st, nums, temp, idx);
//        for(ArrayList<Integer> num : st){
//            al.add(num);
//        }
//        al.sort(new LexicographicalComparator());
//        return al;
//    }
//    static class LexicographicalComparator implements Comparator<ArrayList<Integer>> {
//        @Override
//        public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
//            for (int i = 0; i < Math.min(o1.size(), o2.size()); i++) {
//                int cmp = Integer.compare(o1.get(i), o2.get(i));
//                if (cmp != 0) {
//                    return cmp;
//                }
//            }
//            return Integer.compare(o1.size(), o2.size());
//        }
//    };
//}