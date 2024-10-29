package assignments;

public class Vowel {
	public static void vowelCheck(char x)
	{
		switch(x)
		{
		/*case 'a':System.out.println("Vowel sound a");
		break;
		case 'e':System.out.println("Vowel sound e");
		break;
		case 'i':System.out.println("Vowel sound i");
		break;
		case 'o':System.out.println("Vowel sound o");
		break;
		case 'u':System.out.println("Vowel sound u");
		break;
		default:System.out.println("Not a Vowel Sound");*/
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(x+" is a vowel sound");
			break;
			default:System.out.println(x+" is not a vowel");
			
			
		}
		
	}

	public static void main(String[] args) {
		Vowel.vowelCheck('b');
		// TODO Auto-generated method stub

	}

}
