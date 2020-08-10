import java.util.Iterator;
import java.util.LinkedList;
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
        LinkedList<Person> list=new LinkedList();
        //Person addArray[] = new Person[10];
        while (true) {
            System.out.println("operations are \n1.add address \n2.update address \n3.delete");
            System.out.println("enter your choice");
            opreator = sc.nextInt();
            switch (opreator) {
                case 1:
                    System.out.println("lets add new address entry");
                    System.out.println("enter the number of entry");
                    int num=sc.nextByte();
                    for (int i=0;i<num;i++) {
                        System.out.println("enter the first name");
                        firstName = sc.next();
                        for(int j=0;j<list.size();j++) {
                            if(list.get(j).getFirstName().equals(firstName)) {
                                System.out.println("the name exits");
                                break;
                            }
                        }
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
                        list.add(new Person(firstName, lastName, address, city, state, zip, phoneNumber));
                        System.out.println("succesfully added");
                        System.out.println(list.get(count));
                        count++;
                    }

                    break;


                case 2:
                    System.out.println("update address book");
                    System.out.println("enter the name");
                    firstName = sc.next();
                    Iterator<Person> i=list.listIterator();
                    while(i.hasNext()){
                        int place=0;
                        int pass=0;

                        if(i.next().getFirstName().matches(firstName)) {
                            pass = 1;
                            list.remove(place);
                        }
                        if (pass ==1){
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
                            list.add(place,new Person(firstName, lastName, address, city, state, zip, phoneNumber));
                            //System.out.println(i.next());
                            System.out.println(list);
                        }
                        place++;
                    }
                    System.out.println("successfully updated");
                    System.out.println(list);
                    break;
                case 3:
                    System.out.println("delete contact");
                    System.out.println("enter the name to delete");
                    firstName=sc.next();
                    Iterator<Person> j=list.listIterator();
                    while(j.hasNext()) {
                        int place = 0;
                        if (j.next().getFirstName().matches(firstName)) {
                            list.remove(place);
                        }
                        place++;
                    }
                    System.out.println("successfully deleted");
            }
            System.out.println(list);
        }
    }
}
