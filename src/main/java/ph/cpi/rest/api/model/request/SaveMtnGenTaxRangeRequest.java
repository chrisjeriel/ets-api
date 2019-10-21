package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveMtnGenTaxRangeRequest {
	
	private List<SaveMtnGenTaxRange> saveList;
	private List<SaveMtnGenTaxRange> delList;
	
	public List<SaveMtnGenTaxRange> getSaveList() {
		return saveList;
	}
	public void setSaveList(List<SaveMtnGenTaxRange> saveList) {
		this.saveList = saveList;
	}
	public List<SaveMtnGenTaxRange> getDelList() {
		return delList;
	}
	public void setDelList(List<SaveMtnGenTaxRange> delList) {
		this.delList = delList;
	}
	
	@Override
	public String toString() {
		return "SaveMtnGenTaxRangeRequest [saveList=" + saveList + ", delList="
				+ delList + "]";
	}
}

class SaveMtnGenTaxRange {
	
	private String taxId;
	private String rangeNo;
	private String minVal;
	private String maxVal;
	private String rate;
	private String amount;
	
	public String getRangeNo() {
		return rangeNo;
	}
	public void setRangeNo(String rangeNo) {
		this.rangeNo = rangeNo;
	}
	public String getTaxId() {
		return taxId;
	}
	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}
	public String getMinVal() {
		return minVal;
	}
	public void setMinVal(String minVal) {
		this.minVal = minVal;
	}
	public String getMaxVal() {
		return maxVal;
	}
	public void setMaxVal(String maxVal) {
		this.maxVal = maxVal;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "SaveMtnGenTaxRange [taxId=" + taxId + ", rangeNo=" + rangeNo
				+ ", minVal=" + minVal + ", maxVal=" + maxVal + ", rate="
				+ rate + ", amount=" + amount + "]";
	}
	
}