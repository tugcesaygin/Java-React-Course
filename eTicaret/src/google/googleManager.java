package google;

import java.util.ArrayList;
import java.util.List;

public class googleManager {
	
	static List<googleUser>users;
	public googleManager() {
		
		users = new ArrayList<googleUser>();
		users.add(new googleUser(1, "aa","BB","gg@gg.com","dfg852", "aa"));
		users.add(new googleUser( 2, "bb","CC","cc@cc.com","792rtr","da" ));
		users.add(new googleUser(3, "cc","DD","ff@ff.com","79ghhj", "cc"));
		users.add(new googleUser(4, "dd","EE","ii@ii.com","ii@ii.com","bb"));
		
		
	}
	
	public googleUser register(String eMail , String password) {

		googleUser i = null ; 
		for ( googleUser user : users) {
			if(user.getEMail().equals(eMail)&&user.getPassword().equals(password)) {
				i=user;
				break;
			}
		}
		
		
		return i;
	
		
	}
}
