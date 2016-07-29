package hms.service.hub.orm.dao;

import hms.service.hub.orm.model.Area;

import java.util.List;

/**
 * Created by chathura on 7/27/16.
 */
public interface AreaDao extends UniversalDao<Area> {
    List<Area> getAllArea();
    Area getAreaById(long id);

    List<Area> getAreas(List<Long> areaIds);
}
