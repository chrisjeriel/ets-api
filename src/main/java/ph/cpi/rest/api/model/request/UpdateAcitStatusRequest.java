package ph.cpi.rest.api.model.request;

import java.util.List;

public class UpdateAcitStatusRequest {

	private List<updateAcitStatusList> updateAcitStatusList;

	public List<updateAcitStatusList> getUpdateAcitStatusList() {
		return updateAcitStatusList;
	}

	public void setUpdateAcitStatusList(List<updateAcitStatusList> updateAcitStatusList) {
		this.updateAcitStatusList = updateAcitStatusList;
	}
	
	@Override
	public String toString() {
		return "UpdateAcitStatusRequest [updateAcitStatusList=" + updateAcitStatusList + "]";
	}

}


class updateAcitStatusList{
	
	private String tranId;
	private String  status;
	private String updateUser;
    private String tranClass;
    
	public String getTranId() {
		return tranId;
	}
	public void setTranId(String tranId) {
		this.tranId = tranId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public String getTranClass() {
		return tranClass;
	}
	public void setTranClass(String tranClass) {
		this.tranClass = tranClass;
	}
	
	@Override
	public String toString() {
		return "updateAcitStatus [tranId=" + tranId + ", status=" + status + ", updateUser=" + updateUser
				+ ", tranClass=" + tranClass + "]";
	}
	
}