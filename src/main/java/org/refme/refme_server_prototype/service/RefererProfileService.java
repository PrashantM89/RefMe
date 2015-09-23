package org.refme.refme_server_prototype.service;

import org.refme.refme_server_prototype.hib_pojo.RefererProfile;

/**
 *
 * @author prashant
 */
public interface RefererProfileService {
    public RefererProfile getRefererProfile(Integer refererId);
    public void setRefererProfile(RefererProfile refererProfile);
}
