package com.arcusys.learn.persistence.liferay.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
* The base model interface for the LFAttempt service. Represents a row in the &quot;Learn_LFAttempt&quot; database table, with each column mapped to a property of this class.
*
* <p>
    * This interface and its corresponding implementation {@link com.arcusys.learn.persistence.liferay.model.impl.LFAttemptModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.arcusys.learn.persistence.liferay.model.impl.LFAttemptImpl}.
    * </p>
*
* @author Brian Wing Shun Chan
* @see LFAttempt
* @see com.arcusys.learn.persistence.liferay.model.impl.LFAttemptImpl
* @see com.arcusys.learn.persistence.liferay.model.impl.LFAttemptModelImpl
* @generated
*/
public interface LFAttemptModel extends BaseModel<LFAttempt> {
    /*
    * NOTE FOR DEVELOPERS:
    *
    * Never modify or reference this interface directly. All methods that expect a l f attempt model instance should use the {@link LFAttempt} interface instead.
    */

    /**
    * Returns the primary key of this l f attempt.
    *
    * @return the primary key of this l f attempt
    */
    public long getPrimaryKey();

    /**
    * Sets the primary key of this l f attempt.
    *
    * @param primaryKey the primary key of this l f attempt
    */
    public void setPrimaryKey(long primaryKey);

    /**
    * Returns the ID of this l f attempt.
    *
    * @return the ID of this l f attempt
    */
    public long getId();

    /**
        * Sets the ID of this l f attempt.
    *
    * @param id the ID of this l f attempt
    */
    public void setId(long id);

    /**
    * Returns the user i d of this l f attempt.
    *
    * @return the user i d of this l f attempt
    */
    public Integer getUserID();

    /**
        * Sets the user i d of this l f attempt.
    *
    * @param userID the user i d of this l f attempt
    */
    public void setUserID(Integer userID);

    /**
    * Returns the package i d of this l f attempt.
    *
    * @return the package i d of this l f attempt
    */
    public Integer getPackageID();

    /**
        * Sets the package i d of this l f attempt.
    *
    * @param packageID the package i d of this l f attempt
    */
    public void setPackageID(Integer packageID);

    /**
    * Returns the organization i d of this l f attempt.
    *
    * @return the organization i d of this l f attempt
    */
    @AutoEscape
    public String getOrganizationID();

    /**
        * Sets the organization i d of this l f attempt.
    *
    * @param organizationID the organization i d of this l f attempt
    */
    public void setOrganizationID(String organizationID);

    /**
    * Returns the is complete of this l f attempt.
    *
    * @return the is complete of this l f attempt
    */
    public Boolean getIsComplete();

    /**
        * Sets the is complete of this l f attempt.
    *
    * @param isComplete the is complete of this l f attempt
    */
    public void setIsComplete(Boolean isComplete);

    public boolean isNew();

    public void setNew(boolean n);

    public boolean isCachedModel();

    public void setCachedModel(boolean cachedModel);

    public boolean isEscapedModel();

    public Serializable getPrimaryKeyObj();

    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    public ExpandoBridge getExpandoBridge();

    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    public Object clone();

    public int compareTo(LFAttempt lfAttempt);

    public int hashCode();

    public CacheModel<LFAttempt> toCacheModel();

    public LFAttempt toEscapedModel();

    public String toString();

    public String toXmlString();
}
