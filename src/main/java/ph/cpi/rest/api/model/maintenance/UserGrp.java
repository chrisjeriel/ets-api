package ph.cpi.rest.api.model.maintenance;

import java.util.List;

import org.joda.time.DateTime;

public class UserGrp {
	private Integer userGrp;     
	private String userGrpDesc;
	private String remarks;      
	private String createUser;  
	private DateTime createDate;  
	private String updateUser; 
	private DateTime updateDate;
	private List<UserGrpTran> userGrpTran;
	
	public Integer getUserGrp() {
		return userGrp;
	}
	public void setUserGrp(Integer userGrp) {
		this.userGrp = userGrp;
	}
	public String getUserGrpDesc() {
		return userGrpDesc;
	}
	public void setUserGrpDesc(String userGrpDesc) {
		this.userGrpDesc = userGrpDesc;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public DateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(DateTime createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public DateTime getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(DateTime updateDate) {
		this.updateDate = updateDate;
	}
	public List<UserGrpTran> getUserGrpTran() {
		return userGrpTran;
	}
	public void setUserGrpTran(List<UserGrpTran> userGrpTran) {
		this.userGrpTran = userGrpTran;
	}
	@Override
	public String toString() {
		return "UserGrp [userGrp=" + userGrp + ", userGrpDesc=" + userGrpDesc + ", remarks=" + remarks + ", createUser="
				+ createUser + ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate="
				+ updateDate + ", userGrpTran=" + userGrpTran + "]";
	} 
}
