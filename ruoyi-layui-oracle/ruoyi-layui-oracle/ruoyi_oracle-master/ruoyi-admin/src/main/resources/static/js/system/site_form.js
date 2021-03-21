var successCallback = function () {};
layui.use(['common'], function () {
    var $ = layui.jquery
        ,layer = layui.layer
        ,form = layui.form
    //提交表单
    var siteId = $.trim($('#siteId').val());
    var submitBtnId = siteId ? 'btn-edit' : 'btn-add';
    form.render(null, 'form-site');
    form.on('submit('+submitBtnId+')', function(data){
        var url = siteId ? (ctx + 'system/site/edit') : (ctx + 'system/site/add');
        $.ajax({
            type : "post",
            url : url,
            data : data.field,
            async : false,
            error : function(res) {
                layer.msg("系统错误");
            },
            success : function(data) {
                if (data.code > 0) {
                    layui.layer.msg(data.msg);
                } else {
                    successCallback();
                }
            }
        });
        return false;
    });
});