package ph.cpi.rest.api.dao.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.MaintenanceDao;
import ph.cpi.rest.api.model.Alop;
import ph.cpi.rest.api.model.maintenance.Deductibles;
import ph.cpi.rest.api.model.maintenance.EndtCode;
import ph.cpi.rest.api.model.maintenance.Insured;
import ph.cpi.rest.api.model.maintenance.Region;

@Component
public class MaintenanceDaoImpl implements MaintenanceDao{

	@Autowired
	private SqlSession sqlSession;

	@Override
	public Alop retrieveQuoteAlop(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		Alop alop = sqlSession.selectOne("retrieveMaintenanceSample", params);
		return alop;
	}

	@Override
	public List<Alop> retrieveQuoteAlopList(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<Alop> alopList = sqlSession.selectList("retrieveMaintenanceSample", params);
		return alopList;
	}
	
	@Override
	public List<Insured> retrieveMtnInsured(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<Insured> insured = sqlSession.selectList("retrieveMtnInsured", params);
		return insured;
	}

	@Override
	public List<EndtCode> retrieveEndtCode(HashMap<String, Object> params) throws SQLException {
		List<EndtCode> endtCode = sqlSession.selectList("retrieveEndtCode", params);
		return endtCode;
	}

	@Override
	public List<Region> retrieveMtnDistrict(HashMap<String, Object> params) throws SQLException {
		List<Region> district = sqlSession.selectList("retrieveMtnDistrict",params);
		return district;
	}

	@Override
	public List<Deductibles> retrieveMtnDeductibles(HashMap<String, Object> params) throws SQLException {
		List<Deductibles> deductibles = sqlSession.selectList("retrieveMtnDeductibles",params);
		return deductibles;
	}
	
}
