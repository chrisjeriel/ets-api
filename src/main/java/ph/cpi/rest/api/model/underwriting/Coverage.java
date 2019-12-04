package ph.cpi.rest.api.model.underwriting;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.type.Alias;
import org.joda.time.DateTime;

@Alias("UnderwritingCoverage")
public class Coverage {
	
	private BigDecimal prevSectionISi;
	private BigDecimal prevSectionIISi;
	private BigDecimal prevSectionIIISi;
	private BigDecimal prevTotalSi;
	private BigDecimal prevSectionIPrem;
	private BigDecimal prevSectionIIPrem;
	private BigDecimal prevSectionIIIPrem;
	private BigDecimal prevTotalPrem;
	
	private BigDecimal sectionISi;
	private BigDecimal sectionIISi;
	private BigDecimal sectionIIISi;
	private BigDecimal totalSi;
	private BigDecimal sectionIPrem;
	private BigDecimal sectionIIPrem;
	private BigDecimal sectionIIIPrem;
	private BigDecimal totalPrem;
	private BigDecimal holdCoverPremAmt;
	private String currencyCd;
	private BigDecimal currencyRt;
	private BigDecimal pctShare;
	private BigDecimal pctPml;
	private BigDecimal totalValue;
	private String remarks;
	private BigDecimal exSeciPrem;
	private BigDecimal exSeciiPrem;
	private BigDecimal exSeciiiPrem;
	private BigDecimal exTprem;
	private BigDecimal exCumTprem;
	private BigDecimal exDays;
	private BigDecimal totalDays;
	private BigDecimal cumSecISi;
	private BigDecimal cumSecIISi;
	private BigDecimal cumSecIIISi;
	private BigDecimal cumTSi;
	private BigDecimal cumSecIPrem;
	private BigDecimal cumSecIIPrem;
	private BigDecimal cumSecIIIPrem;
	private BigDecimal cumTPrem;
	private BigDecimal commRtQuota;
	private BigDecimal commRtSurplus;
	private BigDecimal commRtFac;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private String holdCoverTag;
	private String extensionTag;
	private List<SectionCovers> sectionCovers;

	public BigDecimal getPrevSectionISi() {
		return prevSectionISi;
	}

	public void setPrevSectionISi(BigDecimal prevSectionISi) {
		this.prevSectionISi = prevSectionISi;
	}

	public BigDecimal getPrevSectionIISi() {
		return prevSectionIISi;
	}

	public void setPrevSectionIISi(BigDecimal prevSectionIISi) {
		this.prevSectionIISi = prevSectionIISi;
	}

	public BigDecimal getPrevSectionIIISi() {
		return prevSectionIIISi;
	}

	public void setPrevSectionIIISi(BigDecimal prevSectionIIISi) {
		this.prevSectionIIISi = prevSectionIIISi;
	}

	public BigDecimal getPrevTotalSi() {
		return prevTotalSi;
	}

	public void setPrevTotalSi(BigDecimal prevTotalSi) {
		this.prevTotalSi = prevTotalSi;
	}

	public BigDecimal getPrevSectionIPrem() {
		return prevSectionIPrem;
	}

	public void setPrevSectionIPrem(BigDecimal prevSectionIPrem) {
		this.prevSectionIPrem = prevSectionIPrem;
	}

	public BigDecimal getPrevSectionIIPrem() {
		return prevSectionIIPrem;
	}

	public void setPrevSectionIIPrem(BigDecimal prevSectionIIPrem) {
		this.prevSectionIIPrem = prevSectionIIPrem;
	}

	public BigDecimal getPrevSectionIIIPrem() {
		return prevSectionIIIPrem;
	}

	public void setPrevSectionIIIPrem(BigDecimal prevSectionIIIPrem) {
		this.prevSectionIIIPrem = prevSectionIIIPrem;
	}

	public BigDecimal getPrevTotalPrem() {
		return prevTotalPrem;
	}

	public void setPrevTotalPrem(BigDecimal prevTotalPrem) {
		this.prevTotalPrem = prevTotalPrem;
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
	
	
	public BigDecimal getHoldCoverPremAmt() {
		return holdCoverPremAmt;
	}

	public void setHoldCoverPremAmt(BigDecimal holdCoverPremAmt) {
		this.holdCoverPremAmt = holdCoverPremAmt;
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

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
	public BigDecimal getExSeciPrem() {
		return exSeciPrem;
	}

	public void setExSeciPrem(BigDecimal exSeciPrem) {
		this.exSeciPrem = exSeciPrem;
	}

	public BigDecimal getExSeciiPrem() {
		return exSeciiPrem;
	}

	public void setExSeciiPrem(BigDecimal exSeciiPrem) {
		this.exSeciiPrem = exSeciiPrem;
	}

	public BigDecimal getExSeciiiPrem() {
		return exSeciiiPrem;
	}

	public void setExSeciiiPrem(BigDecimal exSeciiiPrem) {
		this.exSeciiiPrem = exSeciiiPrem;
	}

	public BigDecimal getExTprem() {
		return exTprem;
	}

	public void setExTprem(BigDecimal exTprem) {
		this.exTprem = exTprem;
	}
	
	public BigDecimal getExCumTprem() {
		return exCumTprem;
	}

	public void setExCumTprem(BigDecimal exCumTprem) {
		this.exCumTprem = exCumTprem;
	}

	public BigDecimal getExDays() {
		return exDays;
	}

	public void setExDays(BigDecimal exDays) {
		this.exDays = exDays;
	}

	public BigDecimal getTotalDays() {
		return totalDays;
	}

	public void setTotalDays(BigDecimal totalDays) {
		this.totalDays = totalDays;
	}

	public BigDecimal getCumSecISi() {
		return cumSecISi;
	}

	public void setCumSecISi(BigDecimal cumSecISi) {
		this.cumSecISi = cumSecISi;
	}

	public BigDecimal getCumSecIISi() {
		return cumSecIISi;
	}

	public void setCumSecIISi(BigDecimal cumSecIISi) {
		this.cumSecIISi = cumSecIISi;
	}

	public BigDecimal getCumSecIIISi() {
		return cumSecIIISi;
	}

	public void setCumSecIIISi(BigDecimal cumSecIIISi) {
		this.cumSecIIISi = cumSecIIISi;
	}

	public BigDecimal getCumTSi() {
		return cumTSi;
	}

	public void setCumTSi(BigDecimal cumTSi) {
		this.cumTSi = cumTSi;
	}

	public BigDecimal getCumSecIPrem() {
		return cumSecIPrem;
	}

	public void setCumSecIPrem(BigDecimal cumSecIPrem) {
		this.cumSecIPrem = cumSecIPrem;
	}

	public BigDecimal getCumSecIIPrem() {
		return cumSecIIPrem;
	}

	public void setCumSecIIPrem(BigDecimal cumSecIIPrem) {
		this.cumSecIIPrem = cumSecIIPrem;
	}

	public BigDecimal getCumSecIIIPrem() {
		return cumSecIIIPrem;
	}

	public void setCumSecIIIPrem(BigDecimal cumSecIIIPrem) {
		this.cumSecIIIPrem = cumSecIIIPrem;
	}

	public BigDecimal getCumTPrem() {
		return cumTPrem;
	}

	public void setCumTPrem(BigDecimal cumTPrem) {
		this.cumTPrem = cumTPrem;
	}

	public String getCreateUser() {
		return createUser;
	}
	
	public BigDecimal getCommRtQuota() {
		return commRtQuota;
	}

	public void setCommRtQuota(BigDecimal commRtQuota) {
		this.commRtQuota = commRtQuota;
	}

	public BigDecimal getCommRtSurplus() {
		return commRtSurplus;
	}

	public void setCommRtSurplus(BigDecimal commRtSurplus) {
		this.commRtSurplus = commRtSurplus;
	}

	public BigDecimal getCommRtFac() {
		return commRtFac;
	}

	public void setCommRtFac(BigDecimal commRtFac) {
		this.commRtFac = commRtFac;
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
	
	
	public String getHoldCoverTag() {
		return holdCoverTag;
	}

	public void setHoldCoverTag(String holdCoverTag) {
		this.holdCoverTag = holdCoverTag;
	}
	
	public String getExtensionTag() {
		return extensionTag;
	}

	public void setExtensionTag(String extensionTag) {
		this.extensionTag = extensionTag;
	}

	public List<SectionCovers> getSectionCovers() {
		return sectionCovers;
	}

	public void setSectionCovers(List<SectionCovers> sectionCovers) {
		this.sectionCovers = sectionCovers;
	}

	@Override
	public String toString() {
		return "Coverage [prevSectionISi=" + prevSectionISi + ", prevSectionIISi=" + prevSectionIISi
				+ ", prevSectionIIISi=" + prevSectionIIISi + ", prevTotalSi=" + prevTotalSi + ", prevSectionIPrem="
				+ prevSectionIPrem + ", prevSectionIIPrem=" + prevSectionIIPrem + ", prevSectionIIIPrem="
				+ prevSectionIIIPrem + ", prevTotalPrem=" + prevTotalPrem + ", sectionISi=" + sectionISi
				+ ", sectionIISi=" + sectionIISi + ", sectionIIISi=" + sectionIIISi + ", totalSi=" + totalSi
				+ ", sectionIPrem=" + sectionIPrem + ", sectionIIPrem=" + sectionIIPrem + ", sectionIIIPrem="
				+ sectionIIIPrem + ", totalPrem=" + totalPrem + ", holdCoverPremAmt=" + holdCoverPremAmt
				+ ", currencyCd=" + currencyCd + ", currencyRt=" + currencyRt + ", pctShare=" + pctShare + ", pctPml="
				+ pctPml + ", totalValue=" + totalValue + ", remarks=" + remarks + ", exSeciPrem=" + exSeciPrem
				+ ", exSeciiPrem=" + exSeciiPrem + ", exSeciiiPrem=" + exSeciiiPrem + ", exTprem=" + exTprem
				+ ", exCumTprem=" + exCumTprem + ", exDays=" + exDays + ", totalDays=" + totalDays + ", cumSecISi="
				+ cumSecISi + ", cumSecIISi=" + cumSecIISi + ", cumSecIIISi=" + cumSecIIISi + ", cumTSi=" + cumTSi
				+ ", cumSecIPrem=" + cumSecIPrem + ", cumSecIIPrem=" + cumSecIIPrem + ", cumSecIIIPrem=" + cumSecIIIPrem
				+ ", cumTPrem=" + cumTPrem + ", commRtQuota=" + commRtQuota + ", commRtSurplus=" + commRtSurplus
				+ ", commRtFac=" + commRtFac + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", holdCoverTag=" + holdCoverTag
				+ ", extensionTag=" + extensionTag + ", sectionCovers=" + sectionCovers + "]";
	}
}
