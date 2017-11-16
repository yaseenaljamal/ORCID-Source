/**
 * =============================================================================
 *
 * ORCID (R) Open Source
 * http://orcid.org
 *
 * Copyright (c) 2012-2014 ORCID, Inc.
 * Licensed under an MIT-Style License (MIT)
 * http://orcid.org/open-source-license
 *
 * This copyright and license information (including a link to the full license)
 * shall be included in its entirety in all copies or substantial portion of
 * the software.
 *
 * =============================================================================
 */
package org.orcid.core.manager.v3.read_only.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.orcid.core.manager.v3.read_only.GivenPermissionToManagerReadOnly;
import org.orcid.core.utils.v3.OrcidIdentifierUtils;
import org.orcid.persistence.dao.GivenPermissionToDao;
import org.orcid.persistence.jpa.entities.GivenPermissionByEntity;
import org.orcid.persistence.jpa.entities.GivenPermissionToEntity;
import org.orcid.pojo.DelegateForm;
import org.orcid.pojo.ajaxForm.Text;
import org.orcid.utils.DateUtils;

public class GivenPermissionToManagerReadOnlyImpl implements GivenPermissionToManagerReadOnly {

    @Resource
    private OrcidIdentifierUtils orcidIdentifierUtils;
    
    @Resource
    private GivenPermissionToDao givenPermissionToDaoReadOnly;
    
    @Override
    public List<DelegateForm> findByGiver(String giverOrcid) {
        List<DelegateForm> delegates = new ArrayList<DelegateForm>();
        List<GivenPermissionToEntity> list = givenPermissionToDaoReadOnly.findByGiver(giverOrcid);
        
        for(GivenPermissionToEntity element : list) {
            DelegateForm form = new DelegateForm();
            form.setApprovalDate(DateUtils.convertToXMLGregorianCalendar(element.getApprovalDate()));
            form.setGiverOrcid(orcidIdentifierUtils.buildOrcidIdentifier(element.getGiver()));
            form.setReceiverOrcid(orcidIdentifierUtils.buildOrcidIdentifier(element.getReceiver().getId()));
            form.setReceiverName(Text.valueOf(element.getReceiver().getDisplayName()));
            delegates.add(form);
        }
        
        return delegates;
    }

    @Override
    public List<DelegateForm> findByReceiver(String receiverOrcid) {
        List<DelegateForm> delegates = new ArrayList<DelegateForm>();
        List<GivenPermissionByEntity> list = givenPermissionToDaoReadOnly.findByReceiver(receiverOrcid);
        for(GivenPermissionByEntity element : list) {
            DelegateForm form = new DelegateForm();
            form.setApprovalDate(DateUtils.convertToXMLGregorianCalendar(element.getApprovalDate()));
            form.setLastModifiedDate(DateUtils.convertToXMLGregorianCalendar(element.getGiver().getLastModified()));
            form.setGiverName(Text.valueOf(element.getGiver().getDisplayName()));
            form.setGiverOrcid(orcidIdentifierUtils.buildOrcidIdentifier(element.getGiver().getId()));
            form.setReceiverOrcid(orcidIdentifierUtils.buildOrcidIdentifier(element.getReceiver()));            
            delegates.add(form);
        }
        return delegates;
    }
    
    @Override
    public DelegateForm findByGiverAndReceiverOrcid(String giverOrcid, String receiverOrcid) {
        GivenPermissionToEntity entity = givenPermissionToDaoReadOnly.findByGiverAndReceiverOrcid(giverOrcid, receiverOrcid);
        if(entity != null) {
            DelegateForm form = new DelegateForm();
            form.setApprovalDate(DateUtils.convertToXMLGregorianCalendar(entity.getApprovalDate()));
            form.setGiverOrcid(orcidIdentifierUtils.buildOrcidIdentifier(entity.getGiver()));
            form.setReceiverOrcid(orcidIdentifierUtils.buildOrcidIdentifier(entity.getReceiver().getId()));
            form.setReceiverName(Text.valueOf(entity.getReceiver().getDisplayName()));
            return form;
        }
        return null;
    }    
}
