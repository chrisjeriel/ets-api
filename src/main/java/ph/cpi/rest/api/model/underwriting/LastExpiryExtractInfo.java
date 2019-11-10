package ph.cpi.rest.api.model.underwriting;

import org.joda.time.DateTime;

public class LastExpiryExtractInfo {
	private String extractedBy;
	private DateTime extractionDate;
	public String getExtractedBy() {
		return extractedBy;
	}
	public void setExtractedBy(String extractedBy) {
		this.extractedBy = extractedBy;
	}
	public DateTime getExtractionDate() {
		return extractionDate;
	}
	public void setExtractionDate(DateTime extractionDate) {
		this.extractionDate = extractionDate;
	}
	
	
}
