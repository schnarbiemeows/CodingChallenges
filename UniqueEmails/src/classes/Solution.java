package classes;

import java.util.HashSet;

public class Solution {

	public int numUniqueEmails(String[] emails) {
		// solution should be O(n)
		// i can iterate through the list, apply the "." and "+" rules to 
		// each email and then put it into either a map or a set to remove
		// duplicates
		// then just query the size of the map/set, I wonder if set has a 
		// size function
		HashSet<String> uniqueEmails = new HashSet<String>();
		for(int i=0;i<emails.length;i++) {
			String email = emails[i];
			String firstPart = email.substring(0, email.indexOf("@"));
			//System.out.println(firstPart);
			String lastPart = email.substring(email.indexOf("@"));
			String replacement = firstPart.replaceAll(".", "");
			if(replacement.contains("+"))
				replacement = replacement.substring(0, replacement.indexOf("+"));
			email = replacement+lastPart;
			//System.out.println(email);
			uniqueEmails.add(email);
		}
		return uniqueEmails.size();
    }
}
