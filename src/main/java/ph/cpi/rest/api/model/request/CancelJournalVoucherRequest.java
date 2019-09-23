package ph.cpi.rest.api.model.request;

public class CancelJournalVoucherRequest {
	private Integer tranId;
	private Integer jvYear;
	private Integer jvNo;
	private Integer tranType; 
	private String updateUser;
	private String updateDate;
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	public Integer getJvYear() {
		return jvYear;
	}
	public void setJvYear(Integer jvYear) {
		this.jvYear = jvYear;
	}
	public Integer getJvNo() {
		return jvNo;
	}
	public void setJvNo(Integer jvNo) {
		this.jvNo = jvNo;
	}
	
	public Integer getTranType() {
		return tranType;
	}
	public void setTranType(Integer tranType) {
		this.tranType = tranType;
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
		return "CancelJournalVoucherRequest [tranId=" + tranId + ", jvYear=" + jvYear + ", jvNo=" + jvNo + ", tranType="
				+ tranType + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
}
