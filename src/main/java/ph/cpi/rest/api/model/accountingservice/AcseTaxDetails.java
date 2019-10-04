package ph.cpi.rest.api.model.accountingservice;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcseTaxDetails {
	private Integer tranId;
	private String taxType;
	private Integer taxSeqno;
	private String genType;
	private String taxCd;
	private String genTaxDesc;
	private String whtTaxDesc;
	private String genBirRlf;
	private BigDecimal genTaxRate;
	private BigDecimal whtRate;
	private String payor;
	private BigDecimal baseAmt;
	private BigDecimal taxAmt;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	public String getTaxType() {
		return taxType;
	}
	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}
	public Integer getTaxSeqno() {
		return taxSeqno;
	}
	
	public String getGenBirRlf() {
		return genBirRlf;
	}
	public void setGenBirRlf(String genBirRlf) {
		this.genBirRlf = genBirRlf;
	}
	public void setTaxSeqno(Integer taxSeqno) {
		this.taxSeqno = taxSeqno;
	}
	public String getGenType() {
		return genType;
	}
	public void setGenType(String genType) {
		this.genType = genType;
	}
	public String getTaxCd() {
		return taxCd;
	}
	public void setTaxCd(String taxCd) {
		this.taxCd = taxCd;
	}
	public String getGenTaxDesc() {
		return genTaxDesc;
	}
	public void setGenTaxDesc(String genTaxDesc) {
		this.genTaxDesc = genTaxDesc;
	}
	public String getWhtTaxDesc() {
		return whtTaxDesc;
	}
	public void setWhtTaxDesc(String whtTaxDesc) {
		this.whtTaxDesc = whtTaxDesc;
	}
	public BigDecimal getGenTaxRate() {
		return genTaxRate;
	}
	public void setGenTaxRate(BigDecimal genTaxRate) {
		this.genTaxRate = genTaxRate;
	}
	public BigDecimal getWhtRate() {
		return whtRate;
	}
	public void setWhtRate(BigDecimal whtRate) {
		this.whtRate = whtRate;
	}
	public String getPayor() {
		return payor;
	}
	public void setPayor(String payor) {
		this.payor = payor;
	}
	public BigDecimal getBaseAmt() {
		return baseAmt;
	}
	public void setBaseAmt(BigDecimal baseAmt) {
		this.baseAmt = baseAmt;
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
	@Override
	public String toString() {
		return "AcseTaxDetails [tranId=" + tranId + ", taxType=" + taxType + ", taxSeqno=" + taxSeqno + ", genType="
				+ genType + ", taxCd=" + taxCd + ", genTaxDesc=" + genTaxDesc + ", whtTaxDesc=" + whtTaxDesc
				+ ", genBirRlf=" + genBirRlf + ", genTaxRate=" + genTaxRate + ", whtRate=" + whtRate + ", payor="
				+ payor + ", baseAmt=" + baseAmt + ", taxAmt=" + taxAmt + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
}
