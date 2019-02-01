package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import ph.cpi.rest.api.model.Alop;
import ph.cpi.rest.api.model.maintenance.Intermediary;
import ph.cpi.rest.api.model.maintenance.Line;
import ph.cpi.rest.api.model.maintenance.LineClass;

public interface MaintenanceDao {

	public Alop retrieveQuoteAlop(final HashMap<String, Object> params) throws SQLException;
	public List<Alop> retrieveQuoteAlopList(final HashMap<String, Object> params) throws SQLException;
	public Intermediary retrieveMntIntermediary(final HashMap<String, Object> params) throws SQLException;
	public List<Line> retrieveMntLine(final HashMap<String, Object> params ) throws SQLException;
	public LineClass retrieveMntLineClass(final HashMap<String, Object> params ) throws SQLException;
}
