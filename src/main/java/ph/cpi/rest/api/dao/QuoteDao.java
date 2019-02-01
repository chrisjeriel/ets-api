package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import ph.cpi.rest.api.model.Alop;
import ph.cpi.rest.api.model.quote.HoldCover;
import ph.cpi.rest.api.model.quote.Quotation;
import ph.cpi.rest.api.model.quote.QuotationOc;

public interface QuoteDao {
	
	
	public Alop retrieveQuoteAlop(final HashMap<String, Object> params) throws SQLException;
	public List<Alop> retrieveQuoteAlopList(final HashMap<String, Object> params) throws SQLException;
	public Quotation retrieveQuoteHoldCover(final HashMap<String, Object> params) throws SQLException;
	public List<QuotationOc> retrieveQuoterGeneralInfoOc(final HashMap<String, Object> params) throws SQLException;
	public List<Quotation> retrieveQuoteHoldCoverListing(final HashMap<String, Object> params) throws SQLException;
}
