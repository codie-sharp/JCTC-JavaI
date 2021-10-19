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

************************************************************

Psuedocode:
Create an array of the alphabet
Copy and randomize the array to create the encrypted alphabet
Display the arrays
Get user input
Send input to an array
Using a loop, compare each char in user input array to the encrypted alphabet
For the index of that letter in the encrypted alphabet, assign the corresponding char of the alphabet
Print out
Reverse 
Print out

No idea what to do with " " and any special characters "!,?,%"
*/
import java.util.Random;

public class Cryptogram {
}
