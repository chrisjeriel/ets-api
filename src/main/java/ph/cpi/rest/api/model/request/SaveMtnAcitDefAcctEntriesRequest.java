package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveMtnAcitDefAcctEntriesRequest {
	private List<defAcctEntries> saveAcctEnt;
	private List<defAcctEntries> delAcctEnt;
	public List<defAcctEntries> getSaveAcctEnt() {
		return saveAcctEnt;
	}
	public void setSaveAcctEnt(List<defAcctEntries> saveAcctEnt) {
		this.saveAcctEnt = saveAcctEnt;
	}
	public List<defAcctEntries> getDelAcctEnt() {
		return delAcctEnt;
	}
	public void setDelAcctEnt(List<defAcctEntries> delAcctEnt) {
		this.delAcctEnt = delAcctEnt;
	}
	@Override
	public String toString() {
		return "SaveMtnAcitDefAcctEntriesRequest [saveAcctEnt=" + saveAcctEnt + ", delAcctEnt=" + delAcctEnt + "]";
	}
	
}

class defAcctEntries{
	private String tranClass;
    private Integer tranTypeCd;
    private Integer entryNo;
    private Integer glAcctId;
    private Integer slTypeCd;
    private String sub1Dep;
    private String sub2Dep;
    private String sub3Dep;
    private String drCrTag;
    private String tranAmtTag;
    private String netDrcrTag;
    private String createUser;
    private String createDate;
    private String updateUser;
    private String updateDate;
	public String getTranClass() {
		return tranClass;
	}
	public void setTranClass(String tranClass) {
		this.tranClass = tranClass;
	}
	public Integer getTranTypeCd() {
		return tranTypeCd;
	}
	public void setTranTypeCd(Integer tranTypeCd) {
		this.tranTypeCd = tranTypeCd;
	}
	public Integer getEntryNo() {
		return entryNo;
	}
	public void setEntryNo(Integer entryNo) {
		this.entryNo = entryNo;
	}
	public Integer getGlAcctId() {
		return glAcctId;
	}
	public void setGlAcctId(Integer glAcctId) {
		this.glAcctId = glAcctId;
	}
	public Integer getSlTypeCd() {
		return slTypeCd;
	}
	public void setSlTypeCd(Integer slTypeCd) {
		this.slTypeCd = slTypeCd;
	}
	public String getSub1Dep() {
		return sub1Dep;
	}
	public void setSub1Dep(String sub1Dep) {
		this.sub1Dep = sub1Dep;
	}
	public String getSub2Dep() {
		return sub2Dep;
	}
	public void setSub2Dep(String sub2Dep) {
		this.sub2Dep = sub2Dep;
	}
	public String getSub3Dep() {
		return sub3Dep;
	}
	public void setSub3Dep(String sub3Dep) {
		this.sub3Dep = sub3Dep;
	}
	public String getDrCrTag() {
		return drCrTag;
	}
	public void setDrCrTag(String drCrTag) {
		this.drCrTag = drCrTag;
	}
	public String getTranAmtTag() {
		return tranAmtTag;
	}
	public void setTranAmtTag(String tranAmtTag) {
		this.tranAmtTag = tranAmtTag;
	}
	public String getNetDrcrTag() {
		return netDrcrTag;
	}
	public void setNetDrcrTag(String netDrcrTag) {
		this.netDrcrTag = netDrcrTag;
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
		return "defAcctEntries [tranClass=" + tranClass + ", tranTypeCd=" + tranTypeCd + ", entryNo=" + entryNo
				+ ", glAcctId=" + glAcctId + ", slTypeCd=" + slTypeCd + ", sub1Dep=" + sub1Dep + ", sub2Dep=" + sub2Dep
				+ ", sub3Dep=" + sub3Dep + ", drCrTag=" + drCrTag + ", tranAmtTag=" + tranAmtTag + ", netDrcrTag="
				+ netDrcrTag + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser="
				+ updateUser + ", updateDate=" + updateDate + "]";
	}
    
    
}