package neusoft_pro.service;

import com.neusoft.entity.Pro;
import com.neusoft_pro.dao.ProDAO;
import com.neusoft_pro.dao.ProDAOImpl;


import java.sql.SQLException;
import java.util.List;

public class ProServiceImpl implements ProService {
    ProDAO proDAO = new ProDAOImpl();

    @Override
    public Pro findByPid(int pro_id) throws SQLException {
        return proDAO.findByPid(pro_id);
    }

    @Override
    public List<Pro> findByPri(double price) throws SQLException {
        return proDAO.findByPri((int) price);
    }
}
