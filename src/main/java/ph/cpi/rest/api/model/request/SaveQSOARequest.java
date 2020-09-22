package ph.cpi.rest.api.model.request;

public class SaveQSOARequest {

	private String force;
	private String cedingId;
	private Integer qtr;
	private Integer year;
	private String user;
	
	public String getForce() {
		return force;
	}
	public void setForce(String force) {
		this.force = force;
	}
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public Integer getQtr() {
		return qtr;
	}
	public void setQtr(Integer qtr) {
		this.qtr = qtr;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "SaveQSOARequest [force=" + force + ", cedingId=" + cedingId + ", qtr=" + qtr + ", year=" + year
				+ ", user=" + user + "]";
	}
}
