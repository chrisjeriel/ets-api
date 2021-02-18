package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.accountingintrust.DataCheckExt;

public class ExtractDataCheckResponse {

	private String recordsExist;
	private Integer extractedRecords;
	private List<DataCheckExt> dataCheckExtList;

	public String getRecordsExist() {
		return recordsExist;
	}
	public void setRecordsExist(String recordsExist) {
		this.recordsExist = recordsExist;
	}
	public Integer getExtractedRecords() {
		return extractedRecords;
	}
	public void setExtractedRecords(Integer extractedRecords) {
		this.extractedRecords = extractedRecords;
	}
	public List<DataCheckExt> getDataCheckExtList() {
		return dataCheckExtList;
	}
	public void setDataCheckExtList(List<DataCheckExt> dataCheckExtList) {
		this.dataCheckExtList = dataCheckExtList;
	}
	@Override
	public String toString() {
		return "ExtractDataCheckResponse [recordsExist=" + recordsExist + ", extractedRecords=" + extractedRecords
				+ ", dataCheckExtList=" + dataCheckExtList + "]";
	}
}
