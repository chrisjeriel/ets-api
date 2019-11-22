package ph.cpi.rest.api.model.accountingservice;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class CvItemTaxes {
	private Integer reqId;
	private Integer itemNo;
	private Integer taxSeqNo;
	private String taxType;
	private String taxCd;
	private String taxName;
	private BigDecimal taxRate;
	private BigDecimal taxAmt;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private String genType;
	public Integer getReqId() {
		return reqId;
	}
	public void setReqId(Integer reqId) {
		this.reqId = reqId;
	}
	public Integer getItemNo() {
		return itemNo;
	}
	public void setItemNo(Integer itemNo) {
		this.itemNo = itemNo;
	}
	public Integer getTaxSeqNo() {
		return taxSeqNo;
	}
	public void setTaxSeqNo(Integer taxSeqNo) {
		this.taxSeqNo = taxSeqNo;
	}
	public String getTaxType() {
		return taxType;
	}
	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}
	public String getTaxCd() {
		return taxCd;
	}
	public void setTaxCd(String taxCd) {
		this.taxCd = taxCd;
	}
	public String getTaxName() {
		return taxName;
	}
	public void setTaxName(String taxName) {
		this.taxName = taxName;
	}
	public BigDecimal getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(BigDecimal taxRate) {
		this.taxRate = taxRate;
	}
	public BigDecimal getTaxAmt() {
		return taxAmt;
	}
	public void setTaxAmt(BigDecimal taxAmt) {
		this.taxAmt = taxAmt;
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
	public String getGenType() {
		return genType;
	}
	public void setGenType(String genType) {
		this.genType = genType;
	}
	@Override
	public String toString() {
		return "CvItemTaxes [reqId=" + reqId + ", itemNo=" + itemNo + ", taxSeqNo=" + taxSeqNo + ", taxType=" + taxType
				+ ", taxCd=" + taxCd + ", taxName=" + taxName + ", taxRate=" + taxRate + ", taxAmt=" + taxAmt
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + ", genType=" + genType + "]";
	}
	
}
