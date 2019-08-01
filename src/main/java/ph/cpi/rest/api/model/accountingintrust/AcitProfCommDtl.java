package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcitProfCommDtl {
	
	private Integer profCommId;
	private String itemNo;
	private String particulars;
	private BigDecimal actualAmt;
	private BigDecimal natcatAmt;
	private BigDecimal income;
	private BigDecimal outgo;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
	public Integer getProfCommId() {
		return profCommId;
	}
	public void setProfCommId(Integer profCommId) {
		this.profCommId = profCommId;
	}
	public String getItemNo() {
		return itemNo;
	}
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}
	public String getParticulars() {
		return particulars;
	}
	public void setParticulars(String particulars) {
		this.particulars = particulars;
	}
	public BigDecimal getActualAmt() {
		return actualAmt;
	}
	public void setActualAmt(BigDecimal actualAmt) {
		this.actualAmt = actualAmt;
	}
	public BigDecimal getNatcatAmt() {
		return natcatAmt;
	}
	public void setNatcatAmt(BigDecimal natcatAmt) {
		this.natcatAmt = natcatAmt;
	}
	public BigDecimal getIncome() {
		return income;
	}
	public void setIncome(BigDecimal income) {
		this.income = income;
	}
	public BigDecimal getOutgo() {
		return outgo;
	}
	public void setOutgo(BigDecimal outgo) {
		this.outgo = outgo;
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
		return "AcitProfCommDtl [profCommId=" + profCommId + ", itemNo=" + itemNo + ", particulars=" + particulars
				+ ", actualAmt=" + actualAmt + ", natcatAmt=" + natcatAmt + ", income=" + income + ", outgo=" + outgo
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
	
	
}
