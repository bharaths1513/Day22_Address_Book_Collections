package Address_Book;

public interface AddressBook {
	void add();

	void display();

	void edit(String firstName);

	void delete(String firstName);

	void addMultiplePerson();
}
