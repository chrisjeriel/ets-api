package ph.cpi.rest.api.model.quote;

import org.joda.time.LocalDateTime;

public class ProjectOc {
	private Integer	projId;
	private String	projDesc;
	private Integer	riskId;
	private Integer	maxSi;
	private Integer	pctShare;
	private Integer	totalValue;
	private Integer	objectId;
	private String	site;
	private String	duration;
	private String	testing;
	private String	createUser;
	private LocalDateTime	createDate;
	private String	updateUser;
	private LocalDateTime	updateDate;
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
	public Integer getMaxSi() {
		return maxSi;
	}
	public void setMaxSi(Integer maxSi) {
		this.maxSi = maxSi;
	}
	public Integer getPctShare() {
		return pctShare;
	}
	public void setPctShare(Integer pctShare) {
		this.pctShare = pctShare;
	}
	public Integer getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(Integer totalValue) {
		this.totalValue = totalValue;
	}
	public Integer getObjectId() {
		return objectId;
	}
	public void setObjectId(Integer objectId) {
		this.objectId = objectId;
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
	@Override
	public String toString() {
		return "ProjectOc [projId=" + projId + ", projDesc=" + projDesc + ", riskId=" + riskId + ", maxSi=" + maxSi
				+ ", pctShare=" + pctShare + ", totalValue=" + totalValue + ", objectId=" + objectId + ", site=" + site
				+ ", duration=" + duration + ", testing=" + testing + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}

}
