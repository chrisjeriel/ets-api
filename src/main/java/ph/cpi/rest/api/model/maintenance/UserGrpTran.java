package ph.cpi.rest.api.model.maintenance;

import java.util.List;

import org.joda.time.DateTime;

public class UserGrpTran {
	private Integer userGrp;    
	private Integer tranCd;    
	private String description;
	private String remarks;    
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private List<UserGrpModule> userGrpModule;
	
	public Integer getUserGrp() {
		return userGrp;
	}
	public void setUserGrp(Integer userGrp) {
		this.userGrp = userGrp;
	}
	public Integer getTranCd() {
		return tranCd;
	}
	public void setTranCd(Integer tranCd) {
		this.tranCd = tranCd;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public List<UserGrpModule> getUserGrpModule() {
		return userGrpModule;
	}
	public void setUserGrpModule(List<UserGrpModule> userGrpModule) {
		this.userGrpModule = userGrpModule;
	}
	@Override
	public String toString() {
		return "UserGrpTran [userGrp=" + userGrp + ", tranCd=" + tranCd + ", description=" + description + ", remarks="
				+ remarks + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + ", userGrpModule=" + userGrpModule + "]";
	}
}
