package builder;

public class CustomerBuilder {

	// Required parameters
	private final String id;

	// Optional parameters - initialized to default values
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String address;

	public CustomerBuilder(String id) {
		this.id = id;
	}

	public CustomerBuilder setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public CustomerBuilder setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public CustomerBuilder setEmail(String email) {
		this.email = email;
		return this;
	}

	public CustomerBuilder setPhone(String phone) {
		this.phone = phone;
		return this;
	}

	public CustomerBuilder setAddress(String address) {
		this.address = address;
		return this;
	}

	public Customer build(CustomerBuilder builder) {
		Customer customer = new Customer(id);
		customer.setFirstName(firstName);
		customer.setLastName(lastName);
		customer.setEmail(email);
		customer.setPhone(phone);
		customer.setAddress(address);
		return customer;
	}

	@Override
	public String toString() {
		return "CustomerBuilder [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phone=" + phone + ", address=" + address + "]";
	}

}
