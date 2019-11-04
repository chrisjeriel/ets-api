package ph.cpi.rest.api.model.request;

import java.util.List;

import org.joda.time.DateTime;

public class UpdateAcseStatusRequest {
	private List<changeStat> changeStat;
	
	
	public List<changeStat> getChangeStat() {
		return changeStat;
	}


	public void setChangeStat(List<changeStat> changeStat) {
		this.changeStat = changeStat;
	}


	@Override
	public String toString() {
		return "UpdateAcseStatusRequest [changeStat=" + changeStat + "]";
	}
}

class changeStat{
	private String tranClass;
	private Integer tranId;
	private String updateUser;
	private String updateDate;
	public String getTranClass() {
		return tranClass;
	}
	public void setTranClass(String tranClass) {
		this.tranClass = tranClass;
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
		return "changeStat [tranClass=" + tranClass + ", tranId=" + tranId + ", updateUser=" + updateUser + "]";
	}
	
}