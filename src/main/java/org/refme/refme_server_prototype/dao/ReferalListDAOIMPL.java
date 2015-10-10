package org.refme.refme_server_prototype.dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.SessionFactory;
import org.refme.refme_server_prototype.hib_pojo.RefererProfile;
import org.refme.refme_server_prototype.model.ReferalItem;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author prashant
 */
@Repository
public class ReferalListDAOIMPL implements ReferalListDAO{

    @Autowired
    private SessionFactory sessionFactory;
    
    private static final Logger LOG = LoggerFactory.getLogger(ReferalListDAOIMPL.class);
    
    private List<ReferalItem> listMyReferals;
     
    
    @Override
    public List<ReferalItem> getMyReferals() {
     listMyReferals = new ArrayList<ReferalItem>();    
     listMyReferals = sessionFactory.getCurrentSession().createCriteria(RefererProfile.class).list();
     
     LOG.debug("Total {} referals fetched",listMyReferals.size());
     return listMyReferals;
    }
    
}
