package org.refme.refme_server_prototype.hib_pojo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author prashant
 */
@Entity
@Table(name="REFME_REFERER_PROFILE")
public class RefererProfile implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "referer_id",length = 10)
    private Integer refererId;
    @Column(name="referer_name",length = 100)
    private String refererName;
    @Column(name="referer_companyname",length = 100)
    private String refererCompanyName;
    @Column(name="referer_emailid",length = 100)
    private String refererEmailId;
    @Column(name="referer_image",length = 20000)
    private String refererImageString;
    @Column(name="referer_totalexperience",length = 2)
    private Integer refererTotalExperience;
    @Column(name="referer_designation",length = 100)
    private String refererDesignation;

    public Integer getRefererId() {
        return refererId;
    }

    public void setRefererId(Integer refererId) {
        this.refererId = refererId;
    }

    public String getRefererName() {
        return refererName;
    }

    public void setRefererName(String refererName) {
        this.refererName = refererName;
    }

    public String getRefererCompanyName() {
        return refererCompanyName;
    }

    public void setRefererCompanyName(String refererCompanyName) {
        this.refererCompanyName = refererCompanyName;
    }

    public String getRefererEmailId() {
        return refererEmailId;
    }

    public void setRefererEmailId(String refererEmailId) {
        this.refererEmailId = refererEmailId;
    }

    public String getRefererImageString() {
        return refererImageString;
    }

    public void setRefererImageString(String refererImageString) {
        this.refererImageString = refererImageString;
    }

    public Integer getRefererTotalExperience() {
        return refererTotalExperience;
    }

    public void setRefererTotalExperience(Integer refererTotalExperience) {
        this.refererTotalExperience = refererTotalExperience;
    }

    public String getRefererDesignation() {
        return refererDesignation;
    }

    public void setRefererDesignation(String refererDesignation) {
        this.refererDesignation = refererDesignation;
    }
        
}
