package src;

public class Math extends Subject {

	public int reverse(int num){
		int number=0;
	    if (num%10 == 0){
	    	return 0;
	    	}
	    int negation;

	    if (num<0){
	    	negation=-1;
	    	num*=-1;
	    	}else {
	    		negation=1;
	    		}

	    while(num!=0){
	    	number *= 10;
	    	number += num%10;
	    	num /= 10;
	    	}

	    return number*negation;
	    }

	public boolean checkPrime(int number){  
        int delitel = 1;
        int count = 1;

        int counter = 0;

        if (number<=1){
            System.out.println("Count of Steps is : "+counter);
            return false;
        }else {
            while(delitel!=number){
            	counter++;
                if (number%delitel == 0){
                    count++;
                }
                delitel++;
            }
            System.out.println("Count of Steps is : "+counter);
            return count == 2;
        }
    }
}
