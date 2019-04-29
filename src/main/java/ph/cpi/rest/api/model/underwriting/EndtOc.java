package ph.cpi.rest.api.model.underwriting;

import java.util.List;

import org.apache.ibatis.type.Alias;
import org.joda.time.DateTime;

@Alias("PolEndtOc")
public class EndtOc {
	private String endtCd;
	private String endtTitle;
	private String changeTag;
	private String remarks;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private List<DeductiblesOc> deductiblesOc;
	private EndtText endtText;
	
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
	public String getChangeTag() {
		return changeTag;
	}
	public void setChangeTag(String changeTag) {
		this.changeTag = changeTag;
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
	public List<DeductiblesOc> getDeductiblesOc() {
		return deductiblesOc;
	}
	public void setDeductiblesOc(List<DeductiblesOc> deductiblesOc) {
		this.deductiblesOc = deductiblesOc;
	}
	public EndtText getEndtText() {
		return endtText;
	}
	public void setEndtText(EndtText endtText) {
		this.endtText = endtText;
	}
	@Override
	public String toString() {
		return "EndtOc [endtCd=" + endtCd + ", endtTitle=" + endtTitle + ", changeTag=" + changeTag + ", remarks="
				+ remarks + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + ", deductiblesOc=" + deductiblesOc + ", endtText=" + endtText + "]";
	}
	
}
