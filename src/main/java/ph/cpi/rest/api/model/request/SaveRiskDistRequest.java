package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveRiskDistRequest {
	private List<WParam> saveWParam;
	private List<WParam> delWParam;
	private String policyId;
	private String riskDistId;
	private String altNo;
	private String retLineAmt;
	private String autoCalc;
	private String updateUser;
	private String seciiPremTag;
	private String trtyLimitSec2;
	public List<WParam> getSaveWParam() {
		return saveWParam;
	}
	public void setSaveWParam(List<WParam> saveWParam) {
		this.saveWParam = saveWParam;
	}
	public List<WParam> getDelWParam() {
		return delWParam;
	}
	public void setDelWParam(List<WParam> delWParam) {
		this.delWParam = delWParam;
	}
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getRiskDistId() {
		return riskDistId;
	}
	public void setRiskDistId(String riskDistId) {
		this.riskDistId = riskDistId;
	}
	public String getAltNo() {
		return altNo;
	}
	public void setAltNo(String altNo) {
		this.altNo = altNo;
	}
	public String getRetLineAmt() {
		return retLineAmt;
	}
	public void setRetLineAmt(String retLineAmt) {
		this.retLineAmt = retLineAmt;
	}
	public String getAutoCalc() {
		return autoCalc;
	}
	public void setAutoCalc(String autoCalc) {
		this.autoCalc = autoCalc;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public String getSeciiPremTag() {
		return seciiPremTag;
	}
	public void setSeciiPremTag(String seciiPremTag) {
		this.seciiPremTag = seciiPremTag;
	}
	public String getTrtyLimitSec2() {
		return trtyLimitSec2;
	}
	public void setTrtyLimitSec2(String trtyLimitSec2) {
		this.trtyLimitSec2 = trtyLimitSec2;
	}
	@Override
	public String toString() {
		return "SaveRiskDistRequest [saveWParam=" + saveWParam + ", delWParam=" + delWParam + ", policyId=" + policyId
				+ ", riskDistId=" + riskDistId + ", altNo=" + altNo + ", retLineAmt=" + retLineAmt + ", autoCalc="
				+ autoCalc + ", updateUser=" + updateUser + ", seciiPremTag=" + seciiPremTag + ", trtyLimitSec2="
				+ trtyLimitSec2 + "]";
	}
}

class WParam{
	private String riskDistId;
	private String altNo;
	private String treatyYear;
	private String treatyId;
	private String trtyCedId;
	private String pctShare;
	private String commRt;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	public String getRiskDistId() {
		return riskDistId;
	}
	public void setRiskDistId(String riskDistId) {
		this.riskDistId = riskDistId;
	}
	public String getAltNo() {
		return altNo;
	}
	public void setAltNo(String altNo) {
		this.altNo = altNo;
	}
	public String getTreatyYear() {
		return treatyYear;
	}
	public void setTreatyYear(String treatyYear) {
		this.treatyYear = treatyYear;
	}
	public String getTreatyId() {
		return treatyId;
	}
	public void setTreatyId(String treatyId) {
		this.treatyId = treatyId;
	}
	public String getTrtyCedId() {
		return trtyCedId;
	}
	public void setTrtyCedId(String trtyCedId) {
		this.trtyCedId = trtyCedId;
	}
	public String getPctShare() {
		return pctShare;
	}
	public void setPctShare(String pctShare) {
		this.pctShare = pctShare;
	}
	public String getCommRt() {
		return commRt;
	}
	public void setCommRt(String commRt) {
		this.commRt = commRt;
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
		return "WParam [riskDistId=" + riskDistId + ", altNo=" + altNo + ", treatyYear=" + treatyYear + ", treatyId="
				+ treatyId + ", trtyCedId=" + trtyCedId + ", pctShare=" + pctShare + ", commRt=" + commRt
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
	
	
}