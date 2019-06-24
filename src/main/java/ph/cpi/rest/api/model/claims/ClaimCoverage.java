package ph.cpi.rest.api.model.claims;

import java.math.BigDecimal;
import java.util.List;

import org.joda.time.DateTime;

public class ClaimCoverage {
	private String claimId;
	private String claimNo;
	private String policyId;
	private String quoteId;
	private String projId;
	private String riskId;
	private BigDecimal sectionISi;
	private BigDecimal sectionIISi;
	private BigDecimal sectionIIISi;
	private BigDecimal totalSi;
	private String secISiTag;
	private String secIISiTag;
	private String secIIISiTag;
	private BigDecimal allowMaxSi;
	private BigDecimal sectionIPrem;
	private BigDecimal sectionIIPrem;
	private BigDecimal sectionIIIPrem;
	private BigDecimal totalPrem;
	private String currencyCd;
	private BigDecimal currencyRt;
	private BigDecimal pctShare;
	private BigDecimal pctPml;
	private BigDecimal totalValue;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
	private List<ClaimSecCover> clmClaimSecCover;
	public String getClaimId() {
		return claimId;
	}
	public void setClaimId(String claimId) {
		this.claimId = claimId;
	}
	
	public String getClaimNo() {
		return claimNo;
	}
	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}
	
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
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
	public BigDecimal getSectionISi() {
		return sectionISi;
	}
	public void setSectionISi(BigDecimal sectionISi) {
		this.sectionISi = sectionISi;
	}
	public BigDecimal getSectionIISi() {
		return sectionIISi;
	}
	public void setSectionIISi(BigDecimal sectionIISi) {
		this.sectionIISi = sectionIISi;
	}
	public BigDecimal getSectionIIISi() {
		return sectionIIISi;
	}
	public void setSectionIIISi(BigDecimal sectionIIISi) {
		this.sectionIIISi = sectionIIISi;
	}
	public BigDecimal getTotalSi() {
		return totalSi;
	}
	public void setTotalSi(BigDecimal totalSi) {
		this.totalSi = totalSi;
	}
	
	public String getSecISiTag() {
		return secISiTag;
	}
	public void setSecISiTag(String secISiTag) {
		this.secISiTag = secISiTag;
	}
	public String getSecIISiTag() {
		return secIISiTag;
	}
	public void setSecIISiTag(String secIISiTag) {
		this.secIISiTag = secIISiTag;
	}
	public String getSecIIISiTag() {
		return secIIISiTag;
	}
	public void setSecIIISiTag(String secIIISiTag) {
		this.secIIISiTag = secIIISiTag;
	}
	public BigDecimal getAllowMaxSi() {
		return allowMaxSi;
	}
	public void setAllowMaxSi(BigDecimal allowMaxSi) {
		this.allowMaxSi = allowMaxSi;
	}
	public BigDecimal getSectionIPrem() {
		return sectionIPrem;
	}
	public void setSectionIPrem(BigDecimal sectionIPrem) {
		this.sectionIPrem = sectionIPrem;
	}
	public BigDecimal getSectionIIPrem() {
		return sectionIIPrem;
	}
	public void setSectionIIPrem(BigDecimal sectionIIPrem) {
		this.sectionIIPrem = sectionIIPrem;
	}
	public BigDecimal getSectionIIIPrem() {
		return sectionIIIPrem;
	}
	public void setSectionIIIPrem(BigDecimal sectionIIIPrem) {
		this.sectionIIIPrem = sectionIIIPrem;
	}
	public BigDecimal getTotalPrem() {
		return totalPrem;
	}
	public void setTotalPrem(BigDecimal totalPrem) {
		this.totalPrem = totalPrem;
	}
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}
	public BigDecimal getCurrencyRt() {
		return currencyRt;
	}
	public void setCurrencyRt(BigDecimal currencyRt) {
		this.currencyRt = currencyRt;
	}
	public BigDecimal getPctShare() {
		return pctShare;
	}
	public void setPctShare(BigDecimal pctShare) {
		this.pctShare = pctShare;
	}
	public BigDecimal getPctPml() {
		return pctPml;
	}
	public void setPctPml(BigDecimal pctPml) {
		this.pctPml = pctPml;
	}
	public BigDecimal getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(BigDecimal totalValue) {
		this.totalValue = totalValue;
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
	
	public List<ClaimSecCover> getClmClaimSecCover() {
		return clmClaimSecCover;
	}
	public void setClmClaimSecCover(List<ClaimSecCover> clmClaimSecCover) {
		this.clmClaimSecCover = clmClaimSecCover;
	}
	@Override
	public String toString() {
		return "ClaimCoverage [claimId=" + claimId + ", claimNo=" + claimNo + ", projId=" + projId + ", riskId="
				+ riskId + ", sectionISi=" + sectionISi + ", sectionIISi=" + sectionIISi + ", sectionIIISi="
				+ sectionIIISi + ", totalSi=" + totalSi + ", secISiTag=" + secISiTag + ", secIISiTag=" + secIISiTag
				+ ", secIIISiTag=" + secIIISiTag + ", allowMaxSi=" + allowMaxSi + ", sectionIPrem=" + sectionIPrem
				+ ", sectionIIPrem=" + sectionIIPrem + ", sectionIIIPrem=" + sectionIIIPrem + ", totalPrem=" + totalPrem
				+ ", currencyCd=" + currencyCd + ", currencyRt=" + currencyRt + ", pctShare=" + pctShare + ", pctPml="
				+ pctPml + ", totalValue=" + totalValue + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", clmClaimSecCover=" + clmClaimSecCover
				+ "]";
	}
	
	
}
