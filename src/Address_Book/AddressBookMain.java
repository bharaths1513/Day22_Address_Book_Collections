package Address_Book;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain implements AddressBook {

	Scanner scanner = new Scanner(System.in);
	ArrayList<Person> personList = new ArrayList<Person>();

	/**
	 * Ability to add a new contact to Address Book
	 */

	public void add() {
		System.out.println("Enter your first name");
		String firstName = scanner.next();
		System.out.println("Enter your last name");
		String lastName = scanner.next();
		System.out.println("Enter your address");
		String address = scanner.next();
		System.out.println("Enter your city");
		String city = scanner.next();
		System.out.println("Enter your state");
		String state = scanner.next();
		System.out.println("Enter your zip code");
		int zip = scanner.nextInt();
		System.out.println("Enter your phone");
		long mobileNo = scanner.nextLong();

		Person person1 = new Person(firstName, lastName, address, city, state, mobileNo, zip);
		personList.add(person1);
		System.out.println("Contact added successfully");
	}

	public void display() {
		for (int i = 0; i < personList.size(); i++) {
			Person person = personList.get(i);
			System.out.println("FirstName:" + person.getfirstName() + "\n" + "LastName:" + person.getLastName() + "\n"
					+ "Adress:" + person.getAddress() + "\n" + "City:" + person.getCity() + "\n" + "State:"
					+ person.getState() + "\n" + "Phone-Number:" + person.getMobileNo() + "\n" + "Pin-code:"
					+ person.getPincode() + "\n");
		}
	}

	@Override
	public void edit(String firstName) {
		for (int i = 0; i < personList.size(); i++) {
			Person person = personList.get(i);

			System.out.println("Hi " + person.getfirstName() + " please enter your  new Address");
			String address = scanner.next();
			person.setAddress(address);

			System.out.println("Hi " + person.getfirstName() + " please enter your  new city");
			String city = scanner.next();
			person.setCity(city);

			System.out.println("Hi " + person.getfirstName() + " please enter your  new state");
			String state = scanner.next();
			person.setState(state);

			System.out.println("Hi " + person.getfirstName() + " please enter your  new Zip Code");
			int zip = scanner.nextInt();
			person.setPincode(zip);

			System.out.println("Hi " + person.getfirstName() + " please enter your  new Phone No");
			long PhoneNo = scanner.nextLong();
			person.setMobileNo(PhoneNo);

			System.out.println("Hi " + person.getfirstName() + " you have sucessfully updated");
		}

	}

	public static void main(String[] args) {
		System.out.println("Welcome to the Address Book Problem");
		AddressBookMain adressBookImplementation = new AddressBookMain();
		boolean condition = true;

		while (condition == true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("1.add" + "\n" + "2.Display" + "\n" + "3.Edit");
			Scanner option = new Scanner(System.in);

			switch (option.nextInt()) {
			case 1:
				adressBookImplementation.add();
				break;
			case 2:
				adressBookImplementation.display();
				break;
			case 3:
				System.out.println("Enter the firstName:");
				String firstName = scanner.nextLine();
				adressBookImplementation.edit(firstName);
				break;
			default:
				System.out.println();
			}
		}
	}
}
