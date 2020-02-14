package ph.cpi.rest.api.model.request;

public class SavePolicyDetailsRequest {

	private String checkingType;
	private String lineCd;
	private String quotationNo;
	private String holdCoverNo;
	private String openPolicyNo;
	private String optionId;
	private String inceptDate;
	private String expiryDate;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	private String coinsGrpId;
	private String riskId;
	
	public String getCoinsGrpId() {
		return coinsGrpId;
	}
	public void setCoinsGrpId(String coinsGrpId) {
		this.coinsGrpId = coinsGrpId;
	}
	public String getRiskId() {
		return riskId;
	}
	public void setRiskId(String riskId) {
		this.riskId = riskId;
	}
	public String getCheckingType() {
		return checkingType;
	}
	public void setCheckingType(String checkingType) {
		this.checkingType = checkingType;
	}
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}
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
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "SavePolicyDetailsRequest [checkingType=" + checkingType + ", lineCd=" + lineCd + ", quotationNo="
				+ quotationNo + ", holdCoverNo=" + holdCoverNo + ", openPolicyNo=" + openPolicyNo + ", optionId="
				+ optionId + ", inceptDate=" + inceptDate + ", expiryDate=" + expiryDate + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate
				+ ", coinsGrpId=" + coinsGrpId + ", riskId=" + riskId + "]";
	}
}
