public class Contact {
	private String firstName, lastName, address, city, state, zipCode, phoneNumber;

	public Contact(String[] data){
		for(int i=0; i<data.length; i++){
			if(data[i].equalsIgnoreCase("x")){
				data[i] = "";
			}
		}

		firstName = data[0];
		lastName = data[1];
		address = data[2];
		city = data[3];
		state = data[4];
		zipCode = data[5];
		phoneNumber = data[6];
	}

	public String toString(){
		String result = "";

		result += firstName + " " + lastName;

		if(!address.equals(""))
			result += "\n" + address;

		result += "\n" + city + " " + state + " " + zipCode;

		if(!phoneNumber.equals(""))
			result += "\n" + phoneNumber;

		return result;
	}
}