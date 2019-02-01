package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import ph.cpi.rest.api.model.Alop;
import ph.cpi.rest.api.model.quote.Quotation;
import ph.cpi.rest.api.model.quote.QuotationOc;

public interface QuoteDao {
	
	
	public Alop retrieveQuoteAlop(final HashMap<String, Object> params) throws SQLException;
	public List<Alop> retrieveQuoteAlopList(final HashMap<String, Object> params) throws SQLException;
	public List<Quotation> retrieveQuoteListing(final HashMap<String, Object> params) throws SQLException;
	public List<QuotationOc> retrieveQuoteListingOc(final HashMap<String, Object> params) throws SQLException;
	public Quotation retrieveQuoteOption(final HashMap<String, Object> params) throws SQLException;
}
