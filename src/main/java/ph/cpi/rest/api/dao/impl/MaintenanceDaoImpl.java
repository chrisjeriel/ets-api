package ph.cpi.rest.api.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.MaintenanceDao;
import ph.cpi.rest.api.model.Alop;
import ph.cpi.rest.api.model.maintenance.Object_;
import ph.cpi.rest.api.model.maintenance.Province;
import ph.cpi.rest.api.model.maintenance.QuoteWordings;
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
	public Region retrieveMtnRegion(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		Region region = sqlSession.selectOne("retrieveMtnRegion", params);;
		return region;
	}

	@Override
	public Province retrieveMtnProvince(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		Province province = sqlSession.selectOne("retrieveMtnProvince", params);
		return province;
	}

	@Override
	public Object_ retrieveMtnObject(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		Object_ object = sqlSession.selectOne("retrieveMtnObject", params);
		return object;
	}

	@Override
	public List<QuoteWordings> retrieveMtnQuoteWordings(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<QuoteWordings> listQuoteWordings = sqlSession.selectList("retrieveMtnQuoteWordings", params);
		return listQuoteWordings;
	}


	

}
