package ph.cpi.rest.api.model.accountingintrust;

import org.joda.time.DateTime;

public class AcitMonthEnd {

	private DateTime eomDate;
	private String batchProdReport;
	private String batchOsReport;
	
	public DateTime getEomDate() {
		return eomDate;
	}
	public void setEomDate(DateTime eomDate) {
		this.eomDate = eomDate;
	}
	public String getBatchProdReport() {
		return batchProdReport;
	}
	public void setBatchProdReport(String batchProdReport) {
		this.batchProdReport = batchProdReport;
	}
	public String getBatchOsReport() {
		return batchOsReport;
	}
	public void setBatchOsReport(String batchOsReport) {
		this.batchOsReport = batchOsReport;
	}
	@Override
	public String toString() {
		return "AcitMonthEnd [eomDate=" + eomDate + ", batchProdReport=" + batchProdReport + ", batchOsReport="
				+ batchOsReport + "]";
	}
}
