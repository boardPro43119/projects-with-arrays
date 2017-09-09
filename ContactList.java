import java.util.Scanner;
import java.util.ArrayList;

public class ContactList {

	private ArrayList<Contact> list = new ArrayList<Contact>();

	public void populate(){
		String[] currentContactData = new String[7];
		String addAnother = "";
		boolean addingContact = true;
		Scanner in = new Scanner(System.in);

		while(addingContact){

			System.out.print("Full name: ");
			currentContactData[0] = in.next();
			currentContactData[1] = in.next();

			in.nextLine();

			System.out.print("Street address (type 'x' to skip): ");
			currentContactData[2] = in.nextLine();

			System.out.print("City: ");
			currentContactData[3] = in.nextLine();

			System.out.print("State (abbreviation): ");
			currentContactData[4] = in.next();

			System.out.print("ZIP code: ");
			currentContactData[5] = in.next();

			System.out.print("Phone number (no dashes): ");
			currentContactData[6] = in.next();

			list.add(new Contact(currentContactData));

			System.out.print("Add another contact (Y/N)? ");
			addAnother = in.next();

			if(!addAnother.equalsIgnoreCase("y")){
				addingContact = false;
			}
		}

	}

	public String toString(){
		String result = "";

		for (Contact contact : list) {
			result += contact.toString() + "\n";
		}

		return result;
	}

}