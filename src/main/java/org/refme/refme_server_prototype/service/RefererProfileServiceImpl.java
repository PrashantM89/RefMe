
package org.refme.refme_server_prototype.service;

import org.refme.refme_server_prototype.dao.RefererProfileDAO;
import org.refme.refme_server_prototype.hib_pojo.RefererProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author prashant
 */

@Service
public class RefererProfileServiceImpl implements RefererProfileService{

    @Autowired
    RefererProfileDAO refererProfileDao;       
            
    @Override
    @Transactional
    public RefererProfile getRefererProfile(Integer refererId) {
       return refererProfileDao.getRefererProfile(refererId);       
    }

    @Override
    public void setRefererProfile(RefererProfile refererProfile) {
     refererProfileDao.setRefererProfile(refererProfile);
    }        
}
