package ph.cpi.rest.api.model.maintenance;

import org.joda.time.LocalDateTime;

public class AdviceWordings {
	private Integer  adviceWordId;
	private String description;
	private String activeTag;
	private String adviceText01;
	private String adviceText02;
	private String adviceText03;
	private String adviceText04;
	private String adviceText05;
	private String adviceText06;
	private String adviceText07;
	private String adviceText08;
	private String adviceText09;
	private String adviceText10;
	private String remarks;
	private String createUser;
	private LocalDateTime createDate;
	private String updateUser;
	private LocalDateTime updateDate;
	
	public Integer getAdviceWordId() {
		return adviceWordId;
	}
	public void setAdviceWordId(Integer adviceWordId) {
		this.adviceWordId = adviceWordId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getActiveTag() {
		return activeTag;
	}
	public void setActiveTag(String activeTag) {
		this.activeTag = activeTag;
	}
	public String getAdviceText01() {
		return adviceText01;
	}
	public void setAdviceText01(String adviceText01) {
		this.adviceText01 = adviceText01;
	}
	public String getAdviceText02() {
		return adviceText02;
	}
	public void setAdviceText02(String adviceText02) {
		this.adviceText02 = adviceText02;
	}
	public String getAdviceText03() {
		return adviceText03;
	}
	public void setAdviceText03(String adviceText03) {
		this.adviceText03 = adviceText03;
	}
	public String getAdviceText04() {
		return adviceText04;
	}
	public void setAdviceText04(String adviceText04) {
		this.adviceText04 = adviceText04;
	}
	public String getAdviceText05() {
		return adviceText05;
	}
	public void setAdviceText05(String adviceText05) {
		this.adviceText05 = adviceText05;
	}
	public String getAdviceText06() {
		return adviceText06;
	}
	public void setAdviceText06(String adviceText06) {
		this.adviceText06 = adviceText06;
	}
	public String getAdviceText07() {
		return adviceText07;
	}
	public void setAdviceText07(String adviceText07) {
		this.adviceText07 = adviceText07;
	}
	public String getAdviceText08() {
		return adviceText08;
	}
	public void setAdviceText08(String adviceText08) {
		this.adviceText08 = adviceText08;
	}
	public String getAdviceText09() {
		return adviceText09;
	}
	public void setAdviceText09(String adviceText09) {
		this.adviceText09 = adviceText09;
	}
	public String getAdviceText10() {
		return adviceText10;
	}
	public void setAdviceText10(String adviceText10) {
		this.adviceText10 = adviceText10;
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
	
	@Override
	public String toString() {
		return "AdviceWordings [adviceWordId=" + adviceWordId + ", description=" + description + ", activeTag="
				+ activeTag + ", adviceText01=" + adviceText01 + ", adviceText02=" + adviceText02 + ", adviceText03="
				+ adviceText03 + ", adviceText04=" + adviceText04 + ", adviceText05=" + adviceText05 + ", adviceText06="
				+ adviceText06 + ", adviceText07=" + adviceText07 + ", adviceText08=" + adviceText08 + ", adviceText09="
				+ adviceText09 + ", adviceText10=" + adviceText10 + ", remarks=" + remarks + ", createUser="
				+ createUser + ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate="
				+ updateDate + "]";
	}
	
}
