package ph.cpi.rest.api.model.request;

import java.math.BigDecimal;
import java.util.List;

public class SaveAcctPrqServFeeRequest {

	private String force; 
	private Integer reqId;
	private Integer quarter;
	private Integer year;
	private BigDecimal servFeeAmt;
	private BigDecimal netServFee;
	private String currCd;
	private Double currRt;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	private Integer pwMmFrom;
	private Integer pwYearFrom;
	private Integer pwMmTo;
	private Integer pwYearTo;
	private List<SaveAcctServFeeCedant> saveAcctServFeeCedantList;
	private BigDecimal offsetAmt;
	
	public String getForce() {
		return force;
	}
	public void setForce(String force) {
		this.force = force;
	}
	public Integer getReqId() {
		return reqId;
	}
	public void setReqId(Integer reqId) {
		this.reqId = reqId;
	}
	public Integer getQuarter() {
		return quarter;
	}
	public void setQuarter(Integer quarter) {
		this.quarter = quarter;
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
	public BigDecimal getNetServFee() {
		return netServFee;
	}
	public void setNetServFee(BigDecimal netServFee) {
		this.netServFee = netServFee;
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
	public Integer getPwMmFrom() {
		return pwMmFrom;
	}
	public void setPwMmFrom(Integer pwMmFrom) {
		this.pwMmFrom = pwMmFrom;
	}
	public Integer getPwYearFrom() {
		return pwYearFrom;
	}
	public void setPwYearFrom(Integer pwYearFrom) {
		this.pwYearFrom = pwYearFrom;
	}
	public Integer getPwMmTo() {
		return pwMmTo;
	}
	public void setPwMmTo(Integer pwMmTo) {
		this.pwMmTo = pwMmTo;
	}
	public Integer getPwYearTo() {
		return pwYearTo;
	}
	public void setPwYearTo(Integer pwYearTo) {
		this.pwYearTo = pwYearTo;
	}
	public List<SaveAcctServFeeCedant> getSaveAcctServFeeCedantList() {
		return saveAcctServFeeCedantList;
	}
	public void setSaveAcctServFeeCedantList(List<SaveAcctServFeeCedant> saveAcctServFeeCedantList) {
		this.saveAcctServFeeCedantList = saveAcctServFeeCedantList;
	}
	public BigDecimal getOffsetAmt() {
		return offsetAmt;
	}
	public void setOffsetAmt(BigDecimal offsetAmt) {
		this.offsetAmt = offsetAmt;
	}
	@Override
	public String toString() {
		return "SaveAcctPrqServFeeRequest [force=" + force + ", reqId=" + reqId + ", quarter=" + quarter + ", year="
				+ year + ", servFeeAmt=" + servFeeAmt + ", netServFee=" + netServFee + ", currCd=" + currCd
				+ ", currRt=" + currRt + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser="
				+ updateUser + ", updateDate=" + updateDate + ", pwMmFrom=" + pwMmFrom + ", pwYearFrom=" + pwYearFrom
				+ ", pwMmTo=" + pwMmTo + ", pwYearTo=" + pwYearTo + ", saveAcctServFeeCedantList="
				+ saveAcctServFeeCedantList + ", offsetAmt=" + offsetAmt + "]";
	}
}

class SaveAcctServFeeCedant {
	private String cedingId;
	private BigDecimal netSfee;
	private BigDecimal vatAmt;
	private BigDecimal whtaxAmt;
	private BigDecimal netDue;
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public BigDecimal getNetSfee() {
		return netSfee;
	}
	public void setNetSfee(BigDecimal netSfee) {
		this.netSfee = netSfee;
	}
	public BigDecimal getVatAmt() {
		return vatAmt;
	}
	public void setVatAmt(BigDecimal vatAmt) {
		this.vatAmt = vatAmt;
	}
	public BigDecimal getWhtaxAmt() {
		return whtaxAmt;
	}
	public void setWhtaxAmt(BigDecimal whtaxAmt) {
		this.whtaxAmt = whtaxAmt;
	}
	public BigDecimal getNetDue() {
		return netDue;
	}
	public void setNetDue(BigDecimal netDue) {
		this.netDue = netDue;
	}
	@Override
	public String toString() {
		return "SaveAcctServFeeCedant [cedingId=" + cedingId + ", netSfee=" + netSfee + ", vatAmt=" + vatAmt
				+ ", whtaxAmt=" + whtaxAmt + ", netDue=" + netDue + "]";
	}	
}
