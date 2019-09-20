package src;

import java.util.regex.Pattern;

public class Other {

    public boolean checkPrice(String eur){

        return Pattern.matches("^(([0][.|,][0-9]{2})|([1-9]+([.|,][0-9]{2})?))([\\s]?(€|EUR|eur))?$", eur);
    }
    //WIP
    /*
   String str = "test";
		byte[] byteArr = str.getBytes();
		System.out.println("String to byte array: " + Arrays.toString(byteArr));
    */
     
    public char crypt(char input){
        byte part1 = (byte);
        byte part2 = (byte);
 
        int result = (byte) (part1|part2);

        return (char);
    }
}
