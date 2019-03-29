package ph.cpi.rest.api.model.request;

public class SavePolicyDetailsRequest {

	private String quotationNo;
	private String holdCoverNo;
	private String openPolicyNo;
	private String optionId;
	private String inceptDate;
	private String expiryDate;
	
	public String getQuotationNo() {
		return quotationNo;
	}
	public void setQuotationNo(String quotationNo) {
		this.quotationNo = quotationNo;
	}
	public String getHoldCoverNo() {
		return holdCoverNo;
	}
	public void setHoldCoverNo(String holdCoverNo) {
		this.holdCoverNo = holdCoverNo;
	}
	public String getOpenPolicyNo() {
		return openPolicyNo;
	}
	public void setOpenPolicyNo(String openPolicyNo) {
		this.openPolicyNo = openPolicyNo;
	}
	public String getOptionId() {
		return optionId;
	}
	public void setOptionId(String optionId) {
		this.optionId = optionId;
	}
	public String getInceptDate() {
		return inceptDate;
	}
	public void setInceptDate(String inceptDate) {
		this.inceptDate = inceptDate;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	@Override
	public String toString() {
		return "SavePolicyDetailsRequest [quotationNo=" + quotationNo + ", holdCoverNo=" + holdCoverNo
				+ ", openPolicyNo=" + openPolicyNo + ", optionId=" + optionId + ", inceptDate=" + inceptDate
				+ ", expiryDate=" + expiryDate + "]";
	}
}
