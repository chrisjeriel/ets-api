package ph.cpi.rest.api.model.request;

public class CopyMtnClmCashCallRequest {
	
	private Integer copyFromTreatyId;
	private String copyFromTreatyCedId;
	private String copyFromCurrCd;
	private String copyToTreatyId;
	private String copyToTreatyCedId;
	private String copyToCurrCd;
	private String copyFromHistNo;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	public String getCopyFromHistNo() {
		return copyFromHistNo;
	}
	public void setCopyFromHistNo(String copyFromHistNo) {
		this.copyFromHistNo = copyFromHistNo;
	}

	public Integer getCopyFromTreatyId() {
		return copyFromTreatyId;
	}
	public void setCopyFromTreatyId(Integer copyFromTreatyId) {
		this.copyFromTreatyId = copyFromTreatyId;
	}
	public String getCopyFromTreatyCedId() {
		return copyFromTreatyCedId;
	}
	public void setCopyFromTreatyCedId(String copyFromTreatyCedId) {
		this.copyFromTreatyCedId = copyFromTreatyCedId;
	}
	public String getCopyFromCurrCd() {
		return copyFromCurrCd;
	}
	public void setCopyFromCurrCd(String copyFromCurrCd) {
		this.copyFromCurrCd = copyFromCurrCd;
	}
	public String getCopyToTreatyId() {
		return copyToTreatyId;
	}
	public void setCopyToTreatyId(String copyToTreatyId) {
		this.copyToTreatyId = copyToTreatyId;
	}
	public String getCopyToTreatyCedId() {
		return copyToTreatyCedId;
	}
	public void setCopyToTreatyCedId(String copyToTreatyCedId) {
		this.copyToTreatyCedId = copyToTreatyCedId;
	}
	public String getCopyToCurrCd() {
		return copyToCurrCd;
	}
	public void setCopyToCurrCd(String copyToCurrCd) {
		this.copyToCurrCd = copyToCurrCd;
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
		return "CopyMtnClmCashCallRequest [copyFromTreatyId=" + copyFromTreatyId + ", copyFromTreatyCedId="
				+ copyFromTreatyCedId + ", copyFromCurrCd=" + copyFromCurrCd + ", copyToTreatyId=" + copyToTreatyId
				+ ", copyToTreatyCedId=" + copyToTreatyCedId + ", copyToCurrCd=" + copyToCurrCd + ", copyFromHistNo="
				+ copyFromHistNo + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser="
				+ updateUser + ", updateDate=" + updateDate + "]";
	}

}
