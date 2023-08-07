package RandomPractice;

import java.util.*;
import java.lang.*;
import java.io.*;

class FastReader {
	BufferedReader br;
	StringTokenizer st;

	public FastReader() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	String next() {
		while (st == null || !st.hasMoreElements()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return st.nextToken();
	}

	int nextInt() {
		return Integer.parseInt(next());
	}

	long nextLong() {
		return Long.parseLong(next());
	}

	double nextDouble() {
		return Double.parseDouble(next());
	}

	String nextLine() {
		String str = "";
		try {
			str = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}
}

public class GFGPractice2 {
	static int n;
	static String str;

	public static int HappyTree() {
		int res = 0;
		int max = 0;

		int start = 0;
		int end = 0;

		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < n; i++) {
			if (str.charAt(i) == '[') {
				st.add('[');
				max = Math.max(max, st.size());
			} else {
				st.pop();
				if (st.isEmpty()) {
					if (max <= 2) {
						res++;
					} else {
						end = i;
						List<Integer> vert = new ArrayList<Integer>();
						List<Integer> child = new ArrayList<Integer>();
						for (int z = start; z < end; z++) {
							if (str.charAt(z) == '[' && str.charAt(z + 1) == '[') {
								vert.add(z);
							}
						}
						int lowP = 0;
						for (int y = 0; y < vert.size(); y++) {
							lowP = vert.get(y) + 1;
							Stack<Character> tempSt1 = new Stack<Character>();
							Stack<Character> tempSt2 = new Stack<Character>();
							int childRoot = 0;
							tempSt1.add('[');
							
							while(!tempSt1.isEmpty())
							{
								if (str.charAt(lowP) == '[')
								{
									tempSt1.add('[');
									tempSt2.add('[');
								}
								else {
									tempSt1.pop();
									
									if(!tempSt2.isEmpty())
									tempSt2.pop();
									
									if (tempSt2.isEmpty() && !tempSt1.isEmpty())
										childRoot++;
								}
								lowP++;
							}
							child.add(childRoot);

						}
						int flag = 0;
						for (int m = 0; m < child.size(); m++) {
							if (child.get(0) != child.get(m))
								flag = 1;
						}
						if (flag == 0)
							res++;

						System.out.println(vert);
						System.out.println(child);
					}
					start = i + 1;
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		FastReader sc = new FastReader();
		System.out.println(214344/21);
		System.out.println(214344/36);
		System.out.println(214344/66);
		System.out.println(Math.pow(3, 0.5));
		
//		int tc = sc.nextInt();
//		while (tc-- > 0) {
//			n = sc.nextInt();
//			str = sc.next();
//			System.out.println(HappyTree());
//		}

	}
}
