package HashMapInJava;

import java.util.*;

//         Linkedhashmap will keep the Insertion Order
class Abc {
	public int id;
	public String name;
	public  Abc(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Abc [id=" + id + ", name=" + name + "]";
	}
	
}

public class sortMapByValues {
	public static HashMap<Integer, Abc> sortByValue(HashMap<Integer, Abc> hm)
    {
        List<Map.Entry<Integer, Abc> > list =
               new LinkedList<Map.Entry<Integer, Abc> >(hm.entrySet());
        
//        for (Map.Entry<Integer, Abc> aa : hm.entrySet()) {
//        	list.add(aa);
//        }
        
//        Yaha pai ek hi hashmap hai uska data ka list bana hai
        
//        List<HashMap<Integer, Abc>> arr = new LinkedList<HashMap<Integer,Abc>>();
//        Yai alag hai isme arr mai hm1 , hm2 , hm3 mtlb hashpmap ka data nahi hm ka list hai phir ek hashmap mai
//        boht data hoga
 
        
        Collections.sort(list, new Comparator<Map.Entry<Integer, Abc> >() {
        	
            public int compare(Map.Entry<Integer, Abc> o1,
                               Map.Entry<Integer, Abc> o2)
            {
                return (o1.getValue().name).compareTo(o2.getValue().name);
            }
        });
         
        
        HashMap<Integer, Abc> temp = new LinkedHashMap<Integer, Abc>();
        for (Map.Entry<Integer, Abc> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
	
	
	public static void main(String[] args) {
//		HashMap<Integer, Abc> mp = new HashMap<Integer, Abc>();
//		mp.put(1, new Abc(10,"A"));
//		mp.put(2, new Abc(13,"B"));
//		mp.put(3, new Abc(17,"C"));
//		mp.put(4, new Abc(2,"D"));
//		mp.put(5, new Abc(78,"E"));
//		Map<Integer, Abc > res = sortByValue(mp);
//		for (Map.Entry<Integer, Abc> e : res.entrySet()) 
//		{
//			System.out.println(e.getValue() + " " + e.getKey());
//		}
		
		
	}

}
