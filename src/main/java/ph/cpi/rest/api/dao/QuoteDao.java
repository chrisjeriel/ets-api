package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import ph.cpi.rest.api.model.AlopSample;
import ph.cpi.rest.api.model.quote.Quotation;

public interface QuoteDao {
	
	
	public AlopSample retrieveQuoteAlop(final HashMap<String, Object> params) throws SQLException;
	
	public List<Quotation> retrieveQuoteAlopList(final HashMap<String, Object> params) throws SQLException;
	public List<Quotation> retrieveQuoteAttachmentList(final HashMap<String, Object> params) throws SQLException;
	public List<Quotation> retrieveAlopItemList(final HashMap<String, Object> params ) throws SQLException;
	
}
