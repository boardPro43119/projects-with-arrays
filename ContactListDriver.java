public class ContactListDriver {
	public static void main(String[] args){

		ContactList friends = new ContactList();

		friends.populate();
		System.out.println(friends.toString());

	}
}