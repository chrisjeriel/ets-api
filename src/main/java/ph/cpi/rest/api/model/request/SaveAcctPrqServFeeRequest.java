package ph.cpi.rest.api.model.request;

import java.math.BigDecimal;

public class SaveAcctPrqServFeeRequest {

	private Integer reqId;
	private String prdAsOf;
	private Integer year;
	private BigDecimal servFeeAmt;
	private String currCd;
	private Double currRt;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	public Integer getReqId() {
		return reqId;
	}
	public void setReqId(Integer reqId) {
		this.reqId = reqId;
	}
	public String getPrdAsOf() {
		return prdAsOf;
	}
	public void setPrdAsOf(String prdAsOf) {
		this.prdAsOf = prdAsOf;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public BigDecimal getServFeeAmt() {
		return servFeeAmt;
	}
	public void setServFeeAmt(BigDecimal servFeeAmt) {
		this.servFeeAmt = servFeeAmt;
	}
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	public Double getCurrRt() {
		return currRt;
	}
	public void setCurrRt(Double currRt) {
		this.currRt = currRt;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "SaveAcctPrqServFeeRequest [reqId=" + reqId + ", prdAsOf=" + prdAsOf + ", year=" + year + ", servFeeAmt="
				+ servFeeAmt + ", currCd=" + currCd + ", currRt=" + currRt + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
