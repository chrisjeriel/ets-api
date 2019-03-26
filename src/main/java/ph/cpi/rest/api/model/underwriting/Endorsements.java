package ph.cpi.rest.api.model.underwriting;

import java.util.List;

import org.apache.ibatis.type.Alias;
import org.joda.time.DateTime;

@Alias("UwEndorsements")
public class Endorsements {
	private String endtCd;
	private String endtTitle;
	private String changeTag;
	private String remarks;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private List<Deductibles> deductibles;
	
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
	public List<Deductibles> getDeductibles() {
		return deductibles;
	}
	public void setDeductibles(List<Deductibles> deductibles) {
		this.deductibles = deductibles;
	}
	
	@Override
	public String toString() {
		return "Endorsements [endtCd=" + endtCd + ", endtTitle=" + endtTitle + ", changeTag=" + changeTag + ", remarks="
				+ remarks + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + ", deductibles=" + deductibles + "]";
	}
}
