package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import ph.cpi.rest.api.model.underwriting.Attachment;

public interface UnderwritingDao {
	public List<Attachment> retrievePolAttachmentList(final HashMap<String, Object> params) throws SQLException;
}
