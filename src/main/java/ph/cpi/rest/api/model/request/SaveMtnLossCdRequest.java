package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveMtnLossCdRequest {
	
	private List<MtnSaveLossCd> saveLossCd;
	private List<MtnSaveLossCd> deleteLossCd;
	
	public List<MtnSaveLossCd> getSaveLossCd() {
		return saveLossCd;
	}
	public void setSaveLossCd(List<MtnSaveLossCd> saveLossCd) {
		this.saveLossCd = saveLossCd;
	}
	public List<MtnSaveLossCd> getDeleteLossCd() {
		return deleteLossCd;
	}
	public void setDeleteLossCd(List<MtnSaveLossCd> deleteLossCd) {
		this.deleteLossCd = deleteLossCd;
	}
	
	@Override
	public String toString() {
		return "SaveMtnLossCdRequest [saveLossCd=" + saveLossCd + ", deleteLossCd=" + deleteLossCd + "]";
	}

}

@Alias ("MtnSaveLossCd")
class MtnSaveLossCd {
	
	private String lossCd;
	private String lossAbbr;
	private String lossDesc;
	private String lossCdType;
	private String remarks;
	private String activeTag;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	public String getLossCd() {
		return lossCd;
	}
	public void setLossCd(String lossCd) {
		this.lossCd = lossCd;
	}
	public String getLossAbbr() {
		return lossAbbr;
	}
	public void setLossAbbr(String lossAbbr) {
		this.lossAbbr = lossAbbr;
	}
	public String getLossDesc() {
		return lossDesc;
	}
	public void setLossDesc(String lossDesc) {
		this.lossDesc = lossDesc;
	}
	public String getLossCdType() {
		return lossCdType;
	}
	public void setLossCdType(String lossCdType) {
		this.lossCdType = lossCdType;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getActiveTag() {
		return activeTag;
	}
	public void setActiveTag(String activeTag) {
		this.activeTag = activeTag;
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
		return "MtnSaveLossCd [lossCd=" + lossCd + ", lossAbbr=" + lossAbbr + ", lossDesc=" + lossDesc + ", lossCdType="
				+ lossCdType + ", remarks=" + remarks + ", activeTag=" + activeTag + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
}

