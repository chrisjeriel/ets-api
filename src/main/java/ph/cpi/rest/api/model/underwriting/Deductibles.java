package ph.cpi.rest.api.model.underwriting;

import java.math.BigDecimal;

import org.apache.ibatis.type.Alias;
import org.joda.time.DateTime;

@Alias("UwDeductibles")
public class Deductibles {
	private Integer coverCd;
	private String coverCdDesc;
	private String endtCd;
	private String endtTitle;
	private String deductibleCd;
	private String deductibleTitle;
	private BigDecimal deductibleRt;
	private BigDecimal deductibleAmt;
	private String deductibleTxt;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;

	public Integer getCoverCd() {
		return coverCd;
	}
	public void setCoverCd(Integer coverCd) {
		this.coverCd = coverCd;
	}
	public String getCoverCdDesc() {
		return coverCdDesc;
	}
	public void setCoverCdDesc(String coverCdDesc) {
		this.coverCdDesc = coverCdDesc;
	}
	public String getEndtCd() {
		return endtCd;
	}
	public void setEndtCd(String endtCd) {
		this.endtCd = endtCd;
	}
	public String getEndtTitle() {
		return endtTitle;
	}
	public void setEndtTitle(String endtTitle) {
		this.endtTitle = endtTitle;
	}
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
	public BigDecimal getDeductibleRt() {
		return deductibleRt;
	}
	public void setDeductibleRt(BigDecimal deductibleRt) {
		this.deductibleRt = deductibleRt;
	}
	public BigDecimal getDeductibleAmt() {
		return deductibleAmt;
	}
	public void setDeductibleAmt(BigDecimal deductibleAmt) {
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
		return "Deductibles [coverCd=" + coverCd + ", coverCdDesc=" + coverCdDesc + ", endtCd=" + endtCd
				+ ", endtTitle=" + endtTitle + ", deductibleCd=" + deductibleCd + ", deductibleTitle=" + deductibleTitle
				+ ", deductibleRt=" + deductibleRt + ", deductibleAmt=" + deductibleAmt + ", deductibleTxt="
				+ deductibleTxt + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser="
				+ updateUser + ", updateDate=" + updateDate + "]";
	}

}
