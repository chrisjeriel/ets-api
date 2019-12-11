package ph.cpi.rest.api.model.request;

import java.util.List;

public class UpdateAcseStatRequest {
	private List<AcseStat> updateAcseStatList;

	public List<AcseStat> getUpdateAcseStatList() {
		return updateAcseStatList;
	}

	public void setUpdateAcseStatList(List<AcseStat> updateAcseStatList) {
		this.updateAcseStatList = updateAcseStatList;
	}

	@Override
	public String toString() {
		return "UpdateAcseStatRequest [updateAcseStatList=" + updateAcseStatList + "]";
	}
}

class AcseStat {
	private String tranId;
	private String status;
	private String updateUser;
	private String tranClass;
	private String cancelReason;
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
	public String getCancelReason() {
		return cancelReason;
	}
	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}
	@Override
	public String toString() {
		return "AcseStat [tranId=" + tranId + ", status=" + status + ", updateUser=" + updateUser + ", tranClass="
				+ tranClass + ", cancelReason=" + cancelReason + "]";
	}
}