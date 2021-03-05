package ph.cpi.rest.api.model.request;

import java.math.BigDecimal;
import java.util.List;

public class SaveQSOARiDtlRequest {

	private Integer qsoaId;
	private String cedingId;
	private String currCd;
	private List<SaveEngDtl> saveEngDtlList;
	private List<SaveEngDtl> saveOsClmDtlList;
	private List<SaveTrtySumm> saveTrtySumm;
	private List<SaveTrtySumm> delTrtySumm;
	
	public Integer getQsoaId() {
		return qsoaId;
	}
	public void setQsoaId(Integer qsoaId) {
		this.qsoaId = qsoaId;
	}
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	public List<SaveEngDtl> getSaveEngDtlList() {
		return saveEngDtlList;
	}
	public void setSaveEngDtlList(List<SaveEngDtl> saveEngDtlList) {
		this.saveEngDtlList = saveEngDtlList;
	}
	public List<SaveEngDtl> getSaveOsClmDtlList() {
		return saveOsClmDtlList;
	}
	public void setSaveOsClmDtlList(List<SaveEngDtl> saveOsClmDtlList) {
		this.saveOsClmDtlList = saveOsClmDtlList;
	}
	public List<SaveTrtySumm> getSaveTrtySumm() {
		return saveTrtySumm;
	}
	public void setSaveTrtySumm(List<SaveTrtySumm> saveTrtySumm) {
		this.saveTrtySumm = saveTrtySumm;
	}
	public List<SaveTrtySumm> getDelTrtySumm() {
		return delTrtySumm;
	}
	public void setDelTrtySumm(List<SaveTrtySumm> delTrtySumm) {
		this.delTrtySumm = delTrtySumm;
	}
	@Override
	public String toString() {
		return "SaveQSOARiDtlRequest [qsoaId=" + qsoaId + ", cedingId=" + cedingId + ", currCd=" + currCd
				+ ", saveEngDtlList=" + saveEngDtlList + ", saveOsClmDtlList=" + saveOsClmDtlList + ", saveTrtySumm="
				+ saveTrtySumm + ", delTrtySumm=" + delTrtySumm + "]";
	}
}

class SaveEngDtl {
	private Integer qsoaId;
	private Integer treatyId;
	private Integer uwYear;
	private String lineCd;
	private Integer itemNo;
	private BigDecimal itemAmt;
	
	public Integer getQsoaId() {
		return qsoaId;
	}
	public void setQsoaId(Integer qsoaId) {
		this.qsoaId = qsoaId;
	}
	public Integer getTreatyId() {
		return treatyId;
	}
	public void setTreatyId(Integer treatyId) {
		this.treatyId = treatyId;
	}
	public Integer getUwYear() {
		return uwYear;
	}
	public void setUwYear(Integer uwYear) {
		this.uwYear = uwYear;
	}
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}
	public Integer getItemNo() {
		return itemNo;
	}
	public void setItemNo(Integer itemNo) {
		this.itemNo = itemNo;
	}
	public BigDecimal getItemAmt() {
		return itemAmt;
	}
	public void setItemAmt(BigDecimal itemAmt) {
		this.itemAmt = itemAmt;
	}
	@Override
	public String toString() {
		return "SaveEngDtl [qsoaId=" + qsoaId + ", treatyId=" + treatyId + ", uwYear=" + uwYear + ", lineCd=" + lineCd
				+ ", itemNo=" + itemNo + ", itemAmt=" + itemAmt + "]";
	}
}

class SaveTrtySumm {
	private Integer qsoaId;
	private Integer itemNo;
	private String itemName;
	private BigDecimal itemAmt;
	
	public Integer getQsoaId() {
		return qsoaId;
	}
	public void setQsoaId(Integer qsoaId) {
		this.qsoaId = qsoaId;
	}
	public Integer getItemNo() {
		return itemNo;
	}
	public void setItemNo(Integer itemNo) {
		this.itemNo = itemNo;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public BigDecimal getItemAmt() {
		return itemAmt;
	}
	public void setItemAmt(BigDecimal itemAmt) {
		this.itemAmt = itemAmt;
	}
	@Override
	public String toString() {
		return "SaveTrtySumm [qsoaId=" + qsoaId + ", itemNo=" + itemNo + ", itemName=" + itemName + ", itemAmt="
				+ itemAmt + "]";
	}
}
