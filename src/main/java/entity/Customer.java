package entity;

public class Customer {

	private int CustomerID;
	private String CustomerName;
	private String CustomerAddress;
	private Long CustomerPhone;
	private String CustomerEmail;
	private String CustomerPassword;

	public int getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public String getCustomerAddress() {
		return CustomerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		CustomerAddress = customerAddress;
	}

	public Long getCustomerPhone() {
		return CustomerPhone;
	}

	public void setCustomerPhone(Long customerPhone) {
		CustomerPhone = customerPhone;
	}

	public String getCustomerEmail() {
		return CustomerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		CustomerEmail = customerEmail;
	}

	public String getCustomerPassword() {
		return CustomerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		CustomerPassword = customerPassword;
	}

}
