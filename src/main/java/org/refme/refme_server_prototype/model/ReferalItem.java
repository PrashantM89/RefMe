package org.refme.refme_server_prototype.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author prashant
 */
@Entity
@Table(name = "REFERAL_ITEMS")
public class ReferalItem {

    @Id
    @GeneratedValue
    private Integer refalId;    
    private String jobTitle;
    private String companyName;    
    private String experience;
    private String senderName;

    public ReferalItem() {
    }
        
    public Integer getRefalId() {
        return refalId;
    }

    public void setRefalId(Integer refalId) {
        this.refalId = refalId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }        
}
