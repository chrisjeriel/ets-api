package ph.cpi.rest.api.model.request;

public class SaveAcitProfCommTranRequest {

	private Integer profCommId;
	private Integer tranId;
	private String updateUser;
	private String updateDate;
	
	public Integer getProfCommId() {
		return profCommId;
	}
	public void setProfCommId(Integer profCommId) {
		this.profCommId = profCommId;
	}
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
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
		return "SaveAcitProfcommTranRequest [profCommId=" + profCommId + ", tranId=" + tranId + ", updateUser="
				+ updateUser + ", updateDate=" + updateDate + "]";
	}
}
