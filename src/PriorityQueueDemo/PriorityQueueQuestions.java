package PriorityQueueDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class PriorityQueueQuestions {
	// Question - K Closest Points to Origin
	// Link = https://leetcode.com/problems/k-closest-points-to-origin/

	public int[][] kClosest(int[][] points, int k) {
		PriorityQueue<int[]> p = new PriorityQueue<int[]>(new Comparator<int[]>() {
			public int compare(int[] a1, int[] a2) {
				int d1 = (a1[0] * a1[0]) + (a1[1] * a1[1]);
				int d2 = (a2[0] * a2[0]) + (a2[1] * a2[1]);
				return d1 - d2;
			}

		});
		for (int i = 0; i < points.length; i++) {
			p.add(points[i]);
		}
		int[][] res = new int[k][2];
		int i = 0;
		while (i < k) {
			res[i] = p.poll();
			i++;
		}
		return res;

	}

	// Question = Sort Characters By Frequency
	// Link = https://leetcode.com/problems/sort-characters-by-frequency/

	public String frequencySort(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : s.toCharArray())
			map.put(c, map.getOrDefault(c, 0) + 1);

		PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<Map.Entry<Character, Integer>>(
				new Comparator<Map.Entry<Character, Integer>>() {
					public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
						return o2.getValue() - o1.getValue();
					}

				});
		pq.addAll(map.entrySet());
		StringBuilder sb = new StringBuilder();
		while (!pq.isEmpty()) {
			Map.Entry e = pq.poll();
			for (int i = 1; i <= (int) e.getValue(); i++)
				sb.append(e.getKey());
		}

		return sb.toString();

	}

	// Question = Top K Frequent Words
	// Link = https://leetcode.com/problems/top-k-frequent-words/
	// Here we sorted the map using list according to the Question

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

	// Question = Reorganize String
	// Link = https://leetcode.com/problems/reorganize-string/

	public String reorganizeString(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<Map.Entry<Character, Integer>>(
				new Comparator<Map.Entry<Character, Integer>>() {
					public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
						return o2.getValue() - o1.getValue();
					}

				});
		pq.addAll(map.entrySet());

		StringBuilder sb = new StringBuilder();
		while (pq.size() > 1) {
			Map.Entry<Character, Integer> e1 = pq.poll();
			sb.append(e1.getKey());

			Map.Entry<Character, Integer> e2 = pq.poll();
			sb.append(e2.getKey());

			e1.setValue(e1.getValue() - 1);
			e2.setValue(e2.getValue() - 1);

			if (e1.getValue() > 0)
				pq.add(e1);
			if (e2.getValue() > 0)
				pq.add(e2);
		}

		if (!pq.isEmpty()) {
			Map.Entry<Character, Integer> e = pq.poll();
			if (e.getValue() > 1)
				return "";
			else {
				sb.append(e.getKey());

			}
		}
		return sb.toString();

	}

	// Question
	// Link = https://leetcode.com/problems/sort-the-matrix-diagonally
	// Hashmap with integer and priority queue with custom comparator

	public int[][] diagonalSort(int[][] mat) {
		HashMap<Integer, PriorityQueue<Integer>> mp = new HashMap<Integer, PriorityQueue<Integer>>();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if (mp.containsKey(i - j)) {
					mp.get(i - j).add(mat[i][j]);
				} else {
					mp.put(i - j, new PriorityQueue<Integer>(new Comparator<Integer>() {
						public int compare(Integer a, Integer b) {
							return a - b;
						}
					}));
					mp.get(i - j).add(mat[i][j]);

				}
			}
		}

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				mat[i][j] = mp.get(i - j).poll();
			}
		}
		return mat;

	}

}
