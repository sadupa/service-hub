package hms.service.hub.core.service.impl;

import hms.service.hub.core.service.AreaService;
import hms.service.hub.orm.dao.AreaDao;
import hms.service.hub.orm.model.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by chathura on 7/27/16.
 */
@Transactional
@Service("areaService")
public class AreaServiceImpl implements AreaService {

    @Autowired
    AreaDao areaDao;

    @Override
    public List<Area> getAllArea() {
        return areaDao.getAllArea();
    }
}
