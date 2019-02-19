package ph.cpi.rest.api.model.request;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.type.Alias;
import org.joda.time.LocalDateTime;

public class SaveQuoteOptionRequest {

	private Integer quoteId;
	private List<Deductibles> deductibleList;
	private Integer optionId;
	private BigDecimal optionRt;
	private String condition;
	private BigDecimal commRtQuota;
	private BigDecimal commRtSurplus;
	private BigDecimal commRtFac;
	private String createUser;
	private LocalDateTime createDate;
	private String updateUser;
	private LocalDateTime updateDate;
	
	public Integer getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(Integer quoteId) {
		this.quoteId = quoteId;
	}
	public List<Deductibles> getDeductibleList() {
		return deductibleList;
	}
	public void setDeductibleList(List<Deductibles> deductibleList) {
		this.deductibleList = deductibleList;
	}
	public Integer getOptionId() {
		return optionId;
	}
	public void setOptionId(Integer optionId) {
		this.optionId = optionId;
	}
	public BigDecimal getOptionRt() {
		return optionRt;
	}
	public void setOptionRt(BigDecimal optionRt) {
		this.optionRt = optionRt;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public BigDecimal getCommRtQuota() {
		return commRtQuota;
	}
	public void setCommRtQuota(BigDecimal commRtQuota) {
		this.commRtQuota = commRtQuota;
	}
	public BigDecimal getCommRtSurplus() {
		return commRtSurplus;
	}
	public void setCommRtSurplus(BigDecimal commRtSurplus) {
		this.commRtSurplus = commRtSurplus;
	}
	public BigDecimal getCommRtFac() {
		return commRtFac;
	}
	public void setCommRtFac(BigDecimal commRtFac) {
		this.commRtFac = commRtFac;
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

	@Override
	public String toString() {
		return "SaveQuoteOptionRequest [quoteId=" + quoteId + ", deductibleList=" + deductibleList + ", optionId="
				+ optionId + ", optionRt=" + optionRt + ", condition=" + condition + ", commRtQuota=" + commRtQuota
				+ ", commRtSurplus=" + commRtSurplus + ", commRtFac=" + commRtFac + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate
				+ ", ]";
	}
		
}


@Alias("SaveQuoteOption")
class Deductibles {
	private String deductibleTitle;
	private BigDecimal deductibleRt;
	private BigDecimal deductibleAmt;
	private String deductibleTxt;
	private String createUser;
	private LocalDateTime createDate;
	private String updateUser;
	private LocalDateTime updateDate;
	
	private String deductibleCd;
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
	@Override
	public String toString() {
		return "Deductibles [deductibleTitle=" + deductibleTitle + ", deductibleRt=" + deductibleRt + ", deductibleAmt="
				+ deductibleAmt + ", deductibleTxt=" + deductibleTxt + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", deductibleCd="
				+ deductibleCd + "]";
	}
	
	
}
	




