package com.arcusys.learn.persistence.liferay.service.base;

import com.arcusys.learn.persistence.liferay.service.LFResourceLocalServiceUtil;

import java.util.Arrays;


public class LFResourceLocalServiceClpInvoker {
    private String _methodName0;
    private String[] _methodParameterTypes0;
    private String _methodName1;
    private String[] _methodParameterTypes1;
    private String _methodName2;
    private String[] _methodParameterTypes2;
    private String _methodName3;
    private String[] _methodParameterTypes3;
    private String _methodName4;
    private String[] _methodParameterTypes4;
    private String _methodName5;
    private String[] _methodParameterTypes5;
    private String _methodName6;
    private String[] _methodParameterTypes6;
    private String _methodName7;
    private String[] _methodParameterTypes7;
    private String _methodName8;
    private String[] _methodParameterTypes8;
    private String _methodName9;
    private String[] _methodParameterTypes9;
    private String _methodName10;
    private String[] _methodParameterTypes10;
    private String _methodName11;
    private String[] _methodParameterTypes11;
    private String _methodName12;
    private String[] _methodParameterTypes12;
    private String _methodName13;
    private String[] _methodParameterTypes13;
    private String _methodName14;
    private String[] _methodParameterTypes14;
    private String _methodName15;
    private String[] _methodParameterTypes15;
    private String _methodName212;
    private String[] _methodParameterTypes212;
    private String _methodName213;
    private String[] _methodParameterTypes213;
    private String _methodName218;
    private String[] _methodParameterTypes218;
    private String _methodName219;
    private String[] _methodParameterTypes219;
    private String _methodName220;
    private String[] _methodParameterTypes220;
    private String _methodName221;
    private String[] _methodParameterTypes221;
    private String _methodName222;
    private String[] _methodParameterTypes222;

    public LFResourceLocalServiceClpInvoker() {
        _methodName0 = "addLFResource";

        _methodParameterTypes0 = new String[] {
                "com.arcusys.learn.persistence.liferay.model.LFResource"
            };

        _methodName1 = "createLFResource";

        _methodParameterTypes1 = new String[] { "long" };

        _methodName2 = "deleteLFResource";

        _methodParameterTypes2 = new String[] { "long" };

        _methodName3 = "deleteLFResource";

        _methodParameterTypes3 = new String[] {
                "com.arcusys.learn.persistence.liferay.model.LFResource"
            };

        _methodName4 = "dynamicQuery";

        _methodParameterTypes4 = new String[] {  };

        _methodName5 = "dynamicQuery";

        _methodParameterTypes5 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName6 = "dynamicQuery";

        _methodParameterTypes6 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
            };

        _methodName7 = "dynamicQuery";

        _methodParameterTypes7 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
                "com.liferay.portal.kernel.util.OrderByComparator"
            };

        _methodName8 = "dynamicQueryCount";

        _methodParameterTypes8 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName9 = "fetchLFResource";

        _methodParameterTypes9 = new String[] { "long" };

        _methodName10 = "getLFResource";

        _methodParameterTypes10 = new String[] { "long" };

        _methodName11 = "getPersistedModel";

        _methodParameterTypes11 = new String[] { "java.io.Serializable" };

        _methodName12 = "getLFResources";

        _methodParameterTypes12 = new String[] { "int", "int" };

        _methodName13 = "getLFResourcesCount";

        _methodParameterTypes13 = new String[] {  };

        _methodName14 = "updateLFResource";

        _methodParameterTypes14 = new String[] {
                "com.arcusys.learn.persistence.liferay.model.LFResource"
            };

        _methodName15 = "updateLFResource";

        _methodParameterTypes15 = new String[] {
                "com.arcusys.learn.persistence.liferay.model.LFResource",
                "boolean"
            };

        _methodName212 = "getBeanIdentifier";

        _methodParameterTypes212 = new String[] {  };

        _methodName213 = "setBeanIdentifier";

        _methodParameterTypes213 = new String[] { "java.lang.String" };

        _methodName218 = "createLFResource";

        _methodParameterTypes218 = new String[] {  };

        _methodName219 = "findByPackageID";

        _methodParameterTypes219 = new String[] { "java.lang.Integer" };

        _methodName220 = "findByPackageIDAndResourceID";

        _methodParameterTypes220 = new String[] {
                "java.lang.Integer", "java.lang.String", "int", "int"
            };

        _methodName221 = "removeAll";

        _methodParameterTypes221 = new String[] {  };

        _methodName222 = "getLFResource";

        _methodParameterTypes222 = new String[] { "long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return LFResourceLocalServiceUtil.addLFResource((com.arcusys.learn.persistence.liferay.model.LFResource) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return LFResourceLocalServiceUtil.createLFResource(((Long) arguments[0]).longValue());
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return LFResourceLocalServiceUtil.deleteLFResource(((Long) arguments[0]).longValue());
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return LFResourceLocalServiceUtil.deleteLFResource((com.arcusys.learn.persistence.liferay.model.LFResource) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return LFResourceLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return LFResourceLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return LFResourceLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return LFResourceLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return LFResourceLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return LFResourceLocalServiceUtil.fetchLFResource(((Long) arguments[0]).longValue());
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return LFResourceLocalServiceUtil.getLFResource(((Long) arguments[0]).longValue());
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return LFResourceLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return LFResourceLocalServiceUtil.getLFResources(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return LFResourceLocalServiceUtil.getLFResourcesCount();
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return LFResourceLocalServiceUtil.updateLFResource((com.arcusys.learn.persistence.liferay.model.LFResource) arguments[0]);
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return LFResourceLocalServiceUtil.updateLFResource((com.arcusys.learn.persistence.liferay.model.LFResource) arguments[0],
                ((Boolean) arguments[1]).booleanValue());
        }

        if (_methodName212.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes212, parameterTypes)) {
            return LFResourceLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName213.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes213, parameterTypes)) {
            LFResourceLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName218.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes218, parameterTypes)) {
            return LFResourceLocalServiceUtil.createLFResource();
        }

        if (_methodName219.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes219, parameterTypes)) {
            return LFResourceLocalServiceUtil.findByPackageID((java.lang.Integer) arguments[0]);
        }

        if (_methodName220.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes220, parameterTypes)) {
            return LFResourceLocalServiceUtil.findByPackageIDAndResourceID((java.lang.Integer) arguments[0],
                (java.lang.String) arguments[1],
                ((Integer) arguments[2]).intValue(),
                ((Integer) arguments[3]).intValue());
        }

        if (_methodName221.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes221, parameterTypes)) {
            LFResourceLocalServiceUtil.removeAll();

            return null;
        }

        if (_methodName222.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes222, parameterTypes)) {
            return LFResourceLocalServiceUtil.getLFResource(((Long) arguments[0]).longValue());
        }

        throw new UnsupportedOperationException();
    }
}
