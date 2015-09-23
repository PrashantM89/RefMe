package org.refme.refme_server_prototype.dao;

import java.util.List;
import org.refme.refme_server_prototype.model.ReferalItem;

/**
 *
 * @author prashant
 */
public interface ReferalListDAO {
    public List<ReferalItem> getMyReferals();
}
