package lab3;

public class Sudent {
	  public static final String Address = null;
	String name, ditno, address;
	  
	  // parameter constructor
	  public Sudent(String newname, String newditno, String newaddress) {
		 this.name = newname;
		 this.ditno = newditno;
		 this.address = newaddress;
	  }

	
	  // mutator methods & access methods
	  
	  public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDitno() {
			return ditno;
		}

		public void setDitno(String ditno) {
			this.ditno = ditno;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}
		
		String getDetails() {
			String s = "I am a Student.\nMy name is "+getName()+
					"\nI am from "+getAddress()+"\nMy ditno is "+getDitno();
			return s;
			
		}
		  
}
