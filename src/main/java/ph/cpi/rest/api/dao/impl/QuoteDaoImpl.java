package ph.cpi.rest.api.dao.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.QuoteDao;
import ph.cpi.rest.api.model.Alop;
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
	public Quotation retrieveQuoteCoverage(HashMap<String, Object> params) throws SQLException {
		Quotation quotation = sqlSession.selectOne("retrieveQuoteCoverage", params);
		return quotation;
	}

	@Override
	public QuotationOc retrieveQuoteDetailsOc(HashMap<String, Object> params) throws SQLException {
		QuotationOc quotationOc = sqlSession.selectOne("retrieveQuoteDetailsOc", params);
		return quotationOc;
	}
	
	
}
