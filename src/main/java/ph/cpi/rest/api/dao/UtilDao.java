package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;

public interface UtilDao {
	
	public Integer extractReport(final HashMap<String, Object> params) throws SQLException;
	public String getReportFileName(final HashMap<String, Object> params) throws SQLException;
	public String getReportPath() throws SQLException;
}
