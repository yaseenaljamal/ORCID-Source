package org.orcid.core.manager.v3.read_only;

import java.util.Date;

import org.orcid.core.aop.ProfileLastModifiedAspect;

public interface ManagerReadOnlyBase {
    void setProfileLastModifiedAspect(ProfileLastModifiedAspect profileLastModifiedAspect);

    long getLastModified(String orcid);
    
    Date getLastModifiedDate(String orcid);
}
