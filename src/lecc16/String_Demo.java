package lecc16;

public class String_Demo {

	public static void main(String[] args) {
//		string is a non primitive data type.it is stored into heap.heap is divided into strim pool and intern pool.
		String str1="Hello";  //duolicate nhi bnti
		String str2="Hello";//without new keyword is stored in strim pool
		String str3= new String("Hello");//new keyword h to pool se bahar bnega or heap ke andar
		String str4= new String("Hello");
		//== checks the address 
		System.out.println(str1==str3); //false
		System.out.println(str1==str2);//true
		System.out.println(str4==str3);//false
		System.out.println(str1);
		
		//string is immutable----content change hoga pr ,same memory location pr change nhi hoga ,phle copy bnegi.
//		str1=str1+" bye"; // jab + sign use krte h to automatically new keyword use ho jaata h or naya memory bn jaata
//		//h or copy pool m nhi bnti usse bahar bnti h
//		System.out.println(str1);
//		System.out.println(str2);
//		
		String s1="Kaju"+"Kamlesh";// jb hum 2 literal ko add krte h tb + sign does not exist
		
		
		
	}
	

}
