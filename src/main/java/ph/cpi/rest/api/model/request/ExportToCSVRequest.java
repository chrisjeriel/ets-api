package ph.cpi.rest.api.model.request;

import java.util.Arrays;
import java.util.Map;

public class ExportToCSVRequest {
	
	private String methodUrl;
	private String extractTitle;
	private String[] columnTitleList;
	private String[] columnList;
	private String outputClass;
	private Map<String, Object> params;
	public String getMethodUrl() {
		return methodUrl;
	}
	public void setMethodUrl(String methodUrl) {
		this.methodUrl = methodUrl;
	}
	public String getExtractTitle() {
		return extractTitle;
	}
	public void setExtractTitle(String extractTitle) {
		this.extractTitle = extractTitle;
	}
	public String[] getColumnTitleList() {
		return columnTitleList;
	}
	public void setColumnTitleList(String[] columnTitleList) {
		this.columnTitleList = columnTitleList;
	}
	public String[] getColumnList() {
		return columnList;
	}
	public void setColumnList(String[] columnList) {
		this.columnList = columnList;
	}
	public String getOutputClass() {
		return outputClass;
	}
	public void setOutputClass(String outputClass) {
		this.outputClass = outputClass;
	}
	public Map<String, Object> getParams() {
		return params;
	}
	public void setParams(Map<String, Object> params) {
		this.params = params;
	}
	@Override
	public String toString() {
		return "ExportToCSVRequest [methodUrl=" + methodUrl + ", extractTitle=" + extractTitle + ", columnTitleList="
				+ Arrays.toString(columnTitleList) + ", columnList=" + Arrays.toString(columnList) + ", outputClass="
				+ outputClass + ", params=" + params + "]";
	}
	
}
