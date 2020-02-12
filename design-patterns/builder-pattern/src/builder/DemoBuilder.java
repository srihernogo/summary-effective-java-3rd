package builder;

public class DemoBuilder {

	public static void main(String[] args) {
		
		// menghindari telescopic constructor dan lainnya
		//Customer customer1 = new Customer("1", "Bayu", "Sri Hernogo", "srihernogo@gmail.com", "08997229966", "");
		//Customer customer2 = new Customer("2", "Bayu", "Sri Hernogo", "srihernogo@gmail.com", "08997229966", "Karawang");
		
		// builder pattern --> memisahkan cara pembuatan object dari si kelas object itu sendiri (tidak menggunakan contructor)
		CustomerBuilder builder1 = new CustomerBuilder("1234");
		builder1.setFirstName("Joko Handoyo");
		
		CustomerBuilder builder2 = new CustomerBuilder("2345");
		builder2.setLastName("Sri Hernogo");
		
		System.out.println(builder1.toString());
		System.out.println(builder2.toString());
		
	}

}
