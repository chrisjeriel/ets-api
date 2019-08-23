package ph.cpi.rest.api.model.request;

public class PrintArRequest {
	private String tranId;
	private String arNo;
	private String updateUser;
	private String updateDate;
	public String getTranId() {
		return tranId;
	}
	public void setTranId(String tranId) {
		this.tranId = tranId;
	}
	public String getArNo() {
		return arNo;
	}
	public void setArNo(String arNo) {
		this.arNo = arNo;
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
		return "PrintArRequest [tranId=" + tranId + ", arNo=" + arNo + ", updateUser=" + updateUser + ", updateDate="
				+ updateDate + "]";
	}
	
}
