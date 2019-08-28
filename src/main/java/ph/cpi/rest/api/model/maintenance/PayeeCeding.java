package ph.cpi.rest.api.model.maintenance;

public class PayeeCeding {
	private Integer payeeClassCd;
	private String payeeCd;
	private String payeeName;
	private String payeeAddress;
	public Integer getPayeeClassCd() {
		return payeeClassCd;
	}
	public void setPayeeClassCd(Integer payeeClassCd) {
		this.payeeClassCd = payeeClassCd;
	}
	public String getPayeeCd() {
		return payeeCd;
	}
	public void setPayeeCd(String payeeCd) {
		this.payeeCd = payeeCd;
	}
	public String getPayeeName() {
		return payeeName;
	}
	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}
	public String getPayeeAddress() {
		return payeeAddress;
	}
	public void setPayeeAddress(String payeeAddress) {
		this.payeeAddress = payeeAddress;
	}
	@Override
	public String toString() {
		return "PayeeCeding [payeeClassCd=" + payeeClassCd + ", payeeCd=" + payeeCd + ", payeeName=" + payeeName
				+ ", payeeAddress=" + payeeAddress + "]";
	}
	
	
}
