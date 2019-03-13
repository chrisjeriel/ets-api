package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class CopyEndorsementRequest {
	private String copyingType;
	private String fromOptionNo;
	private String newQuoteId;
	private String quoteId;
	private List<CopyEndorsement> toOptionNo;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	public String getCopyingType() {
		return copyingType;
	}
	public void setCopyingType(String copyingType) {
		this.copyingType = copyingType;
	}
	public String getFromOptionNo() {
		return fromOptionNo;
	}
	public void setFromOptionNo(String fromOptionNo) {
		this.fromOptionNo = fromOptionNo;
	}
	public String getNewQuoteId() {
		return newQuoteId;
	}
	public void setNewQuoteId(String newQuoteId) {
		this.newQuoteId = newQuoteId;
	}
	public String getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}
	public List<CopyEndorsement> getToOptionNo() {
		return toOptionNo;
	}
	public void setToOptionNo(List<CopyEndorsement> toOptionNo) {
		this.toOptionNo = toOptionNo;
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
		return "CopyEndorsementRequest [copyingType=" + copyingType + ", fromOptionNo=" + fromOptionNo + ", newQuoteId="
				+ newQuoteId + ", quoteId=" + quoteId + ", toOptionNo=" + toOptionNo + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}

@Alias("toOptionNo")
class CopyEndorsement{
	private String optionNo;

	public String getOptionNo() {
		return optionNo;
	}

	public void setOptionNo(String optionNo) {
		this.optionNo = optionNo;
	}

	@Override
	public String toString() {
		return "CopyEndorsement [optionNo=" + optionNo + "]";
	}
	
}
