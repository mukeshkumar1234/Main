package customer;

public class Customer1 {
        private int id;
        private String name;
        private String email;
        
	public Customer1(int id, String name, String email) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
		}

	public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Customer1 cust=new Customer1(1,"subash","subash@gmail");
       System.out.println(cust.id+" "+cust.name+" "+cust.email);
	}

}
