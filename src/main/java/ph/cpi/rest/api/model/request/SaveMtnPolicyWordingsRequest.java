package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveMtnPolicyWordingsRequest {

	private List<PolicyWording> savePW;
	private List<PolicyWording> deletePW;
	
	public List<PolicyWording> getSavePW() {
		return savePW;
	}
	public void setSavePW(List<PolicyWording> savePW) {
		this.savePW = savePW;
	}
	public List<PolicyWording> getDeletePW() {
		return deletePW;
	}
	public void setDeletePW(List<PolicyWording> deletePW) {
		this.deletePW = deletePW;
	}
	@Override
	public String toString() {
		return "SaveMtnPolicyWordingsRequest []";
	}
}

@Alias("SaveMtnPolicyWordings")
class PolicyWording {
	private String lineCd;
	private String wordingCd;
	private String wordingTitle;
	private String wordType;
	private String activeTag;
	private String defaultTag;
	private String ocTag;
	private String wordText01;
	private String wordText02;
	private String wordText03;
	private String wordText04;
	private String wordText05;
	private String wordText06;
	private String wordText07;
	private String wordText08;
	private String wordText09;
	private String wordText10;
	private String wordText11;
	private String wordText12;
	private String wordText13;
	private String wordText14;
	private String wordText15;
	private String wordText16;
	private String wordText17;
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
	public String getWordingCd() {
		return wordingCd;
	}
	public void setWordingCd(String wordingCd) {
		this.wordingCd = wordingCd;
	}
	public String getWordingTitle() {
		return wordingTitle;
	}
	public void setWordingTitle(String wordingTitle) {
		this.wordingTitle = wordingTitle;
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
	public String getWordText01() {
		return wordText01;
	}
	public void setWordText01(String wordText01) {
		this.wordText01 = wordText01;
	}
	public String getWordText02() {
		return wordText02;
	}
	public void setWordText02(String wordText02) {
		this.wordText02 = wordText02;
	}
	public String getWordText03() {
		return wordText03;
	}
	public void setWordText03(String wordText03) {
		this.wordText03 = wordText03;
	}
	public String getWordText04() {
		return wordText04;
	}
	public void setWordText04(String wordText04) {
		this.wordText04 = wordText04;
	}
	public String getWordText05() {
		return wordText05;
	}
	public void setWordText05(String wordText05) {
		this.wordText05 = wordText05;
	}
	public String getWordText06() {
		return wordText06;
	}
	public void setWordText06(String wordText06) {
		this.wordText06 = wordText06;
	}
	public String getWordText07() {
		return wordText07;
	}
	public void setWordText07(String wordText07) {
		this.wordText07 = wordText07;
	}
	public String getWordText08() {
		return wordText08;
	}
	public void setWordText08(String wordText08) {
		this.wordText08 = wordText08;
	}
	public String getWordText09() {
		return wordText09;
	}
	public void setWordText09(String wordText09) {
		this.wordText09 = wordText09;
	}
	public String getWordText10() {
		return wordText10;
	}
	public void setWordText10(String wordText10) {
		this.wordText10 = wordText10;
	}
	public String getWordText11() {
		return wordText11;
	}
	public void setWordText11(String wordText11) {
		this.wordText11 = wordText11;
	}
	public String getWordText12() {
		return wordText12;
	}
	public void setWordText12(String wordText12) {
		this.wordText12 = wordText12;
	}
	public String getWordText13() {
		return wordText13;
	}
	public void setWordText13(String wordText13) {
		this.wordText13 = wordText13;
	}
	public String getWordText14() {
		return wordText14;
	}
	public void setWordText14(String wordText14) {
		this.wordText14 = wordText14;
	}
	public String getWordText15() {
		return wordText15;
	}
	public void setWordText15(String wordText15) {
		this.wordText15 = wordText15;
	}
	public String getWordText16() {
		return wordText16;
	}
	public void setWordText16(String wordText16) {
		this.wordText16 = wordText16;
	}
	public String getWordText17() {
		return wordText17;
	}
	public void setWordText17(String wordText17) {
		this.wordText17 = wordText17;
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
		return "PolicyWording [lineCd=" + lineCd + ", wordingCd=" + wordingCd + ", wordingTitle=" + wordingTitle
				+ ", wordType=" + wordType + ", activeTag=" + activeTag + ", defaultTag=" + defaultTag + ", ocTag="
				+ ocTag + ", wordText01=" + wordText01 + ", wordText02=" + wordText02 + ", wordText03=" + wordText03
				+ ", wordText04=" + wordText04 + ", wordText05=" + wordText05 + ", wordText06=" + wordText06
				+ ", wordText07=" + wordText07 + ", wordText08=" + wordText08 + ", wordText09=" + wordText09
				+ ", wordText10=" + wordText10 + ", wordText11=" + wordText11 + ", wordText12=" + wordText12
				+ ", wordText13=" + wordText13 + ", wordText14=" + wordText14 + ", wordText15=" + wordText15
				+ ", wordText16=" + wordText16 + ", wordText17=" + wordText17 + ", remarks=" + remarks + ", createUser="
				+ createUser + ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate="
				+ updateDate + "]";
	}
}
