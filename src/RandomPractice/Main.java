package RandomPractice;

import java.util.*;


class User {
	private static User user;
	private String str;
	private User(String str) {
		this.str = str;
	}
	
	public static User returnObject(String str) {
		if(user == null)
		{
			user = new User(str);
		}
		return user; 
	}
	
	public String getStr() {
		return this.str;
	}
}


public class Main {
	public static void main(String[] args) {
		User obj = User.returnObject("abc");
		System.out.println(obj.getStr());
		
		
	}

}
