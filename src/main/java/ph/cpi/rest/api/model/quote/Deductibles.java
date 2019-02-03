package ph.cpi.rest.api.model.quote;

import org.joda.time.LocalDateTime;

public class Deductibles {

	private String deductibleCd;
	private String deductibleTitle;
	private Integer deductibleRt;
	private Integer deductibleAmt;
	private String deductibleTxt;
	private String createUser;
	private LocalDateTime createDate;
	private String updateUser;
	private LocalDateTime updateDate;
	
	public String getDeductibleCd() {
		return deductibleCd;
	}
	public void setDeductibleCd(String deductibleCd) {
		this.deductibleCd = deductibleCd;
	}
	public String getDeductibleTitle() {
		return deductibleTitle;
	}
	public void setDeductibleTitle(String deductibleTitle) {
		this.deductibleTitle = deductibleTitle;
	}
	public Integer getDeductibleRt() {
		return deductibleRt;
	}
	public void setDeductibleRt(Integer deductibleRt) {
		this.deductibleRt = deductibleRt;
	}
	public Integer getDeductibleAmt() {
		return deductibleAmt;
	}
	public void setDeductibleAmt(Integer deductibleAmt) {
		this.deductibleAmt = deductibleAmt;
	}
	public String getDeductibleTxt() {
		return deductibleTxt;
	}
	public void setDeductibleTxt(String deductibleTxt) {
		this.deductibleTxt = deductibleTxt;
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
		return "Deductibles [deductibleCd=" + deductibleCd + ", deductibleTitle=" + deductibleTitle + ", deductibleRt="
				+ deductibleRt + ", deductibleAmt=" + deductibleAmt + ", deductibleTxt=" + deductibleTxt
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
}
