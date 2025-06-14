package DSAPattern;

public class DSAPatternAndAlgorithm {
    /*
    Pattern 1

Hashmap mai phele key value store kar lo then usko 2D Arraylist mai daal kai apne hisab sai sort kar lo.
Jo bhi condition ho.

Code Example
Map<Integer,Integer> map = new HashMap<Integer,Integer>();

for(int i=0;i<nums.length;i++) {
    if(map.containsKey(nums[i])) {
        map.put(nums[i],map.get(nums[i]) + 1);
    }else {
        map.put(nums[i],1);
    }
}

List<List<Integer>> list = new ArrayList<List<Integer>>();

for(Map.Entry<Integer,Integer> e : map.entrySet()){
    List<Integer> temp = new ArrayList<Integer>();
    temp.add(e.getKey());
    temp.add(e.getValue());
    list.add(temp);
}

Collections.sort(list, new Comparator<List<Integer>>(){
    @Override
    public int compare(List<Integer> l1,List<Integer> l2) {
        if(l1.get(1) == l2.get(1)) {
            return l1.get(0) - l2.get(0);
        }
        return l2.get(1) - l1.get(1);
    }
});




************************************************************************************************************************




Pattern 2

If Array is Circular =

To move forward =

The next element of arr[i] is arr[(i + 1) % n]

to move backward =

the previous element of arr[i] is arr[(i - 1 + n) % n]

where n is the length of arr.



************************************************************************************************************************




Pattern 3

Next permutation ka logic hai =

Hum priority queue and pattern find kar kai banai the but according to top solution =
logic niche likha hua hai

There are few bunch of questions of same pattern =


31. Next Permutation = https://leetcode.com/problems/next-permutation/description/
46. Permutations = https://leetcode.com/problems/permutations/description/
47. Permutations II = https://leetcode.com/problems/permutations-ii/description/
1850. Minimum Adjacent Swaps to Reach the Kth Smallest Number
    https://leetcode.com/problems/minimum-adjacent-swaps-to-reach-the-kth-smallest-number/description/

Main logic hai next permutation find karne ka =

1 = Find the break-point, i: Break-point means the first index i from the back of the given array where arr[i] becomes smaller than arr[i+1].


2 = If such a break-point does not exist i.e. if the array is sorted in decreasing order, the given permutation is the last one in the sorted order of all possible permutations. So, the next permutation must be the first i.e. the permutation in increasing order.

So, in this case, we will reverse the whole array and will return it as our answer.


3 = If a break-point exists:
Find the smallest number i.e. > arr[i] and in the right half of index i(i.e. from index i+1 to n-1) and swap it with arr[i].
Reverse the entire right half(i.e. from index i+1 to n-1) of index i. And finally, return the array.



************************************************************************************************************************


Pattern 4

If you have to made changes in place.

Find maximum number ( Lets suppose = 1024 )
int num =  ( nums[i] * 1024 ) + nums[j];

nums[i] = num / 1024 ;
nums[j] = num % 1024 ;

Example = https://leetcode.com/problems/shuffle-the-array/description/




************************************************************************************************************************



Pattern 5




     */
}