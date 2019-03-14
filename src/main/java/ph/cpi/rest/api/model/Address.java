package ph.cpi.rest.api.model;

public class Address {
	
	private String addressId;
	private String empAddress;
	
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", empAddress=" + empAddress + "]";
	}
	
}
