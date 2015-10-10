package org.refme.refme_server_prototype.controller;

import java.util.List;
import org.refme.refme_server_prototype.hib_pojo.RefererProfile;
import org.refme.refme_server_prototype.model.ReferalItem;
import org.refme.refme_server_prototype.service.ReferalListService;
import org.refme.refme_server_prototype.service.RefererProfileService;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


/**
 *
 * @author prashant
 */

@Controller
public class MyReferalController {
    
  @Autowired  
  private ReferalListService referalListService;
  @Autowired
  private RefererProfileService refererProfileService;
    
  private static final Logger LOG = LoggerFactory.getLogger(MyReferalController.class);
  
    @RequestMapping(value = "/myReferalList")  
    public @ResponseBody Object myReferalListPage(){  
    
        LOG.debug("Debug log");
        LOG.info("Log info");
        List<ReferalItem> myReferalItems = referalListService.getMyReferals();             
        return myReferalItems;       
    }
    
    @RequestMapping(value = "/save")
    public ModelAndView saveRefererProfile(){
        RefererProfile myProfile = new RefererProfile();
        myProfile.setRefererCompanyName("Infosys");
        myProfile.setRefererDesignation("Sr. Software Engineer");
        myProfile.setRefererEmailId("prashantm61289@gmail.com");
        myProfile.setRefererName("Pratik Mishra");
        myProfile.setRefererTotalExperience(1);
        myProfile.setRefererImageString("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");
                
        refererProfileService.setRefererProfile(myProfile);
        return new ModelAndView("redirect:/");
    }
}
