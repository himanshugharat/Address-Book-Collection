import java.util.*;

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
        LinkedList<Person> personLinkedList = new LinkedList<Person>();
        while (true) {
            System.out.println("operations are \n1.add address \n2.update address \n3.delete \n4.sort based on name \n5.sort based on city, state or zip\n6.ssearch based on city and state\n7.search based on city state and person name ");
            System.out.println("enter your choice");
            opreator = sc.nextInt();
            switch (opreator) {
                case 1:
                    System.out.println("lets add new address entry");
                    System.out.println("enter the number of entry");
                    int num = sc.nextInt();
                    for (int iterateList = 0; iterateList < num; iterateList++) {
                        System.out.println("enter the first name");
                        firstName = sc.next();
                        for (int iterateListValues = 0; iterateListValues < personLinkedList.size(); iterateListValues++) {
                            if (personLinkedList.get(iterateListValues).getFirstName().equals(firstName)) {
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
                        personLinkedList.add(new Person(firstName, lastName, address, city, state, zip, phoneNumber));
                        System.out.println("succesfully added");
                        System.out.println(personLinkedList.get(count));
                        count++;
                    }
                    break;
                case 2:
                    System.out.println("update address book");
                    System.out.println("enter the name");
                    firstName = sc.next();
                    Iterator<Person> updateIter = personLinkedList.listIterator();
                    while (updateIter.hasNext()) {
                        int place = 0;
                        int pass = 0;
                        if (updateIter.next().getFirstName().matches(firstName)) {
                            pass = 1;
                            personLinkedList.remove(place);
                        }
                        if (pass == 1) {
                            lastName = updateIter.next().getLastName();
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
                            personLinkedList.add(place, new Person(firstName, lastName, address, city, state, zip, phoneNumber));
                            System.out.println(personLinkedList);
                        }
                        place++;
                    }
                    System.out.println("successfully updated");
                    System.out.println(personLinkedList);
                    break;
                case 3:
                    System.out.println("delete contact");
                    System.out.println("enter the name to delete");
                    firstName = sc.next();
                    Iterator<Person> deleteIter = personLinkedList.listIterator();
                    int place = 0;
                    while (deleteIter.hasNext()) {
                        if (deleteIter.next().getFirstName().matches(firstName)) {
                            personLinkedList.remove(place);
                        }
                        place++;
                    }
                    System.out.println("successfully deleted");
                case 4:
                    Collections.sort(personLinkedList, new Comparator<Person>() {
                        @Override
                        public int compare(Person person, Person t1) {
                            return person.getFirstName().compareTo(t1.getFirstName());
                        }
                    });

                case 5:
                    System.out.println("sorting based on city");
                    Collections.sort(personLinkedList, new Comparator<Person>() {
                        @Override
                        public int compare(Person person, Person t1) {
                            return person.getCity().compareTo(t1.getCity());
                        }
                    });
                    System.out.println(personLinkedList);
                    System.out.println("sorting based on state");
                    Collections.sort(personLinkedList, new Comparator<Person>() {
                        @Override
                        public int compare(Person person, Person t1) {
                            return person.getState().compareTo(t1.getState());
                        }
                    });
                    System.out.println(personLinkedList);
                    System.out.println("sorting based on zip");
                    Collections.sort(personLinkedList, new Comparator<Person>() {
                        @Override
                        public int compare(Person person, Person t1) {
                            return person.getFirstName().compareTo(t1.getFirstName());
                        }
                    });
                    break;
                case 6:
                    System.out.println("find by state and city");
                    System.out.println("enter the state to find");
                    state = sc.next();
                    System.out.println("enter the city to find");
                    city = sc.next();
                    Iterator<Person> seachIter = personLinkedList.listIterator();
                    int position = 0;
                    while (seachIter.hasNext()) {
                        if (seachIter.next().getState().matches(state)) {
                            System.out.println(personLinkedList.get(position));
                        }
                        position++;
                    }
                    System.out.println("successfully fetched");
                    break;
                case 7:
                    System.out.println("search using city name");
                    System.out.println("enter the state to find");
                    state = sc.next();
                    System.out.println("enter the city to find");
                    city = sc.next();
                    System.out.println("enter the person to search");
                    firstName = sc.next();
                    Iterator<Person> iter1 = personLinkedList.listIterator();
                    int places = 0;
                    while (iter1.hasNext()) {
                        if (iter1.next().getState().matches(state) && iter1.next().getCity().matches(city) && iter1.next().getFirstName().matches(firstName)) {
                            System.out.println(personLinkedList.get(places));
                        }
                        places++;
                    }
                default:
                    throw new IllegalStateException("Unexpected value: " + opreator);
            }
        }
    }
}
