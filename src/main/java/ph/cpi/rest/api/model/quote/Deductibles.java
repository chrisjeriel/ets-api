package ph.cpi.rest.api.model.quote;

import org.joda.time.LocalDateTime;
import java.math.BigDecimal;

public class Deductibles {
	private String deductibleCd;
	private String deductibleTitle;
	private Integer deductibleRtI; //Must be removed and remapped in XML
	private BigDecimal deductibleRt;
	private Integer deductibleAmtI; //Must be removed and remapped in XML
	private BigDecimal deductibleAmt;
	private String deductibleTxt;
	private String createUser;
	private LocalDateTime createDate;
	private String updateUser;
	private LocalDateTime updateDate;
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
	public Integer getDeductibleRtI() {
		return deductibleRtI;
	}
	public void setDeductibleRtI(Integer deductibleRtI) {
		this.deductibleRtI = deductibleRtI;
	}
	public BigDecimal getDeductibleRt() {
		return deductibleRt;
	}
	public void setDeductibleRt(BigDecimal deductibleRt) {
		this.deductibleRt = deductibleRt;
	}
	public Integer getDeductibleAmtI() {
		return deductibleAmtI;
	}
	public void setDeductibleAmtI(Integer deductibleAmtI) {
		this.deductibleAmtI = deductibleAmtI;
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
	public LocalDateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public LocalDateTime getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}
	
	
}