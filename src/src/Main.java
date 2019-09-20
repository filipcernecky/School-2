package src;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Slovak slovakLang = new Slovak();
        System.out.println(slovakLang.formatText("dnes JE POndelok"));
        
        English english = new English();
        System.out.println(english.translate(null));
        
        Math math = new Math();
        System.out.println(math.reverse(31));
        System.out.println("Prime number "+math.checkPrime(17));
    }
}