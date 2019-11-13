package ph.cpi.rest.api.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import ph.cpi.rest.api.model.request.GenerateReportRequest;
import ph.cpi.rest.api.model.response.ExtractReportResponse;

@Service
public interface UtilService {

	public ExtractReportResponse extractReport(GenerateReportRequest grr) throws SQLException;
}