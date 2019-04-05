package ph.cpi.rest.api.model.maintenance;

import java.math.BigDecimal;

import org.apache.ibatis.type.Alias;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;

@Alias("DeductiblesMtn")
public class Deductibles {

	private String activeTag;
	private String deductibleCd;
	private Integer	coverCd;
	private Integer endtCd;
	private String defaultTag;
	private String deductibleTitle;
	private String deductibleType;
	private String typeDesc;
	private BigDecimal deductibleRate;
	private BigDecimal deductibleAmt;
	private String lineCd;
	private String lineDesc;
	private BigDecimal minAmt;
	private BigDecimal maxAmt;
	private String deductibleText;
	private String remarks;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	public String getActiveTag() {
		return activeTag;
	}
	public void setActiveTag(String activeTag) {
		this.activeTag = activeTag;
	}
	public String getDeductibleCd() {
		return deductibleCd;
	}
	public void setDeductibleCd(String deductibleCd) {
		this.deductibleCd = deductibleCd;
	}
	public Integer getCoverCd() {
		return coverCd;
	}
	public void setCoverCd(Integer coverCd) {
		this.coverCd = coverCd;
	}
	public Integer getEndtCd() {
		return endtCd;
	}
	public void setEndtCd(Integer endtCd) {
		this.endtCd = endtCd;
	}
	public String getDefaultTag() {
		return defaultTag;
	}
	public void setDefaultTag(String defaultTag) {
		this.defaultTag = defaultTag;
	}
	public String getDeductibleTitle() {
		return deductibleTitle;
	}
	public void setDeductibleTitle(String deductibleTitle) {
		this.deductibleTitle = deductibleTitle;
	}
	public String getDeductibleType() {
		return deductibleType;
	}
	public void setDeductibleType(String deductibleType) {
		this.deductibleType = deductibleType;
	}
	public String getTypeDesc() {
		return typeDesc;
	}
	public void setTypeDesc(String typeDesc) {
		this.typeDesc = typeDesc;
	}
	public BigDecimal getDeductibleRate() {
		return deductibleRate;
	}
	public void setDeductibleRate(BigDecimal deductibleRate) {
		this.deductibleRate = deductibleRate;
	}
	public BigDecimal getDeductibleAmt() {
		return deductibleAmt;
	}
	public void setDeductibleAmt(BigDecimal deductibleAmt) {
		this.deductibleAmt = deductibleAmt;
	}
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}
	public String getLineDesc() {
		return lineDesc;
	}
	public void setLineDesc(String lineDesc) {
		this.lineDesc = lineDesc;
	}
	public BigDecimal getMinAmt() {
		return minAmt;
	}
	public void setMinAmt(BigDecimal minAmt) {
		this.minAmt = minAmt;
	}
	public BigDecimal getMaxAmt() {
		return maxAmt;
	}
	public void setMaxAmt(BigDecimal maxAmt) {
		this.maxAmt = maxAmt;
	}
	public String getDeductibleText() {
		return deductibleText;
	}
	public void setDeductibleText(String deductibleText) {
		this.deductibleText = deductibleText;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
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
		return "Deductibles [activeTag=" + activeTag + ", deductibleCd=" + deductibleCd + ", coverCd=" + coverCd
				+ ", endtCd=" + endtCd + ", defaultTag=" + defaultTag + ", deductibleTitle=" + deductibleTitle
				+ ", deductibleType=" + deductibleType + ", typeDesc=" + typeDesc + ", deductibleRate=" + deductibleRate
				+ ", deductibleAmt=" + deductibleAmt + ", lineCd=" + lineCd + ", lineDesc=" + lineDesc + ", minAmt="
				+ minAmt + ", maxAmt=" + maxAmt + ", deductibleText=" + deductibleText + ", remarks=" + remarks
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}

}
