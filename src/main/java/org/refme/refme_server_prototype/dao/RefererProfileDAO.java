package org.refme.refme_server_prototype.dao;


import org.refme.refme_server_prototype.hib_pojo.RefererProfile;


/**
 *
 * @author prashant
 */
public interface RefererProfileDAO {
    public RefererProfile getRefererProfile(Integer RefererId);
    
    public void setRefererProfile(RefererProfile refererProfile);
}
