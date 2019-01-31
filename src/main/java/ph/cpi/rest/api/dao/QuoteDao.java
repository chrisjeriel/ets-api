package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import ph.cpi.rest.api.model.AlopSample;
import ph.cpi.rest.api.model.quote.Quotation;
import ph.cpi.rest.api.model.quote.QuotationOc;

public interface QuoteDao {
	
	
	public AlopSample retrieveQuoteAlop(final HashMap<String, Object> params) throws SQLException;
	public List<AlopSample> retrieveQuoteAlopList(final HashMap<String, Object> params) throws SQLException;
	public Quotation retrieveQuoteCoverage(final HashMap<String, Object> params) throws SQLException;
	public QuotationOc retrieveQuoteDetailsOc(final HashMap<String, Object> params) throws SQLException;
	public Quotation retrieveQuoteDetails(final HashMap<String, Object> params) throws SQLException;
	
}
