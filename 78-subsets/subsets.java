class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int index=0;
        List <List<Integer>> result=new ArrayList<>();
        ArrayList <Integer> current =new ArrayList<>();

        func (nums,index,current,result);
        return result;
    }
    public void func(int[] nums,int index,ArrayList <Integer> current,List <List<Integer>> result){
        if(index == nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[index]);
        func(nums,index+1,current,result);
        current.remove(current.size()-1);
        func(nums,index+1,current,result);
    }
}