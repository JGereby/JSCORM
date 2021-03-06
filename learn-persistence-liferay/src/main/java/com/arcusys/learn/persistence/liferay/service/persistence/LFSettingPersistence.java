package com.arcusys.learn.persistence.liferay.service.persistence;

import com.arcusys.learn.persistence.liferay.model.LFSetting;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the l f setting service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LFSettingPersistenceImpl
 * @see LFSettingUtil
 * @generated
 */
public interface LFSettingPersistence extends BasePersistence<LFSetting> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link LFSettingUtil} to access the l f setting persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the l f setting in the entity cache if it is enabled.
    *
    * @param lfSetting the l f setting
    */
    public void cacheResult(
        com.arcusys.learn.persistence.liferay.model.LFSetting lfSetting);

    /**
    * Caches the l f settings in the entity cache if it is enabled.
    *
    * @param lfSettings the l f settings
    */
    public void cacheResult(
        java.util.List<com.arcusys.learn.persistence.liferay.model.LFSetting> lfSettings);

    /**
    * Creates a new l f setting with the primary key. Does not add the l f setting to the database.
    *
    * @param id the primary key for the new l f setting
    * @return the new l f setting
    */
    public com.arcusys.learn.persistence.liferay.model.LFSetting create(long id);

    /**
    * Removes the l f setting with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the l f setting
    * @return the l f setting that was removed
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFSettingException if a l f setting with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFSetting remove(long id)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFSettingException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.arcusys.learn.persistence.liferay.model.LFSetting updateImpl(
        com.arcusys.learn.persistence.liferay.model.LFSetting lfSetting,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the l f setting with the primary key or throws a {@link com.arcusys.learn.persistence.liferay.NoSuchLFSettingException} if it could not be found.
    *
    * @param id the primary key of the l f setting
    * @return the l f setting
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFSettingException if a l f setting with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFSetting findByPrimaryKey(
        long id)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFSettingException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the l f setting with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the l f setting
    * @return the l f setting, or <code>null</code> if a l f setting with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFSetting fetchByPrimaryKey(
        long id) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the l f setting where key = &#63; or throws a {@link com.arcusys.learn.persistence.liferay.NoSuchLFSettingException} if it could not be found.
    *
    * @param key the key
    * @return the matching l f setting
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFSettingException if a matching l f setting could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFSetting findByKey(
        java.lang.String key)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFSettingException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the l f setting where key = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param key the key
    * @return the matching l f setting, or <code>null</code> if a matching l f setting could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFSetting fetchByKey(
        java.lang.String key)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the l f setting where key = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param key the key
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching l f setting, or <code>null</code> if a matching l f setting could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFSetting fetchByKey(
        java.lang.String key, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the l f settings.
    *
    * @return the l f settings
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFSetting> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the l f settings.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of l f settings
    * @param end the upper bound of the range of l f settings (not inclusive)
    * @return the range of l f settings
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFSetting> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the l f settings.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of l f settings
    * @param end the upper bound of the range of l f settings (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of l f settings
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFSetting> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the l f setting where key = &#63; from the database.
    *
    * @param key the key
    * @return the l f setting that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFSetting removeByKey(
        java.lang.String key)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFSettingException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the l f settings from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of l f settings where key = &#63;.
    *
    * @param key the key
    * @return the number of matching l f settings
    * @throws SystemException if a system exception occurred
    */
    public int countByKey(java.lang.String key)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of l f settings.
    *
    * @return the number of l f settings
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
