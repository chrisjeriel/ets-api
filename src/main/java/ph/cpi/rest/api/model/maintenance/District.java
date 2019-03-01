package ph.cpi.rest.api.model.maintenance;

import java.util.List;

import org.joda.time.LocalDateTime;

public class District {
	
	private String districtCd;
	private String districtDesc;
	private String activeTag   ;
	private String remarks;
	private String createUser;
	private LocalDateTime createDate;
	private String updateUser;
	private LocalDateTime updateDate;
	private Block block;
	private List<Block> blockList;
	public String getDistrictCd() {
		return districtCd;
	}
	public void setDistrictCd(String districtCd) {
		this.districtCd = districtCd;
	}
	public String getDistrictDesc() {
		return districtDesc;
	}
	public void setDistrictDesc(String districtDesc) {
		this.districtDesc = districtDesc;
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
	public Block getBlock() {
		return block;
	}
	public void setBlock(Block block) {
		this.block = block;
	}
	public List<Block> getBlockList() {
		return blockList;
	}
	public void setBlockList(List<Block> blockList) {
		this.blockList = blockList;
	}
	@Override
	public String toString() {
		return "District [districtCd=" + districtCd + ", districtDesc=" + districtDesc + ", activeTag=" + activeTag
				+ ", remarks=" + remarks + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser="
				+ updateUser + ", updateDate=" + updateDate + ", block=" + block + ", blockList=" + blockList + "]";
	}
	
	
	
}
