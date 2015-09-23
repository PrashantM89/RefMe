
package org.refme.refme_server_prototype.service;

import java.util.List;
import javax.transaction.Transactional;
import org.refme.refme_server_prototype.dao.ReferalListDAO;
import org.refme.refme_server_prototype.model.ReferalItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author prashant
 */
@Service
@Transactional
public class ReferalListServiceImpl implements ReferalListService{

    @Autowired
    public ReferalListDAO referalListDAO;
    
    private List<ReferalItem> listMyReferals;
    
    @Override
    public List<ReferalItem> getMyReferals() {
      listMyReferals =  referalListDAO.getMyReferals();
      return listMyReferals;
    }
    
}
