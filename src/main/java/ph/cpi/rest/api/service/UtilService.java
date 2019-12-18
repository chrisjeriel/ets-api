package ph.cpi.rest.api.service;

import java.sql.SQLException;
import java.util.HashMap;

import org.springframework.stereotype.Service;

import ph.cpi.rest.api.model.Response;
import ph.cpi.rest.api.model.request.GenerateReportRequest;
import ph.cpi.rest.api.model.response.ExtractReportResponse;

@Service
public interface UtilService {

	public ExtractReportResponse extractReport(GenerateReportRequest grr) throws SQLException;
	public String getReportFileName(HashMap<String, Object> params) throws SQLException;
	public String getReportPath() throws SQLException;
	public Response uploadDataTable(String filePath, String acctType, String tranClass, String tranId, String procBy) throws SQLException;
	
}
