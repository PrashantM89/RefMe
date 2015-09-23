package org.refme.refme_server_prototype.dao;

import java.util.ArrayList;
import java.util.List;
import org.refme.refme_server_prototype.model.ReferalItem;
import org.springframework.stereotype.Repository;

/**
 *
 * @author prashant
 */
@Repository
public class ReferalListDAOIMPL implements ReferalListDAO{

        
    private List<ReferalItem> listMyReferals = new ArrayList<ReferalItem>();
     
    @Override
    public List<ReferalItem> getMyReferals() {
     
        for(int i=0;i<5;i++){
            ReferalItem referalItem = new ReferalItem();
            referalItem.setRefalId(123);
            referalItem.setCompanyName("Accenture");
            referalItem.setExperience("Fresher");
            referalItem.setJobTitle("Senior Software Engineer");
            referalItem.setSenderName("A*$&% *&an");
            listMyReferals.add(referalItem);
        }
             
     return listMyReferals;
    }
    
}
