package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.workflowmanager.RelatedRecord;

public class RetrieveRelatedRecordsResponse {
	
	private List<RelatedRecord> relatedRecordList;

	public List<RelatedRecord> getRelatedRecordList() {
		return relatedRecordList;
	}

	public void setRelatedRecordList(List<RelatedRecord> relatedRecordList) {
		this.relatedRecordList = relatedRecordList;
	}

	@Override
	public String toString() {
		return "RetrieveRelatedRecordsResponse [relatedRecordList=" + relatedRecordList + "]";
	}
	
	
}
