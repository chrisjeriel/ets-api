package ph.cpi.rest.api.model.quote;

import java.math.BigDecimal;

import org.joda.time.LocalDateTime;

public class Project {
	private Integer quoteId;
	private Integer projId;
	private String projDesc;
	private Integer riskId;
	private String riskName;
	private BigDecimal totalSi;
	private BigDecimal pctShare;
	private BigDecimal totalValue;
	private Integer objectId;
	private String objectDesc;
	private String site;
	private String duration;
	private String testing;
	private Integer ipl;
	private Integer timeExc;
	private Integer noClaimPd;
	private String createUser;
	private LocalDateTime createDate;
	private String updateUser;
	private LocalDateTime updateDate;
	private Coverage coverage;
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
	public String getProjDesc() {
		return projDesc;
	}
	public void setProjDesc(String projDesc) {
		this.projDesc = projDesc;
	}
	public Integer getRiskId() {
		return riskId;
	}
	public void setRiskId(Integer riskId) {
		this.riskId = riskId;
	}
	public String getRiskName() {
		return riskName;
	}
	public void setRiskName(String riskName) {
		this.riskName = riskName;
	}
	public BigDecimal getTotalSi() {
		return totalSi;
	}
	public void setTotalSi(BigDecimal totalSi) {
		this.totalSi = totalSi;
	}
	public BigDecimal getPctShare() {
		return pctShare;
	}
	public void setPctShare(BigDecimal pctShare) {
		this.pctShare = pctShare;
	}
	public BigDecimal getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(BigDecimal totalValue) {
		this.totalValue = totalValue;
	}
	public Integer getObjectId() {
		return objectId;
	}
	public void setObjectId(Integer objectId) {
		this.objectId = objectId;
	}
	public String getObjectDesc() {
		return objectDesc;
	}
	public void setObjectDesc(String objectDesc) {
		this.objectDesc = objectDesc;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getTesting() {
		return testing;
	}
	public void setTesting(String testing) {
		this.testing = testing;
	}
	public Integer getIpl() {
		return ipl;
	}
	public void setIpl(Integer ipl) {
		this.ipl = ipl;
	}
	public Integer getTimeExc() {
		return timeExc;
	}
	public void setTimeExc(Integer timeExc) {
		this.timeExc = timeExc;
	}
	public Integer getNoClaimPd() {
		return noClaimPd;
	}
	public void setNoClaimPd(Integer noClaimPd) {
		this.noClaimPd = noClaimPd;
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
	public Coverage getCoverage() {
		return coverage;
	}
	public void setCoverage(Coverage coverage) {
		this.coverage = coverage;
	}
	@Override
	public String toString() {
		return "Project [quoteId=" + quoteId + ", projId=" + projId + ", projDesc=" + projDesc + ", riskId=" + riskId
				+ ", riskName=" + riskName + ", totalSi=" + totalSi + ", pctShare=" + pctShare + ", totalValue="
				+ totalValue + ", objectId=" + objectId + ", objectDesc=" + objectDesc + ", site=" + site
				+ ", duration=" + duration + ", testing=" + testing + ", ipl=" + ipl + ", timeExc=" + timeExc
				+ ", noClaimPd=" + noClaimPd + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", coverage=" + coverage + "]";
	}
	
	
	
}
