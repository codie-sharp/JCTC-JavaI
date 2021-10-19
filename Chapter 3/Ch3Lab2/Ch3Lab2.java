import java.util.Scanner;

public class Ch3Lab2 {

	public static void main(String[] args) {
Scanner keyboard=new Scanner(System.in);

SaddleHorse horse=new SaddleHorse();

int idNo, age, height;
String color, saddleType, breed;


System.out.println("Let's enter a Saddle Horse");

System.out.println("Enter the horse's id number (whole numbers only)");
idNo=keyboard.nextInt();

System.out.println("Enter the horse's coat color e.g. Roan");
color=keyboard.next();

System.out.println("Enter the horse's age (whole numbers only)");
age=keyboard.nextInt();

System.out.println("Enter height of horse in hands (whole numbers only)");
height=keyboard.nextInt();

System.out.println("Enter the saddle type for this horse (English/Western)");
saddleType=keyboard.next();

keyboard.nextLine();

System.out.println("Enter the breed of this horse e.g. Thoroughbred");
breed=keyboard.nextLine();


horse.setIdNo(idNo);
horse.setCoatColor(color);
horse.setAge(age);
horse.setHeight(height);
horse.setSaddleType(saddleType);
horse.setSaddleBreed(breed);

System.out.println("\t\tSaddle Horse Information\n");
System.out.println("ID No:\t\t"+horse.getIdNo());
System.out.println("Coat Color:\t"+horse.getCoatColor());
System.out.println("Age:\t\t"+horse.getAge());
System.out.println("Height:\t\t"+horse.getHeight()+" hands");
System.out.println("Saddle Type:\t"+horse.getSaddleType());
System.out.println("Breed:\t\t"+horse.getSaddleBreed());

System.out.println("\n\nLet's create another horse");

SaddleHorse horse2=new SaddleHorse(3,"Chestnut",10,15.5,"English","Quarter Horse");

System.out.println("\n\nLet's display the information on the second horse\n");
System.out.println("\t\tSaddle Horse Information\n");
System.out.println(horse2.tellAboutHorse());



	}

}
