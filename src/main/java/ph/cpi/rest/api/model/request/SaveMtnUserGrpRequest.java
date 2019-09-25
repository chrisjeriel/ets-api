package ph.cpi.rest.api.model.request;

import java.util.List;

import ph.cpi.rest.api.model.maintenance.UserGrp;

public class SaveMtnUserGrpRequest {

	private List<UserGrp> userGrpList;
	private List<UserGrp> delUserGrpList;

	public List<UserGrp> getUserGrpList() {
		return userGrpList;
	}

	public void setUserGrpList(List<UserGrp> userGrpList) {
		this.userGrpList = userGrpList;
	}
	
	public List<UserGrp> getDelUserGrpList() {
		return delUserGrpList;
	}

	public void setDelUserGrpList(List<UserGrp> delUserGrpList) {
		this.delUserGrpList = delUserGrpList;
	}

	@Override
	public String toString() {
		return "SaveMtnUserGrpRequest [userGrpList=" + userGrpList + ", delUserGrpList=" + delUserGrpList
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
