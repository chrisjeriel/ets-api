package ph.cpi.rest.api.model.request;

public class CopySecIITrtyLimitRequest {

	private Integer copyFromSeciiTrtyLimId;
	private String copyFromLineCd;
	private String copyFromLineClassCd;
	private String copyFromCurrencyCd;
	private String copyToLineCd;
	private String copyToLineClassCd;
	private String copyToCurrencyCd;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	public Integer getCopyFromSeciiTrtyLimId() {
		return copyFromSeciiTrtyLimId;
	}
	public void setCopyFromSeciiTrtyLimId(Integer copyFromSeciiTrtyLimId) {
		this.copyFromSeciiTrtyLimId = copyFromSeciiTrtyLimId;
	}
	public String getCopyFromLineCd() {
		return copyFromLineCd;
	}
	public void setCopyFromLineCd(String copyFromLineCd) {
		this.copyFromLineCd = copyFromLineCd;
	}
	public String getCopyFromLineClassCd() {
		return copyFromLineClassCd;
	}
	public void setCopyFromLineClassCd(String copyFromLineClassCd) {
		this.copyFromLineClassCd = copyFromLineClassCd;
	}
	public String getCopyFromCurrencyCd() {
		return copyFromCurrencyCd;
	}
	public void setCopyFromCurrencyCd(String copyFromCurrencyCd) {
		this.copyFromCurrencyCd = copyFromCurrencyCd;
	}
	public String getCopyToLineCd() {
		return copyToLineCd;
	}
	public void setCopyToLineCd(String copyToLineCd) {
		this.copyToLineCd = copyToLineCd;
	}
	public String getCopyToLineClassCd() {
		return copyToLineClassCd;
	}
	public void setCopyToLineClassCd(String copyToLineClassCd) {
		this.copyToLineClassCd = copyToLineClassCd;
	}
	public String getCopyToCurrencyCd() {
		return copyToCurrencyCd;
	}
	public void setCopyToCurrencyCd(String copyToCurrencyCd) {
		this.copyToCurrencyCd = copyToCurrencyCd;
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
		return "CopySecIITrtyLimitRequest [copyFromSeciiTrtyLimId=" + copyFromSeciiTrtyLimId + ", copyFromLineCd="
				+ copyFromLineCd + ", copyFromLineClassCd=" + copyFromLineClassCd + ", copyFromCurrencyCd="
				+ copyFromCurrencyCd + ", copyToLineCd=" + copyToLineCd + ", copyToLineClassCd=" + copyToLineClassCd
				+ ", copyToCurrencyCd=" + copyToCurrencyCd + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
