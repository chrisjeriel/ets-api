package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;


public class SaveMtnCrestaZoneRequest {
	private List<MtnCrestaZone> saveCrestaZone;
	private List<MtnCrestaZone> delCrestaZone;
	public List<MtnCrestaZone> getSaveCrestaZone() {
		return saveCrestaZone;
	}
	public void setSaveCrestaZone(List<MtnCrestaZone> saveCrestaZone) {
		this.saveCrestaZone = saveCrestaZone;
	}
	public List<MtnCrestaZone> getDelCrestaZone() {
		return delCrestaZone;
	}
	public void setDelCrestaZone(List<MtnCrestaZone> delCrestaZone) {
		this.delCrestaZone = delCrestaZone;
	}
	
	
}

@Alias ("saveMtnCresta")
class MtnCrestaZone {
	private String zoneCd;
	private String zoneDesc;
	private String activeTag;
	private String remarks;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	public String getZoneCd() {
		return zoneCd;
	}
	public void setZoneCd(String zoneCd) {
		this.zoneCd = zoneCd;
	}
	public String getZoneDesc() {
		return zoneDesc;
	}
	public void setZoneDesc(String zoneDesc) {
		this.zoneDesc = zoneDesc;
	}
	public String getActiveTag() {
		return activeTag;
	}
	public void setActiveTag(String activeTag) {
		this.activeTag = activeTag;
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
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
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
		return "CrestaZone [zoneCd=" + zoneCd + ", zoneDesc=" + zoneDesc + ", activeTag=" + activeTag + ", remarks="
				+ remarks + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
	
}