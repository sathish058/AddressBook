package com.bridelabz.addressbook;

public class Contacts {
	
	private String firstName;
	private String lastName;
	private String mobileNo;
	private String city;
	private String state;
	private String pinCode;
	private String eMail;
	
		public Contacts(String firstName, String lastName, String mobileNo, String city, String state, String pinCode,String eMail) {
		 this.firstName = firstName;
		 this.lastName = lastName;
		 this.mobileNo = mobileNo;
		 this.city = city;
		 this.state = state;
		 this.pinCode = pinCode;
		 this.eMail = eMail;
		 }
	
		public String getFirstName() {
			return firstName;
	}
		public void setfirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getlastName() {
			return lastName;
		}
		
		public void setlastName(String lastName) {
			this.lastName = lastName;
		}

		@Override
		public String toString() {
			return "contacts [firstName = " +firstName + ", lastName = " +lastName + ", mobileNo = " +mobileNo + ", city = " +city
					+", state = " +state + ", pinCode = " + pinCode + ", eMail = " +eMail + "]";		
		}
		
		
		
		public String getmobileNo() {
			return mobileNo;
		}
		
		public void setmobileNo(String mobileNo) {
			this.mobileNo = mobileNo;
		}
		
		public String getcity () {
			return city;
		}
		
		public void setcity(String city) {
			this.city = city;
		}
		
		public String getstate() {
			return state;
		}
		public void setstate(String state) {
			this.state = state;
		}
		public String getpinCode() {
			return pinCode;
		}
		public void setpinCode(String pinCode) {
			this.pinCode = pinCode;
		}
		public String geteMail() {
			return eMail;
		}
		public void seteMail(String eMail) {
			this.eMail = eMail;
		}
		}


