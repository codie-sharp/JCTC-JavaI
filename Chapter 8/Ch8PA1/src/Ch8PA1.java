/*
77. Security is an important feature of information systems.
Often, text is encrypted before being sent, and then
decrypted upon receipt. We want to build a class (or
several classes) encapsulating the concept of encryption.
You will need to test that class with a client program
where the main method is located.
For this project, encrypting consists of translating each
character into another character. For instance, if we
consider the English alphabet, including characters a
through z, each character is randomly encrypted into
another, which could be the same character. (If you like,
you can design your program so that no character is
encrypted into itself.) To represent this concept, we can
have an array of characters for the original alphabet, and
another array of characters for the encrypted alphabet.
For example, we could have
Original alphabet Encrypted alphabet
a u
b p
c h
d a
e s
f x
g z
h b
i j
. . . . . .
To encrypt a word, each letter in the word is replaced by
the corresponding letter in the encryted alphabet. For
example, the word caged would be encrypted into huzsa.
To decrypt a word, the letters in the encrypted word are
replaced by the corresponding letter in the original
alphabet. For example, the encrypted word xssa would
be decrypted as feed.
If we have 26 different characters in the original alphabet,
then we will have 26 different characters in the encrypted
alphabet. Furthermore, the encrypted alphabet should be
randomly generated.
In your main method, you should prompt the user for a
sentence. Your program should encrypt the sentence,
output the encrypted sentence, then decrypt it, and output
the decrypted sentence, which should be identical to the
original sentence that was input by the user.
For extra credit, use an array to keep track of the number
of occurrences of each character. Convert these
occurrences to percentages, and then use these
percentages to attempt to decrypt a large, encrypted
message.
 */
import java.util.Scanner;
import java.util.Random;

public class Ch8PA1 {
	public static void main(String[] args) {
		char[] abc = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char[] cba = new char[abc.length];
		Scanner sc = new Scanner(System.in);
		
		//Display alphabet
		System.out.print("Alphabet:  ");
		for(int i = 0; i < abc.length; i++) {
			System.out.print(abc[i] +" ");
		}
		
		//Copy a randomized alphabet and display
		//I couldn't figure out how to not let the letters repeat
		System.out.print("\nCryptcode: ");
		Random rdm = new Random();
		for(int i = 0; i < abc.length; i++) {
			int rdmIndex = rdm.nextInt(abc.length);
			char crypto = abc[rdmIndex];
			cba[rdmIndex] = cba[i];
			cba[i] = crypto;
			System.out.print(cba[i] +" ");
		}
		
		//Prompt for input and turn into an array
		System.out.println("\n\nEnter the phrase to encrypt:");
		String in = sc.nextLine().toLowerCase(); 
		char[] input = in.toCharArray();
		
		//Compare each char in input to alphabet
		for(int i = 0; i < input.length; i++) {
			for(int j = 0; j < abc.length; j++) {
		/* If the compared char = the char in alphabet, take the same
		 * index from the encrypted alphabet and assign it to the
		 * index of the input. 
		 * If input[0] was "c", it will find it as abc[2] (3rd letter
		 * of the alphabet) and assign cba[2] (3rd letter of encrypted
		 * alphabet) to input[0]. So on and so forth. I Googled and 
		 * read about encryption for a week and could not figure this
		 * out. Please share the solution with me because I'm going
		 * insane trying to do it.*/
				if(input[i] == abc[j]) {
					input[i] = cba[j];
				}
			System.out.print(input[i]);
			}
		}
	}
}
