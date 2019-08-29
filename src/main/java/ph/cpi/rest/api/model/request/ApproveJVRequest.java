package ph.cpi.rest.api.model.request;

public class ApproveJVRequest {
	private Integer tranId;
	private Integer jvYear;
	private Integer jvNo;
	private String approvedBy;
	private String approvedDate;
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
	
	public String getApprovedBy() {
		return approvedBy;
	}
	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}
	public String getApprovedDate() {
		return approvedDate;
	}
	public void setApprovedDate(String approvedDate) {
		this.approvedDate = approvedDate;
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
		return "ApproveJVRequest [tranId=" + tranId + ", jvYear=" + jvYear + ", jvNo=" + jvNo + ", approvedBy="
				+ approvedBy + ", approvedDate=" + approvedDate + ", updateUser=" + updateUser + ", updateDate="
				+ updateDate + "]";
	}
	
}
