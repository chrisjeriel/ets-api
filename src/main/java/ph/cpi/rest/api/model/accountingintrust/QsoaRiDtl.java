package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

public class QsoaRiDtl {

	private Integer qsoaId;
	private Integer treatyId;
	private String treatyName;
	private Integer uwYear;
	private Integer itemNo;
	private String itemName;
	private String lineCd;
	private BigDecimal itemAmt;
	private String updateTag;
	
	public Integer getQsoaId() {
		return qsoaId;
	}
	public void setQsoaId(Integer qsoaId) {
		this.qsoaId = qsoaId;
	}
	public Integer getTreatyId() {
		return treatyId;
	}
	public void setTreatyId(Integer treatyId) {
		this.treatyId = treatyId;
	}
	public String getTreatyName() {
		return treatyName;
	}
	public void setTreatyName(String treatyName) {
		this.treatyName = treatyName;
	}
	public Integer getUwYear() {
		return uwYear;
	}
	public void setUwYear(Integer uwYear) {
		this.uwYear = uwYear;
	}
	public Integer getItemNo() {
		return itemNo;
	}
	public void setItemNo(Integer itemNo) {
		this.itemNo = itemNo;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}
	public BigDecimal getItemAmt() {
		return itemAmt;
	}
	public void setItemAmt(BigDecimal itemAmt) {
		this.itemAmt = itemAmt;
	}
	public String getUpdateTag() {
		return updateTag;
	}
	public void setUpdateTag(String updateTag) {
		this.updateTag = updateTag;
	}
	@Override
	public String toString() {
		return "QsoaRiDtl [qsoaId=" + qsoaId + ", treatyId=" + treatyId + ", treatyName=" + treatyName + ", uwYear="
				+ uwYear + ", itemNo=" + itemNo + ", itemName=" + itemName + ", lineCd=" + lineCd + ", itemAmt="
				+ itemAmt + ", updateTag=" + updateTag + "]";
	}
}
