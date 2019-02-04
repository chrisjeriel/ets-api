package ph.cpi.rest.api.model.quote;


import java.math.BigDecimal;
import java.util.List;

import org.joda.time.LocalDateTime;

public class ProjectOc {
	private Integer	projId;
	private String	projDesc;
	private Integer	riskId;
	private String riskName;
	private Integer	maxSiI; //Check and remap in XML
	private BigDecimal maxSi;
	private Integer	pctShareI; //Check and remap in XML
	private BigDecimal pctShare;
	private Integer	totalValueI; //Check and remap in XML
	private BigDecimal totalValue;
	private Integer	objectId;
	private String objectDesc;
	private String	site;
	private String	duration;
	private String	testing;
	private String	createUser;
	private LocalDateTime	createDate;
	private String	updateUser;
	private LocalDateTime	updateDate;
	private List<EndorsementsOc> endorsementsOc;
	private CoverageOc coverageOc;
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
	public Integer getMaxSiI() {
		return maxSiI;
	}
	public void setMaxSiI(Integer maxSiI) {
		this.maxSiI = maxSiI;
	}
	public BigDecimal getMaxSi() {
		return maxSi;
	}
	public void setMaxSi(BigDecimal maxSi) {
		this.maxSi = maxSi;
	}
	public Integer getPctShareI() {
		return pctShareI;
	}
	public void setPctShareI(Integer pctShareI) {
		this.pctShareI = pctShareI;
	}
	public BigDecimal getPctShare() {
		return pctShare;
	}
	public void setPctShare(BigDecimal pctShare) {
		this.pctShare = pctShare;
	}
	public Integer getTotalValueI() {
		return totalValueI;
	}
	public void setTotalValueI(Integer totalValueI) {
		this.totalValueI = totalValueI;
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
	public List<EndorsementsOc> getEndorsementsOc() {
		return endorsementsOc;
	}
	public void setEndorsementsOc(List<EndorsementsOc> endorsementsOc) {
		this.endorsementsOc = endorsementsOc;
	}
	public CoverageOc getCoverageOc() {
		return coverageOc;
	}
	public void setCoverageOc(CoverageOc coverageOc) {
		this.coverageOc = coverageOc;
	}
	@Override
	public String toString() {
		return "ProjectOc [projId=" + projId + ", projDesc=" + projDesc + ", riskId=" + riskId + ", riskName="
				+ riskName + ", maxSiI=" + maxSiI + ", maxSi=" + maxSi + ", pctShareI=" + pctShareI + ", pctShare="
				+ pctShare + ", totalValueI=" + totalValueI + ", totalValue=" + totalValue + ", objectId=" + objectId
				+ ", objectDesc=" + objectDesc + ", site=" + site + ", duration=" + duration + ", testing=" + testing
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + ", endorsementsOc=" + endorsementsOc + ", coverageOc=" + coverageOc
				+ "]";
	}
	
}