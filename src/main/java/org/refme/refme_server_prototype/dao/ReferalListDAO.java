/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.refme.refme_server_prototype.dao;

import java.util.List;
import org.refme.refme_server_prototype.controller.MyReferalController;
import org.refme.refme_server_prototype.model.ReferalItem;

/**
 *
 * @author prashant
 */
public interface ReferalListDAO {
    public List<ReferalItem> getMyReferals();
}
