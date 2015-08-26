package org.refme.refme_server_prototype.controller;

import java.util.List;
import org.refme.refme_server_prototype.model.ReferalItem;
import org.refme.refme_server_prototype.service.ReferalListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 *
 * @author prashant
 */

@Controller
public class MyReferalController {
    
  @Autowired  
  private ReferalListService ReferalListService;
    
    @RequestMapping(value = "/myReferalList")  
    public @ResponseBody Object myReferalListPage(){      
        List<ReferalItem> myReferalItems = ReferalListService.getMyReferals();             
        return myReferalItems;       
    }
}
