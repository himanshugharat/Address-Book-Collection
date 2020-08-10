import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        String firstName;
        String lastName;
        String address;
        String city;
        String state;
        int zip;
        long phoneNumber;
        int opreator;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        Person addArray[] = new Person[10];
        while (true) {
            System.out.println("operations are \n1.add address \n2.update address");
            System.out.println("enter your choice");
            opreator = sc.nextInt();
            switch (opreator) {
                case 1:
                    System.out.println("lets add new address entry");
                    System.out.println("enter the first name");
                    firstName = sc.next();
                    System.out.println("enter the last name");
                    lastName = sc.next();
                    System.out.println("enter the one word address location ");
                    address = sc.next();
                    System.out.println("enter the city name");
                    city = sc.next();
                    System.out.println("enter the State");
                    state = sc.next();
                    System.out.println("enter the zip code");
                    zip = sc.nextInt();
                    System.out.println("enter the phone number");
                    phoneNumber = sc.nextLong();
                    addArray[count] = new Person(firstName, lastName, address, city, state, zip, phoneNumber);
                    System.out.println("succesfully added");
                    System.out.println(addArray[count]);
                    count++;
                    break;
                case 2:
                    System.out.println("update book");
                    System.out.println("enter the name");
                    firstName = sc.next();
                    for (int i = 0; i < count; i++) {
                        if (addArray[i] != null && addArray[i].getFirstName().equals(firstName)) {
                            System.out.println("enter the first name");
                            firstName = sc.next();
                            addArray[i].setFirstName(firstName);
                            System.out.println("enter the last name");
                            lastName = sc.next();
                            addArray[i].setLastName(lastName);
                            System.out.println("enter the one word address location ");
                            address = sc.next();
                            addArray[i].setAddress(address);
                            System.out.println("enter the city name");
                            city = sc.next();
                            addArray[i].setCity(city);
                            System.out.println("enter the State");
                            state = sc.next();
                            addArray[i].setState(state);
                            System.out.println("enter the zip code");
                            zip = sc.nextInt();
                            addArray[i].setZip(zip);
                            System.out.println("enter the phone number");
                            phoneNumber = sc.nextLong();
                            addArray[i].setPhoneNumber(phoneNumber);
                            System.out.println(addArray[i]);
                        }
                    }
                    System.out.println("successfully updated");
                case 3:
                    System.out.println("delete contact");
                    System.out.println("enter the name to delete");
                    firstName=sc.next();
                    for (int i=0;i<count;i++){
                        if(addArray[i]!=null&&addArray[i].getFirstName().equals(firstName)){
                            addArray[i]=null;

                        }
                    }
                    System.out.println("successfully deleted");

            }
        }
    }
}
