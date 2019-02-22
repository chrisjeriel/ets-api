package ph.cpi.rest.api.model.request;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.type.Alias;
import org.joda.time.LocalDateTime;


public class SaveQuoteOptionRequest {
	
	private Integer quoteId;
	List<QuoteOption> saveQuoteOptionsList;
	List<QuoteOption> deleteQuoteOptionsList;
	List<Deductibles> saveDeductibleList;
	List<Deductibles> deleteDeductibleList;
	
	public List<Deductibles> getSaveDeductibleList() {
		return saveDeductibleList;
	}
	public void setSaveDeductibleList(List<Deductibles> saveDeductibleList) {
		this.saveDeductibleList = saveDeductibleList;
	}
	public List<Deductibles> getDeleteDeductibleList() {
		return deleteDeductibleList;
	}
	public void setDeleteDeductibleList(List<Deductibles> deleteDeductibleList) {
		this.deleteDeductibleList = deleteDeductibleList;
	}
	
	public Integer getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(Integer quoteId) {
		this.quoteId = quoteId;
	}
	public List<QuoteOption> getSaveQuoteOptionsList() {
		return saveQuoteOptionsList;
	}
	public void setSaveQuoteOptionsList(List<QuoteOption> saveQuoteOptionsList) {
		this.saveQuoteOptionsList = saveQuoteOptionsList;
	}
	public List<QuoteOption> getDeleteQuoteOptionsList() {
		return deleteQuoteOptionsList;
	}
	public void setDeleteQuoteOptionsList(List<QuoteOption> deleteQuoteOptionsList) {
		this.deleteQuoteOptionsList = deleteQuoteOptionsList;
	}
	@Override
	public String toString() {
		return "SaveQuoteOptionRequest [quoteId=" + quoteId + ", saveQuoteOptionsList=" + saveQuoteOptionsList
				+ ", deleteQuoteOptionsList=" + deleteQuoteOptionsList + "]";
	}
	
		
}


@Alias("SaveQuoteDeductibles")
class Deductibles {
	private Integer optionId;
	private String deductibleCd;
	private String deductibleRt;
	private String deductibleAmt;
	private String deductibleTxt;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	
	public Integer getOptionId() {
		return optionId;
	}
	public void setOptionId(Integer optionId) {
		this.optionId = optionId;
	}
	public String getDeductibleCd() {
		return deductibleCd;
	}
	public void setDeductibleCd(String deductibleCd) {
		this.deductibleCd = deductibleCd;
	}
	public String getDeductibleRt() {
		return deductibleRt;
	}
	public void setDeductibleRt(String deductibleRt) {
		this.deductibleRt = deductibleRt;
	}
	public String getDeductibleAmt() {
		return deductibleAmt;
	}
	public void setDeductibleAmt(String deductibleAmt) {
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
		return "Deductibles [deductibleRt=" + deductibleRt + ", deductibleAmt="
				+ deductibleAmt + ", deductibleTxt=" + deductibleTxt + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", deductibleCd="
				+ deductibleCd + "]";
	}
	
	
}
	

@Alias("SaveQuoteOption")
class QuoteOption{
	private Integer optionId;
	private String optionRt;
	private String condition;
	private String commRtQuota;
	private String commRtSurplus;
	private String commRtFac;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	

	
	public Integer getOptionId() {
		return optionId;
	}
	public void setOptionId(Integer optionId) {
		this.optionId = optionId;
	}
	public String getOptionRt() {
		return optionRt;
	}
	public void setOptionRt(String optionRt) {
		this.optionRt = optionRt;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public String getCommRtQuota() {
		return commRtQuota;
	}
	public void setCommRtQuota(String commRtQuota) {
		this.commRtQuota = commRtQuota;
	}
	public String getCommRtSurplus() {
		return commRtSurplus;
	}
	public void setCommRtSurplus(String commRtSurplus) {
		this.commRtSurplus = commRtSurplus;
	}
	public String getCommRtFac() {
		return commRtFac;
	}
	public void setCommRtFac(String commRtFac) {
		this.commRtFac = commRtFac;
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
		return "QuoteOption optionId=" + optionId + ", optionRt=" + optionRt + ", condition="
				+ condition + ", commRtQuota=" + commRtQuota + ", commRtSurplus=" + commRtSurplus + ", commRtFac="
				+ commRtFac + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}

	
}


