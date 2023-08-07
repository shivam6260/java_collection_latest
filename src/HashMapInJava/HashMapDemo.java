package HashMapInJava;

import java.util.*;

// All Concept are Same but LinkedHashMap Keep the Insertion Order
public class HashMapDemo {
	public static void main(String[] args) {

		String s = "abca";
		Map<Character, Integer> mp = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (mp.containsKey(c))
				mp.put(c, mp.get(c) + 1);
			else
				mp.put(c, 1);
		}
		// Question for Implementation of Hashmap
//		Given a string s, return true if s is a good string, or false otherwise.
//		A string s is good if all the characters that appear in s have the same number 
//		of occurrences (i.e., the same frequency).

//		Input: s = "abacbc"
//		Output: true
//	    Explanation: The characters that appear in s are 'a', 'b', 
//	                 and 'c'. All characters occur 2 times in s.

//		String s = "abaabbccc";
//		Map<Character, Integer> mp = new HashMap<Character, Integer>();

//		for (int i = 0; i < s.length(); i++) 
//		{
		// One Way
//			mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0) + 1);
		// 2nd Way
//		    if(map.containsKey(s)) map.put(s,map.get(s)+1);
//          else map.put(s,1);
//		}
//		int freq = mp.get(s.charAt(0));
//		for (Map.Entry<Character, Integer> e : mp.entrySet()) 
//		{
//			if (e.getValue() != freq)
//				System.out.println(false);
//		}
//		System.out.println(true);

		// Map example with Integer and ArrayList in which key is arr[i][1] and
		// value is arr[i][0]

		HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
		int arr[][] = { { 1, 3 }, { 1, 4 }, { 2, 3 }, { 2, 4 }, { 4, 3 } };
		for (int i = 0; i < arr.length; i++) {
			if (map.get(arr[i][1]) == null) {
				map.put(arr[i][1], new ArrayList<Integer>());
				map.get(arr[i][1]).add(arr[i][0]);
			} else
				map.get(arr[i][1]).add(arr[i][0]);
		}
		for (Map.Entry<Integer, ArrayList<Integer>> e : map.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
			for (int i = 0; i < e.getValue().size(); i++) {
				int x = e.getValue().get(i);
				System.out.println(x);
			}
		}

		// Leetcode question no 2103 Rings and Rods
		// Hashmap with Key = Integer , Value = HashSet<Character>

//		HashMap<Integer,HashSet<Character>> map=new HashMap<Integer,HashSet<Character>>();
//        for(int i=1;i< rings.length();i=i+2)
//        {
//            int rod = (int)rings.charAt(i) - '0';
//            if(map.get(rod) == null)
//			{
//				map.put(rod, new HashSet<Character>());
//				map.get(rod).add(rings.charAt(i-1));
//			}
//			else
//				map.get(rod).add(rings.charAt(i-1));
//        }
//        int res = 0;
//        for (Map.Entry<Integer,HashSet<Character>> e : map.entrySet()) 
//		{
//            if(e.getValue().size() == 3)
//                res++;
//		}
//        return res;

	}

}

/*
 * 1636. Sort Array by Increasing Frequency Given an array of integers nums,
 * sort the array in increasing order based on the frequency of the values. If
 * multiple values have the same frequency, sort them in decreasing order.
 * Example 1:
 * 
 * Input: nums = [1,1,2,2,2,3] Output: [3,1,1,2,2,2] Explanation: '3' has a
 * frequency of 1, '1' has a frequency of 2, and '2' has a frequency of 3.
 */
class Solution4 {
	public int[] frequencySort(int[] nums) {
		int[] res = new int[nums.length];
		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
		for (int num : nums) {
			if (mp.containsKey(num))
				mp.put(num, mp.get(num) + 1);
			else
				mp.put(num, 1);
		}

		// Yai hai list of Hashmap
		// List<HashMap<Integer,Integer>> brr = new
		// ArrayList<HashMap<Integer,Integer>>();

		// Yai List hai samzho List<Pair> wala yai isme List<Hasmap> nahi hai yai hai
		// List<Pair> matlab
		// hashmap ka data hai kewal.
		List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(mp.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				if (o1.getValue() == o2.getValue())
					return o2.getKey() - o1.getKey();
				return o1.getValue() - o2.getValue();
			}

		});

		for (Map.Entry<Integer, Integer> e : list) {
			System.out.println(e.getKey() + " " + e.getValue());
		}

		ArrayList<Integer> arr = new ArrayList<Integer>();

		for (int i = 0; i < list.size(); i++) {
			int key = list.get(i).getKey();
			int value = list.get(i).getValue();
			for (int j = 0; j < value; j++)
				arr.add(key);
		}
		for (int i = 0; i < res.length; i++)
			res[i] = arr.get(i);

		return res;

	}
}

// Question = Top K Frequent Words
// Link = https://leetcode.com/problems/top-k-frequent-words/
// Here we sorted the map using list according to the Question
class Solution5 {
	public List<String> topKFrequent(String[] words, int k) {
		Map<String, Integer> mp = new HashMap<String, Integer>();
		List<String> res = new ArrayList<String>();
		for (int i = 0; i < words.length; i++) {
			if (mp.containsKey(words[i])) {
				mp.put(words[i], mp.get(words[i]) + 1);
			} else
				mp.put(words[i], 1);
		}

		List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(mp.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				if (o1.getValue() == o2.getValue()) {
					return (o1.getKey()).compareTo(o2.getKey());
				}
				return o2.getValue() - o1.getValue();

			}
		});

		int i = 0;
		for (Map.Entry<String, Integer> e : list) {
			res.add(e.getKey());
			i++;
			if (i == k)
				break;
		}

		return res;

	}
}


// Question = 1282. Group the People Given the Group Size They Belong To
// Link = https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/


class Solution6 {
    public List<List<Integer>> groupThePeople(int[] group) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for(int i=0;i<group.length;i++)
        {
            if(map.containsKey(group[i]))
            {
                map.get(group[i]).add(i);
            }
            else
            {
                map.put(group[i],new ArrayList<Integer>());
                map.get(group[i]).add(i);
            }
            if(map.get(group[i]).size() == group[i])
            {
                list.add(map.get(group[i]));
                map.remove(group[i]);
            }
        }
        
        
		// for (Map.Entry<Integer, ArrayList<Integer>> e : map.entrySet()) {
		// list.add(e.getValue());
		// }
        
        
        return list;
        
    }
}




