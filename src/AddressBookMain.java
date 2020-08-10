import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        String firstName;
        String lastName;
        String address;
        String city;
        String state;
        int zip;
        long phoneNumber;
        Person details[]=new Person[10];
        while(true){
            System.out.println("1.Add contact");
            System.out.println("enter the choice");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("welcome to address book program");
                    System.out.println("Enter your first name");
                    firstName=sc.next();
                    System.out.println("Enter your last name");
                    lastName=sc.next();
                    System.out.println("Enter your address");
                    address=sc.next();
                    System.out.println("Enter your city name");
                    city=sc.next();
                    System.out.println("Enter your state name");
                    state=sc.next();
                    System.out.println("Enter your zip code");
                    zip=sc.nextInt();
                    System.out.println("Enter your phone number");
                    phoneNumber=sc.nextLong();
                    Person person=new Person();
                    details[count]=new Person(firstName,lastName,address,city,state,zip,phoneNumber);
                    System.out.println(details[count]);
                    count++;
             }
        }
    }
}
