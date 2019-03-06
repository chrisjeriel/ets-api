package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveQuoteDeductiblesRequest {

	private Integer quoteId;
	List<Deductibles> saveDeductibleList;
	List<Deductibles> deleteDeductibleList;
	
	public Integer getQuoteId() {
		return quoteId;
	}

	public void setQuoteId(Integer quoteId) {
		this.quoteId = quoteId;
	}

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

	@Override
	public String toString() {
		return "SaveQuoteDeductiblesRequest [quoteId=" + quoteId + ", saveDeductibleList=" + saveDeductibleList
				+ ", deleteDeductibleList=" + deleteDeductibleList + "]";
	}

	
}

@Alias("SaveQuoteDeductibles")
class Deductibles {
	private String optionId;
	private String deductibleCd;
	private String deductibleRt;
	private String deductibleAmt;
	private String deductibleTxt;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	
	public String getOptionId() {
		return optionId;
	}
	public void setOptionId(String optionId) {
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
