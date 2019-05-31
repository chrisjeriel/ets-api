package ph.cpi.rest.api.model.request;

import java.util.List;
import org.apache.ibatis.type.Alias;

public class SaveMtnTreatyLimitRequest {

	private List<TreatyLimit> saveTreatyLimit;
	private List<TreatyLimit> deleteTreatyLimit;
	
	public List<TreatyLimit> getSaveTreatyLimit() {
		return saveTreatyLimit;
	}
	public void setSaveTreatyLimit(List<TreatyLimit> saveTreatyLimit) {
		this.saveTreatyLimit = saveTreatyLimit;
	}
	public List<TreatyLimit> getDeleteTreatyLimit() {
		return deleteTreatyLimit;
	}
	public void setDeleteTreatyLimit(List<TreatyLimit> deleteTreatyLimit) {
		this.deleteTreatyLimit = deleteTreatyLimit;
	}
	@Override
	public String toString() {
		return "SaveMtnTreatyLimitRequest []";
	}
}

@Alias("SaveMtnTreatyLimit")
class TreatyLimit {
	private Integer outId;
	private Integer treatyLimitId;
	private String lineCd;
	private String lineClassCd;
	private String amount;
	private String trtyLayerDesc;
	private String effDateFrom;
	private String effDateTo;
	private String activeTag;
	private String remarks;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	private List<TreatyLayer> treatyLayerList;
	
	public Integer getOutId() {
		return outId;
	}
	public void setOutId(Integer outId) {
		this.outId = outId;
	}
	public Integer getTreatyLimitId() {
		return treatyLimitId;
	}
	public void setTreatyLimitId(Integer treatyLimitId) {
		this.treatyLimitId = treatyLimitId;
	}
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}
	public String getLineClassCd() {
		return lineClassCd;
	}
	public void setLineClassCd(String lineClassCd) {
		this.lineClassCd = lineClassCd;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getTrtyLayerDesc() {
		return trtyLayerDesc;
	}
	public void setTrtyLayerDesc(String trtyLayerDesc) {
		this.trtyLayerDesc = trtyLayerDesc;
	}
	public String getEffDateFrom() {
		return effDateFrom;
	}
	public void setEffDateFrom(String effDateFrom) {
		this.effDateFrom = effDateFrom;
	}
	public String getEffDateTo() {
		return effDateTo;
	}
	public void setEffDateTo(String effDateTo) {
		this.effDateTo = effDateTo;
	}
	public String getActiveTag() {
		return activeTag;
	}
	public void setActiveTag(String activeTag) {
		this.activeTag = activeTag;
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
	public List<TreatyLayer> getTreatyLayerList() {
		return treatyLayerList;
	}
	public void setTreatyLayerList(List<TreatyLayer> treatyLayerList) {
		this.treatyLayerList = treatyLayerList;
	}
	@Override
	public String toString() {
		return "TreatyLimit [treatyLimitId=" + treatyLimitId + ", lineCd=" + lineCd + ", lineClassCd=" + lineClassCd
				+ ", amount=" + amount + ", trtyLayerDesc=" + trtyLayerDesc + ", effDateFrom=" + effDateFrom
				+ ", effDateTo=" + effDateTo + ", activeTag=" + activeTag + ", remarks=" + remarks + ", createUser="
				+ createUser + ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate="
				+ updateDate + ", treatyLayerList=" + treatyLayerList + "]";
	}
}

@Alias("SaveMtnTreatyLayer")
class TreatyLayer {
	private Integer treatyLimitId;
	private Integer treatyId;
	private String treatyName;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	public Integer getTreatyLimitId() {
		return treatyLimitId;
	}
	public void setTreatyLimitId(Integer treatyLimitId) {
		this.treatyLimitId = treatyLimitId;
	}
	public Integer getTreatyId() {
		return treatyId;
	}
	public void setTreatyId(Integer treatyId) {
		this.treatyId = treatyId;
	}
	public String getTreatyName() {
		return treatyName;
	}
	public void setTreatyName(String treatyName) {
		this.treatyName = treatyName;
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
		return "TreatyLayer [treatyLimitId=" + treatyLimitId + ", treatyId=" + treatyId + ", treatyName=" + treatyName
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
}