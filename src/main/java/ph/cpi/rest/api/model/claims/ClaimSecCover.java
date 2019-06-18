package ph.cpi.rest.api.model.claims;

import java.math.BigDecimal;
import java.util.List;

import org.joda.time.DateTime;

public class ClaimSecCover {
	private String claimId;
	private String lineCd;
	private String projId;
	private String riskId;
	private String section; 
	private String coverCd; 
	private String coverName;
	private String bulletNo;
	private BigDecimal sumInsured;
	private BigDecimal premRt;
	private BigDecimal premAmt;
	private String addSi;
	private String discountTag;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
	private List<ClaimDeductibles> claimDeductible;
	public String getClaimId() {
		return claimId;
	}
	public void setClaimId(String claimId) {
		this.claimId = claimId;
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
	public BigDecimal getSumInsured() {
		return sumInsured;
	}
	public void setSumInsured(BigDecimal sumInsured) {
		this.sumInsured = sumInsured;
	}
	public BigDecimal getPremRt() {
		return premRt;
	}
	public void setPremRt(BigDecimal premRt) {
		this.premRt = premRt;
	}
	public BigDecimal getPremAmt() {
		return premAmt;
	}
	public void setPremAmt(BigDecimal premAmt) {
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
	
	public List<ClaimDeductibles> getClaimDeductible() {
		return claimDeductible;
	}
	public void setClaimDeductible(List<ClaimDeductibles> claimDeductible) {
		this.claimDeductible = claimDeductible;
	}
	@Override
	public String toString() {
		return "ClaimSecCover [claimId=" + claimId + ", lineCd=" + lineCd + ", projId=" + projId + ", riskId=" + riskId
				+ ", section=" + section + ", coverCd=" + coverCd + ", coverName=" + coverName + ", bulletNo="
				+ bulletNo + ", sumInsured=" + sumInsured + ", premRt=" + premRt + ", premAmt=" + premAmt + ", addSi="
				+ addSi + ", discountTag=" + discountTag + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", claimDeductible=" + claimDeductible
				+ "]";
	}
}
