package CodeForces;

import java.util.*;
import java.lang.*;
import java.io.*;

class FastReader {
	BufferedReader br;
    StringTokenizer st;

    public FastReader()
    {
        br = new BufferedReader(
            new InputStreamReader(System.in));
    }

    String next()
    {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() { return Integer.parseInt(next()); }

    long nextLong() { return Long.parseLong(next()); }

    double nextDouble()
    {
        return Double.parseDouble(next());
    }

    String nextLine()
    {
        String str = "";
        try {
            str = br.readLine();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}

public class CodeForces {
	public static void main(String[] args) {
	    FastReader sc = new FastReader();
		int n = sc.nextInt();
		List<Integer> even = new ArrayList<Integer>();
		List<Integer> odd = new ArrayList<Integer>();
		for(int i = 1;i<=n;i++)
		{
			int temp = sc.nextInt();
			if(temp % 2 == 0)
				even.add(i);
			else
				odd.add(i);
		}
		if(even.size() == 1)
			System.out.println(even.get(0));
		else System.out.println(odd.get(0));
	    
	}
}

