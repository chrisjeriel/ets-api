package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import ph.cpi.rest.api.model.utils.POLR044A;
import ph.cpi.rest.api.model.utils.POLR044B;
import ph.cpi.rest.api.model.utils.POLR044C;
import ph.cpi.rest.api.model.utils.POLR044D;
import ph.cpi.rest.api.model.utils.POLR044E;
import ph.cpi.rest.api.model.utils.POLR044F;
import ph.cpi.rest.api.model.utils.POLR044G;
import ph.cpi.rest.api.model.utils.POLR044H;

public interface UtilDao {
	
	public Integer extractReport(final HashMap<String, Object> params) throws SQLException;
	public String getReportFileName(final HashMap<String, Object> params) throws SQLException;
	public String getReportPath() throws SQLException;
	
	public List<POLR044E> retrievePolR044e(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044A> retrievePolR044a(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044B> retrievePolR044b(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044C> retrievePolR044c(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044D> retrievePolR044d(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044F> retrievePolR044f(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044G> retrievePolR044g(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044H> retrievePolR044h(final HashMap<String, Object> params ) throws SQLException;
}
