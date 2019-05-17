package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveMtnQuoteWordingsRequest {
	
	private List<QuoteWording> saveQW;
	private List<QuoteWording> deleteQW;
	
	public List<QuoteWording> getSaveQW() {
		return saveQW;
	}
	public void setSaveQW(List<QuoteWording> saveQW) {
		this.saveQW = saveQW;
	}
	public List<QuoteWording> getDeleteQW() {
		return deleteQW;
	}
	public void setDeleteQW(List<QuoteWording> deleteQW) {
		this.deleteQW = deleteQW;
	}
	@Override
	public String toString() {
		return "SaveMtnQuoteWordingsRequest [saveQW=" + saveQW + ", deleteQW=" + deleteQW + "]";
	}
}

@Alias("SaveMtnQuoteWordings")
class QuoteWording {
	private String lineCd;
	private String lineDesc;
	private Integer wordingId;
	private String wording;
	private String wordType;
	private String activeTag;
	private String defaultTag;
	private String ocTag;
	private String remarks;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
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
	public Integer getWordingId() {
		return wordingId;
	}
	public void setWordingId(Integer wordingId) {
		this.wordingId = wordingId;
	}
	public String getWording() {
		return wording;
	}
	public void setWording(String wording) {
		this.wording = wording;
	}
	public String getWordType() {
		return wordType;
	}
	public void setWordType(String wordType) {
		this.wordType = wordType;
	}
	public String getActiveTag() {
		return activeTag;
	}
	public void setActiveTag(String activeTag) {
		this.activeTag = activeTag;
	}
	public String getDefaultTag() {
		return defaultTag;
	}
	public void setDefaultTag(String defaultTag) {
		this.defaultTag = defaultTag;
	}
	public String getOcTag() {
		return ocTag;
	}
	public void setOcTag(String ocTag) {
		this.ocTag = ocTag;
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
		return "QuoteWording [lineCd=" + lineCd + ", lineDesc=" + lineDesc + ", wordingId=" + wordingId + ", wording="
				+ wording + ", wordType=" + wordType + ", activeTag=" + activeTag + ", defaultTag=" + defaultTag
				+ ", ocTag=" + ocTag + ", remarks=" + remarks + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
