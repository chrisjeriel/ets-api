package ph.cpi.rest.api.model.quote;

import java.math.BigDecimal;
import java.util.List;

import org.joda.time.LocalDateTime;

public class Options {
	private Integer optionId;
	private BigDecimal optioRt;
	private String condition;
	private BigDecimal commRtQuota;
	private BigDecimal commRtSurplus;
	private BigDecimal commRtFac;
	private String createUser;
	private LocalDateTime createDate;
	private String updateUser;
	private LocalDateTime updateDate;
	private List<Deductibles> deductiblesList;
	private List<Endorsments> endorsments;
	public Integer getOptionId() {
		return optionId;
	}
	public void setOptionId(Integer optionId) {
		this.optionId = optionId;
	}
	public BigDecimal getOptioRt() {
		return optioRt;
	}
	public void setOptioRt(BigDecimal optioRt) {
		this.optioRt = optioRt;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
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
	public List<Deductibles> getDeductiblesList() {
		return deductiblesList;
	}
	public void setDeductiblesList(List<Deductibles> deductiblesList) {
		this.deductiblesList = deductiblesList;
	}
	public List<Endorsments> getEndorsments() {
		return endorsments;
	}
	public void setEndorsments(List<Endorsments> endorsments) {
		this.endorsments = endorsments;
	}
	@Override
	public String toString() {
		return "Options [optionId=" + optionId + ", optioRt=" + optioRt + ", condition=" + condition + ", commRtQuota="
				+ commRtQuota + ", commRtSurplus=" + commRtSurplus + ", commRtFac=" + commRtFac + ", createUser="
				+ createUser + ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate="
				+ updateDate + ", deductiblesList=" + deductiblesList + ", endorsments=" + endorsments + "]";
	}
	
	
	
}
