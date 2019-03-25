package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;

import ph.cpi.rest.api.model.underwriting.Policy;

public interface UnderwritingDao {
	public Policy retrievePolAttachmentList(final HashMap<String, Object> params) throws SQLException;
	public Policy retrievePolEndtList(final HashMap<String, Object> params) throws SQLException;
}
