package ph.cpi.rest.api.model.underwriting;

import org.joda.time.DateTime;

public class ExpSectionCover {
	private String policyId;
	private String lineCd;
	private String projId;
	private String riskId;
	private String section;
	private String coverCd;
	private String coverName;
	private String bulletNo;
	private String sumInsured;
	private String premRt;
	private String premAmt;
	private String addSi;
	private String discountTag;
	private String origSi;
	private String origPremRt;
	private String origPrem;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}
	public String getProjId() {
		return projId;
	}
	public void setProjId(String projId) {
		this.projId = projId;
	}
	public String getRiskId() {
		return riskId;
	}
	public void setRiskId(String riskId) {
		this.riskId = riskId;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getCoverCd() {
		return coverCd;
	}
	public void setCoverCd(String coverCd) {
		this.coverCd = coverCd;
	}
	public String getCoverName() {
		return coverName;
	}
	public void setCoverName(String coverName) {
		this.coverName = coverName;
	}
	public String getBulletNo() {
		return bulletNo;
	}
	public void setBulletNo(String bulletNo) {
		this.bulletNo = bulletNo;
	}
	public String getSumInsured() {
		return sumInsured;
	}
	public void setSumInsured(String sumInsured) {
		this.sumInsured = sumInsured;
	}
	public String getPremRt() {
		return premRt;
	}
	public void setPremRt(String premRt) {
		this.premRt = premRt;
	}
	public String getPremAmt() {
		return premAmt;
	}
	public void setPremAmt(String premAmt) {
		this.premAmt = premAmt;
	}
	public String getAddSi() {
		return addSi;
	}
	public void setAddSi(String addSi) {
		this.addSi = addSi;
	}
	public String getDiscountTag() {
		return discountTag;
	}
	public void setDiscountTag(String discountTag) {
		this.discountTag = discountTag;
	}
	public String getOrigSi() {
		return origSi;
	}
	public void setOrigSi(String origSi) {
		this.origSi = origSi;
	}
	public String getOrigPremRt() {
		return origPremRt;
	}
	public void setOrigPremRt(String origPremRt) {
		this.origPremRt = origPremRt;
	}
	public String getOrigPrem() {
		return origPrem;
	}
	public void setOrigPrem(String origPrem) {
		this.origPrem = origPrem;
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
	@Override
	public String toString() {
		return "ExpSectionCover [policyId=" + policyId + ", lineCd=" + lineCd + ", projId=" + projId + ", riskId="
				+ riskId + ", section=" + section + ", coverCd=" + coverCd + ", coverName=" + coverName + ", bulletNo="
				+ bulletNo + ", sumInsured=" + sumInsured + ", premRt=" + premRt + ", premAmt=" + premAmt + ", addSi="
				+ addSi + ", discountTag=" + discountTag + ", origSi=" + origSi + ", origPremRt=" + origPremRt
				+ ", origPrem=" + origPrem + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
}
