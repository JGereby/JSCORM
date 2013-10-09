UserAccountService = new Backbone.Service({ url:Utils.getContextPath,
    sync:{
        'read':{
            'path':function (model) {
                return "/services/liferay/user/" + jQuery("#userID").val();
            }
        }
    }
});


UserAccountModel = Backbone.Model.extend({
    defaults:{
        userID:"",
        name:"xx"
    }
}).extend(UserAccountService);
