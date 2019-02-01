package ph.cpi.rest.api.dao.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.QuoteDao;
import ph.cpi.rest.api.model.Alop;
import ph.cpi.rest.api.model.quote.HoldCover;
import ph.cpi.rest.api.model.quote.Quotation;
import ph.cpi.rest.api.model.quote.QuotationOc;

@Component
public class QuoteDaoImpl implements QuoteDao{

	@Autowired
	private SqlSession sqlSession;

	@Override
	public Alop retrieveQuoteAlop(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		Alop alop = sqlSession.selectOne("retrieveQuoteAlopSample", params);
		return alop;
	}

	@Override
	public List<Alop> retrieveQuoteAlopList(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<Alop> alopList = sqlSession.selectList("retrieveQuoteAlopSample", params);
		return alopList;
	}

	@Override
	public Quotation retrieveQuoteHoldCover(HashMap<String, Object> params) throws SQLException {
		Quotation quotation = sqlSession.selectOne("retrieveQuoteHoldCover", params);
		return quotation;
	}

	@Override
	public List<QuotationOc> retrieveQuoterGeneralInfoOc(HashMap<String, Object> params) throws SQLException {
		List<QuotationOc> quotationOc = sqlSession.selectList("retrieveQuoteGeneralInfoOc", params);
		return quotationOc;
	}

	@Override
	public List<Quotation> retrieveQuoteHoldCoverListing(HashMap<String, Object> params) throws SQLException {
		List<Quotation> quotationListing = sqlSession.selectList("retrieveQuoteHoldCoverListing", params);
		return quotationListing;
	}

	



	

}
