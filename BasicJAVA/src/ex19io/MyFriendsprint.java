package ex19io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MyFriendsprint {

	public static void main(String[] args) {

		try {
			
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/ex19io/friend_info.obj"));
			
			while(true) {
				Friend friend = (Friend)in.readObject();
				friend.showAllDate();	
			}			
			
		}
		catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
