package ph.cpi.rest.api.model.request;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveAcseTaxDetailsRequest {
	private List<taxDetails> saveTaxDtl;

	public List<taxDetails> getSaveTaxDtl() {
		return saveTaxDtl;
	}

	public void setSaveTaxDtl(List<taxDetails> saveTaxDtl) {
		this.saveTaxDtl = saveTaxDtl;
	}

	@Override
	public String toString() {
		return "SaveAcseTaxDetailsRequest [saveTaxDtl=" + saveTaxDtl + "]";
	}
	
}

@Alias ("ACSEtaxDtl")
class taxDetails {
	private Integer tranId;
	private String taxType;
	private Integer taxSeqno;
	private String taxCd;
	private String genType;
	private String payor;
	private BigDecimal baseAmt;
	private BigDecimal taxAmt;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
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
	public void setTaxSeqno(Integer taxSeqno) {
		this.taxSeqno = taxSeqno;
	}
	public String getTaxCd() {
		return taxCd;
	}
	public void setTaxCd(String taxCd) {
		this.taxCd = taxCd;
	}
	public String getGenType() {
		return genType;
	}
	public void setGenType(String genType) {
		this.genType = genType;
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
		return "taxDetails [tranId=" + tranId + ", taxType=" + taxType + ", taxSeqno=" + taxSeqno + ", taxCd=" + taxCd
				+ ", genType=" + genType + ", payor=" + payor + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
}
