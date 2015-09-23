package org.refme.refme_server_prototype.service;

import java.util.List;
import org.refme.refme_server_prototype.model.ReferalItem;

/**
 *
 * @author prashant
 */
public interface ReferalListService {
    
    public List<ReferalItem> getMyReferals();
       
}
