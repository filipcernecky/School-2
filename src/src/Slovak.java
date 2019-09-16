//Filip Černecký
package src;

public class Slovak {
	
	public String formatText(String text){
        String word = String.valueOf(text.toUpperCase().charAt(0));
        for (int a=1;a<text.length();a++){
        	word += String.valueOf(text.toLowerCase().charAt(a));
        }

        if (!(word.charAt(word.length()-1) == '!' || 
        		word.charAt(word.length()-1) == '.' || 
        		word.charAt(word.length()-1) == '?'))
        {
        	word += '.';
        }

        return word;
	}
	
}
