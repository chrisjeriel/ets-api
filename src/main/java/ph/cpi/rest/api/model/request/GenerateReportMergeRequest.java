package ph.cpi.rest.api.model.request;

import java.util.List;
import ph.cpi.rest.api.model.utils.Report;

public class GenerateReportMergeRequest {

	private List<Report> reportRequest;

	public List<Report> getReportRequest() {
		return reportRequest;
	}

	public void setReportRequest(List<Report> reportRequest) {
		this.reportRequest = reportRequest;
	}
	
	@Override
	public String toString() {
		return "GenerateReportMergeRequest [reportRequest=" + reportRequest + "]";
	}
	
}

