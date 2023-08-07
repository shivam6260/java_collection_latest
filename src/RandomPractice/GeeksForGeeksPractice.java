package RandomPractice;

import java.util.*;
import java.lang.*;
import java.io.*;

//class FastReader {
//	BufferedReader br;
//    StringTokenizer st;
//
//    public FastReader()
//    {
//        br = new BufferedReader(
//            new InputStreamReader(System.in));
//    }
//
//    String next()
//    {
//        while (st == null || !st.hasMoreElements()) {
//            try {
//                st = new StringTokenizer(br.readLine());
//            }
//            catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        return st.nextToken();
//    }
//
//    int nextInt() { return Integer.parseInt(next()); }
//
//    long nextLong() { return Long.parseLong(next()); }
//
//    double nextDouble()
//    {
//        return Double.parseDouble(next());
//    }
//
//    String nextLine()
//    {
//        String str = "";
//        try {
//            str = br.readLine();
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }
//        return str;
//    }
//}

class GeeksForGeeksPractice {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-- > 0)
		{
		    int n = sc.nextInt();
		    int l = sc.nextInt();
		    int r = sc.nextInt();
		    
		    Long mod = (long)Math.pow(10, 9) + 7;
		    long[] arr = new long[n + 1];
	        Arrays.fill(arr, 0);
	        arr[0] = (long)1;
	        
	        for (int i = 1; i <= n; i++) 
	            for (int j = i; j > 0; j--) 
	                arr[j] = (arr[j] + arr[j - 1]) % mod;
		    
		    int tl;
		    int tr;
		    if(l <= 0 && r > 0)
		    {
		    	tl = arr.length/2 - Math.abs(l);
			    tr = arr.length/2 + Math.abs(r);
		    }
		    else if(l > 0 && r > 0)
		    {
		    	tl = arr.length/2 + l;
		    	tr = arr.length/2 + r;
		    }
		    else if(l < 0 && r < 0)
		    {
		    	tl = arr.length/2 - Math.abs(l);
		    	tr = arr.length/2 - Math.abs(r);
		    }
		    else
		    {
		    	tl = arr.length/2 - Math.abs(l);
			    tr = arr.length/2 + Math.abs(r);
		    }
		    
		    for(int i=0;i< arr.length;i++)
		    {
		    	System.out.print(arr[i] % mod + " ");
		    }
		    System.out.println();
		    
		    
		}
	    
	}
}


