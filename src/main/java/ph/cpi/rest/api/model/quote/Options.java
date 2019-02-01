package ph.cpi.rest.api.model.quote;

import org.joda.time.LocalDateTime;

public class Options {
	
	private Integer optionId;
	private Integer optionRt;
	private String condition;
	private Integer commRtQuota;
	private Integer commRtSurplus;
	private Integer commRtFac;
	private String createUser;
	private LocalDateTime createDate;
	private String updateUser;
	private LocalDateTime updateDate;
	private Deductibles deductibles;
	
	public Integer getOptionId() {
		return optionId;
	}
	public void setOptionId(Integer optionId) {
		this.optionId = optionId;
	}
	public Integer getOptionRt() {
		return optionRt;
	}
	public void setOptionRt(Integer optionRt) {
		this.optionRt = optionRt;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public Integer getCommRtQuota() {
		return commRtQuota;
	}
	public void setCommRtQuota(Integer commRtQuota) {
		this.commRtQuota = commRtQuota;
	}
	public Integer getCommRtSurplus() {
		return commRtSurplus;
	}
	public void setCommRtSurplus(Integer commRtSurplus) {
		this.commRtSurplus = commRtSurplus;
	}
	public Integer getCommRtFac() {
		return commRtFac;
	}
	public void setCommRtFac(Integer commRtFac) {
		this.commRtFac = commRtFac;
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
	public Deductibles getDeductibles() {
		return deductibles;
	}
	public void setDeductibles(Deductibles deductibles) {
		this.deductibles = deductibles;
	}
	@Override
	public String toString() {
		return "Options [optionId=" + optionId + ", optionRt=" + optionRt + ", condition=" + condition
				+ ", commRtQuota=" + commRtQuota + ", commRtSurplus=" + commRtSurplus + ", commRtFac=" + commRtFac
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + ", deductibles=" + deductibles + "]";
	}
}
