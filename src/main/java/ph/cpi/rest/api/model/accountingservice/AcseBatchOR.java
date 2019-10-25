package ph.cpi.rest.api.model.accountingservice;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcseBatchOR {
	
	private Integer tranId;
	private String tranTypeCd;
	private String tranTypeName;
	private String orType;
	private Integer orNo;
	private DateTime tranDate;
	private String tranStat;
	private String tranStatDesc;
	private String orStat;
	private String orStatDesc;
	private String payor;
	private String particulars;
	private BigDecimal orAmt;
	private BigDecimal credit;
	private BigDecimal debit;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
	public String getTranTypeName() {
		return tranTypeName;
	}
	public void setTranTypeName(String tranTypeName) {
		this.tranTypeName = tranTypeName;
	}
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	public String getTranTypeCd() {
		return tranTypeCd;
	}
	public void setTranTypeCd(String tranTypeCd) {
		this.tranTypeCd = tranTypeCd;
	}
	public String getOrType() {
		return orType;
	}
	public void setOrType(String orType) {
		this.orType = orType;
	}
	public Integer getOrNo() {
		return orNo;
	}
	public void setOrNo(Integer orNo) {
		this.orNo = orNo;
	}
	public DateTime getTranDate() {
		return tranDate;
	}
	public void setTranDate(DateTime tranDate) {
		this.tranDate = tranDate;
	}
	public String getTranStat() {
		return tranStat;
	}
	public void setTranStat(String tranStat) {
		this.tranStat = tranStat;
	}
	public String getTranStatDesc() {
		return tranStatDesc;
	}
	public void setTranStatDesc(String tranStatDesc) {
		this.tranStatDesc = tranStatDesc;
	}
	public String getOrStat() {
		return orStat;
	}
	public void setOrStat(String orStat) {
		this.orStat = orStat;
	}
	public String getOrStatDesc() {
		return orStatDesc;
	}
	public void setOrStatDesc(String orStatDesc) {
		this.orStatDesc = orStatDesc;
	}
	public String getPayor() {
		return payor;
	}
	public void setPayor(String payor) {
		this.payor = payor;
	}
	public String getParticulars() {
		return particulars;
	}
	public void setParticulars(String particulars) {
		this.particulars = particulars;
	}
	public BigDecimal getOrAmt() {
		return orAmt;
	}
	public void setOrAmt(BigDecimal orAmt) {
		this.orAmt = orAmt;
	}
	public BigDecimal getCredit() {
		return credit;
	}
	public void setCredit(BigDecimal credit) {
		this.credit = credit;
	}
	public BigDecimal getDebit() {
		return debit;
	}
	public void setDebit(BigDecimal debit) {
		this.debit = debit;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public DateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(DateTime createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public DateTime getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(DateTime updateDate) {
		this.updateDate = updateDate;
	}
	
	@Override
	public String toString() {
		return "AcseBatchOR [tranId=" + tranId + ", tranTypeCd=" + tranTypeCd
				+ ", tranTypeName=" + tranTypeName + ", orType=" + orType
				+ ", orNo=" + orNo + ", tranDate=" + tranDate + ", tranStat="
				+ tranStat + ", tranStatDesc=" + tranStatDesc + ", orStat="
				+ orStat + ", orStatDesc=" + orStatDesc + ", payor=" + payor
				+ ", particulars=" + particulars + ", orAmt=" + orAmt
				+ ", credit=" + credit + ", debit=" + debit + ", createUser="
				+ createUser + ", createDate=" + createDate + ", updateUser="
				+ updateUser + ", updateDate=" + updateDate + "]";
	}
	

}
