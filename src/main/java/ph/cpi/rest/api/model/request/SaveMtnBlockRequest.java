package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveMtnBlockRequest {
	private String regionCd;
	private String provinceCd;
	private String cityCd;
	private String districtCd;
	private List<SaveBlock> saveBlock;
	private List<SaveBlock> delBlock;
	public String getRegionCd() {
		return regionCd;
	}
	public void setRegionCd(String regionCd) {
		this.regionCd = regionCd;
	}
	public String getProvinceCd() {
		return provinceCd;
	}
	public void setProvinceCd(String provinceCd) {
		this.provinceCd = provinceCd;
	}
	public String getCityCd() {
		return cityCd;
	}
	public void setCityCd(String cityCd) {
		this.cityCd = cityCd;
	}
	public String getDistrictCd() {
		return districtCd;
	}
	public void setDistrictCd(String districtCd) {
		this.districtCd = districtCd;
	}
	public List<SaveBlock> getSaveBlock() {
		return saveBlock;
	}
	public void setSaveBlock(List<SaveBlock> saveBlock) {
		this.saveBlock = saveBlock;
	}
	public List<SaveBlock> getDelBlock() {
		return delBlock;
	}
	public void setDelBlock(List<SaveBlock> delBlock) {
		this.delBlock = delBlock;
	}
	@Override
	public String toString() {
		return "SaveMtnBlockRequest [regionCd=" + regionCd + ", provinceCd=" + provinceCd + ", cityCd=" + cityCd
				+ ", districtCd=" + districtCd + ", saveBlock=" + saveBlock + ", delBlock=" + delBlock + "]";
	}
	
	
}

class SaveBlock{
	private String blockCd;
	private String blockDesc;
	private String activeTag;
	private String remarks;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	public String getBlockCd() {
		return blockCd;
	}
	public void setBlockCd(String blockCd) {
		this.blockCd = blockCd;
	}
	public String getBlockDesc() {
		return blockDesc;
	}
	public void setBlockDesc(String blockDesc) {
		this.blockDesc = blockDesc;
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
	@Override
	public String toString() {
		return "SaveBlock [blockCd=" + blockCd + ", blockDesc=" + blockDesc + ", activeTag=" + activeTag + ", remarks="
				+ remarks + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
	
	
}