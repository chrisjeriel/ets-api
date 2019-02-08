package ph.cpi.rest.api.model.request;

import org.joda.time.LocalDateTime;

public class SaveQuoteCoverageRequest {
	
	private Integer quoteId ;
	private Integer projId ;
	private Integer riskId  ;
	private Integer sectionISi ;
	private Integer sectionIISi ;
	private Integer sectioIIISi ;
	private Integer totalSi ;
	private String currencyCd ;
	private Integer currencyRt ;
	private String remarks ;
	private String createUser ;
	private LocalDateTime createDate ;
	private String updateUser ;
	private LocalDateTime updateDate ;
	private Integer lineCd  ;
	private String section ;
	private Integer coverCd  ;
	private String bulletNo ;
	private Integer sumInsured ;
	private String addSi ;
	private String sectionCovercreateUser ;
	private LocalDateTime sectionCovercreateDate ;
	private String sectionCoverupdateUser ;
	private LocalDateTime sectionCoverupdateDate ;
	public Integer getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(Integer quoteId) {
		this.quoteId = quoteId;
	}
	public Integer getProjId() {
		return projId;
	}
	public void setProjId(Integer projId) {
		this.projId = projId;
	}
	public Integer getRiskId() {
		return riskId;
	}
	public void setRiskId(Integer riskId) {
		this.riskId = riskId;
	}
	public Integer getSectionISi() {
		return sectionISi;
	}
	public void setSectionISi(Integer sectionISi) {
		this.sectionISi = sectionISi;
	}
	public Integer getSectionIISi() {
		return sectionIISi;
	}
	public void setSectionIISi(Integer sectionIISi) {
		this.sectionIISi = sectionIISi;
	}
	public Integer getSectioIIISi() {
		return sectioIIISi;
	}
	public void setSectioIIISi(Integer sectioIIISi) {
		this.sectioIIISi = sectioIIISi;
	}
	public Integer getTotalSi() {
		return totalSi;
	}
	public void setTotalSi(Integer totalSi) {
		this.totalSi = totalSi;
	}
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}
	public Integer getCurrencyRt() {
		return currencyRt;
	}
	public void setCurrencyRt(Integer currencyRt) {
		this.currencyRt = currencyRt;
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
	public LocalDateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public LocalDateTime getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}
	public Integer getLineCd() {
		return lineCd;
	}
	public void setLineCd(Integer lineCd) {
		this.lineCd = lineCd;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public Integer getCoverCd() {
		return coverCd;
	}
	public void setCoverCd(Integer coverCd) {
		this.coverCd = coverCd;
	}
	public String getBulletNo() {
		return bulletNo;
	}
	public void setBulletNo(String bulletNo) {
		this.bulletNo = bulletNo;
	}
	public Integer getSumInsured() {
		return sumInsured;
	}
	public void setSumInsured(Integer sumInsured) {
		this.sumInsured = sumInsured;
	}
	public String getAddSi() {
		return addSi;
	}
	public void setAddSi(String addSi) {
		this.addSi = addSi;
	}
	public String getSectionCovercreateUser() {
		return sectionCovercreateUser;
	}
	public void setSectionCovercreateUser(String sectionCovercreateUser) {
		this.sectionCovercreateUser = sectionCovercreateUser;
	}
	public LocalDateTime getSectionCovercreateDate() {
		return sectionCovercreateDate;
	}
	public void setSectionCovercreateDate(LocalDateTime sectionCovercreateDate) {
		this.sectionCovercreateDate = sectionCovercreateDate;
	}
	public String getSectionCoverupdateUser() {
		return sectionCoverupdateUser;
	}
	public void setSectionCoverupdateUser(String sectionCoverupdateUser) {
		this.sectionCoverupdateUser = sectionCoverupdateUser;
	}
	public LocalDateTime getSectionCoverupdateDate() {
		return sectionCoverupdateDate;
	}
	public void setSectionCoverupdateDate(LocalDateTime sectionCoverupdateDate) {
		this.sectionCoverupdateDate = sectionCoverupdateDate;
	}
	@Override
	public String toString() {
		return "SaveQuoteCoverageRequest [quoteId=" + quoteId + ", projId=" + projId + ", riskId=" + riskId
				+ ", sectionISi=" + sectionISi + ", sectionIISi=" + sectionIISi + ", sectioIIISi=" + sectioIIISi
				+ ", totalSi=" + totalSi + ", currencyCd=" + currencyCd + ", currencyRt=" + currencyRt + ", remarks="
				+ remarks + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + ", lineCd=" + lineCd + ", section=" + section + ", coverCd=" + coverCd
				+ ", bulletNo=" + bulletNo + ", sumInsured=" + sumInsured + ", addSi=" + addSi
				+ ", sectionCovercreateUser=" + sectionCovercreateUser + ", sectionCovercreateDate="
				+ sectionCovercreateDate + ", sectionCoverupdateUser=" + sectionCoverupdateUser
				+ ", sectionCoverupdateDate=" + sectionCoverupdateDate + "]";
	}
	
	
}