package ph.cpi.rest.api.model.maintenance;

public class District {
	private String districtCd;
	private String districtDesc;
	private Block block;
	
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
	public Block getBlock() {
		return block;
	}
	public void setBlock(Block block) {
		this.block = block;
	}
	@Override
	public String toString() {
		return "District [districtCd=" + districtCd + ", districtDesc=" + districtDesc + ", block=" + block + "]";
	}
	
	
}
