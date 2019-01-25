package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import ph.cpi.rest.api.model.Alop;
import ph.cpi.rest.api.model.quote.AlopItem;
import ph.cpi.rest.api.model.quote.Attachment;

public interface QuoteDao {
	
	
	public Alop retrieveQuoteAlop(final HashMap<String, Object> params) throws SQLException;
	public List<Alop> retrieveQuoteAlopList(final HashMap<String, Object> params) throws SQLException;
	public Attachment retrieveQuoteAttachment(final HashMap<String, Object> params) throws SQLException;
	public List<Attachment> retrieveQuoteAttachmentList(final HashMap<String, Object> params) throws SQLException;
	public AlopItem retrieveQuoteAlopItem(final HashMap<String, Object> params) throws SQLException;
	public List<AlopItem> retrieveQuoteAlopItemList(final HashMap<String, Object> params) throws SQLException;
	
}
