package com.quanfangtongvip.springcloudplayground.context.enums;

/**
 * Description: 响应结果
 * 错误编码说明：错误编码共六位，前两位表示错误级别，中间两位为模块，后两位为错误错误编码
 * 错误级别：10:系统级别，20：服务级别  30:业务级别
 * <p>
 * ClassName: Result
 * date: 2018年11月11日
 *
 * @author YGC
 * @since JDK 1.8
 */
public enum ErrorCode {

    //----------------------------------------成功
    SUCCESS("0", "success"),

    //----------------------------------------通用错误码 前缀:0681 XXXX-----------------------------------------
    //----------------------------------------通用错误码
    _10001("06810001", "系统错误！"),
    _10002("06810002", "未知类型错误！"),
    _10003("06810003", "资源未找到！"),
    _10004("06810004", "参数校验失败！"),
    _10005("06810005", "非法请求！"),
    _10006("06810006", "权限校验失败！"),
    _10007("06810007", "服务调用失败！"),

    _10008("06810008", "参数为空！"),
    _10009("06810009", "请输入数字！"),

    _10010("06810010", "上传文件失败！"),
    _10011("06810011", "请选择文件！"),
    _10012("06810012", "上传图片大小超过限制！"),
    _10018("06810018", "上传视频大小超过限制！"),

    _10013("06810013", "操作失败，请稍后再试"),
    _10014("06810014", "释放锁资源失败"),
    _10015("06810015", "Redis获取数据异常"),
    _10016("06810016", "图片转换失败"),
    _10017("06810017", "请勿重复添加!"),

    //----------------------------------------业务错误码 前缀:0682 XXXX-----------------------------------------
    //----------------------------------------用户模块 0682 0001 - 0100
    _20001("06820001", "未登录或登录已超时"),
    _20002("06820002", "账号不存在"),
    _20003("06820003", "密码错误，请重新输入密码"),
    _20004("06820004", "登录失败"),
    _20005("06820005", "登出失败"),
    _20006("06820006", "获取用户信息失败"),
    _20007("06820007", "分享过期"),
    _20008("06820008", "手机号已被注册，请更换手机号进行绑定"),
    _20009("06820009", "请重新绑定手机号"),
    _20010("06820010", "请同意闪租服务协议"),
    _20011("06820011", "请重新尝试"),
    _20012("06820012", "请先绑定手机号"),
    _20013("06820013", "已开通过CA账户"),
    _20014("06820014", "请先登录会营销"),
    _20015("06820015", "会营销token服务调用失败"),
    _20016("06820016", "会营销uuid服务调用失败"),
    _20017("06820017", "会营销公司id为空"),
    _20018("06820018", "CA账户开通失败"),
    _20019("06820019", "身份证和姓名不匹配，请重新输入"),
    _20020("06820020", "会营销认证失败"),
    _20021("06820021", "没有操作权限"),
    _20022("06820022", "部门负责人暂时只可查看，不可以进行其他操作"),
    _20023("06820023", "账户没有系统配置"),
    _20024("06820024", "账户没有设置承付方"),

    //----------------------------------------房源模块 0682 0101 - 0200
    _20101("06820101", "房屋介绍不能包含特殊字符"),
    _20102("06820102", "房屋介绍不能包含特殊字符"),
    _20103("06820103", "更新房源失败"),
    _20104("06820104", "新增房源失败"),
    _20105("06820105", "查询房源列表失败"),
    _20106("06820106", "查询房源详情失败"),
    _20107("06820107", "删除房源详情失败"),
    _20108("06820108", "上架房源失败"),
    _20109("06820109", "下架房源失败"),
    _20110("06820110", "查询小区信息失败"),
    _20111("06820111", "根据坐标查询小区信息失败"),
    _20112("06820112", "查询城市信息失败"),
    _20113("06820113", "调用搜索服务失败!"),
    _20114("06820114", "未查询到房源!"),
    _20115("06820115", "获取分享房源信息失败"),
    _20116("06820116", "获取分享房源列表失败"),
    _20117("06820117", "网络出错，请刷新重试哦!"),
    _20118("06820118", "请选择正确的地理位置"),
    _20119("06820119", "请登录后重试"),
    _20120("06820120", "您已有类似房源，为防止重复，请在门牌号处区分！"),
    _20121("06820121", "分享房源数量超出限制"),
    _20122("06820122", "删除房源出错"),


    _20123("06820123", "批量更新图片出错"),
    _20124("06820124", "批量插入图片出错"),
    _20125("06820125", "批量删除图片出错"),
    _20126("06820126", "当前免费发布房源数量已用完。包含上架和下架。请删除无用房源。"),
    _20127("06820127", "拨打电话出错"),
    _20128("06820128", "批量插入房源设置出错"),
    _20129("06820129", "批量删除房源设置出错"),
    _20130("06820130", "该房源不是运营系统录入房源"),
    _20131("06820131", "房源所属用户和当前登陆用户信息不一致"),
    _20132("06820132", "上架房源不可删除"),
    _20133("06820133", "当前楼层大于总楼层"),
    _20134("06820134", "房源开锁方式不匹配"),
    _20135("06820135", "请填写开锁备注"),
    _20136("06820136", "未查询到收藏记录"),
    _20137("06820137", "房源已下架"),
    _20138("06820138", "房源编号重复"),
    _20139("06820139", "您已有类似房源，为防止重复，请在房间号处区分！"),
    _20140("06820140", "模板名称重复"),
    _20141("06820141", "添加模板到数据库失败"),
    _20142("06820142", "佣金比例应该在0%~100%之间"),
    _20143("06820143", "该模板不存在"),
    _20144("06820144", "删除模板失败"),
    _20145("06820145", "更新模板失败"),
    _20150("06820150", "门牌号重复！"),
    _20151("06820151", "房间号重复！"),
    _20152("06820152", "房源聚合编号生成错误"),
    _20153("06820153", "请选择管家"),
    _20155("06820155", "不允许改变出租类型"),
    _20156("06820156", "租金模板不存在"),
    _20157("06820157", "佣金模板不存在"),
    _20159("06820159", "佣金模板不存在"),
    _20160("06820160", "租金配置不存在"),
    _20161("06820161", "请添加其他费用配置"),
    _20162("06820162", "请添加租金配置"),
    _20163("06820163", "请添加佣金配置"),
    _20165("06820165", "房间号不能为空"),
    _20166("06820166", "独卫数量不能为空"),
    _20167("06820167", "房间面积不能为空"),
    _20168("06820168", "没有权限"),
    _20169("06820169", "请按照模板格式上传文件"),
    _20170("06820170", "请在EXCEL填写要导入的数据"),
    _20171("06820171", "Excel工作薄为空！"),
    _20172("06820172", "房源户型取值范围0-15！"),
    _20173("06820173", "房源或房间面积取值范围1-2000！"),
    _20175("06820175", "楼层总数取值范围1-200！"),
    _20176("06820176", "出租情况取值范围0-20！"),
    _20177("06820177", "所在楼层取值范围-10-200！"),
    _20178("06820178", "所在楼层应小于总楼层数！"),
    _20179("06820179", "房源已下架或已删除!"),
    _20180("06820180", "门店不存在!"),
    _20181("06820181", "门店名重复!"),
    _20182("06820182", "房型名称重复!"),
    _20183("06820183", "插入房源导入结果失败!"),
    _20185("06820185", "照片数量超过限制!"),
    _20186("06820186", "门牌号不能为空!"),
    _20187("06820187", "请选择小区!"),
    _20188("06820188", "请选择门店!"),
    _20189("06820189", "请填写房型最大面积!"),
    _20190("06820189", "请填写房型房间总数!"),
    _20191("06820189", "请填写当前待租房间数!"),
    _20192("06820192", "房间面积不能大于房源面积!"),
    _20193("06820193", "最小面积不能大于最大面积!"),
    _20195("06820195", "房型总数不能小于待租房间数!"),
    _20196("06820196", "租金不能小1元!"),
    _20197("06820197", "房源审核状态异常!"),
    _20198("06820198", "厨房或独卫不能大于5!"),
    _20199("06820199", "企业开启了房源审核，不能使用该功能!"),
    _20200("06820200", "模板已更新，请下载新的Excel模板再上传"),
    _20201("06820201", "交定未到期"),
    _20202("06820202", "楼盘不可用，请重新选择"),

    //----------------------------------------订单模块 0682 0201 - 0300

    //----------------------------------------支付模块 0682 0301 - 0400
    _20301("06820301", "调起收银台失败"),
    _20302("06820302", "服务繁忙，请稍后重试"),
    _20303("06820303", "余额不足"),
    _20304("06820304", "已设置过支付密码"),
    _20305("06820305", "旧密码输入有误，请重新输入旧密码"),
    _20306("06820306", "登录密码输入有误，请重新输入登录密码"),
    _20307("06820307", "操作已失效，请重试"),
    _20308("06820308", "与原卡信息不一致，请重新输入"),
    _20309("06820309", "验证码错误"),
    _20310("06820310", "密码错误"),
    _20311("06820311", "单笔最高提现金额%s元"),
    _20312("06820312", "单笔最低提现金额%s元"),
    _20313("06820313", "忘记密码每天仅提供%s次短信验证，为了保证账户安全，请明天再试"),
    _20314("06820314", "当前不支持绑定该银行卡，具体支持银行请查看支持银行列表；"),

    //----------------------------------------微信模块 0682 0401 - 0500
    _20401("06820401", "解密用户信息失败"),
    _20402("06820402", "获取小程序二维码失败"),
    _20403("06820403", "获取小程序码path失败"),
    _20404("06820404", "获取小程序码scene失败"),
    _20405("06820405", "获取分享图片失败,请重试"),
    _20406("06820406", "推送信息失败"),
    _20407("06820407", "获取小程序码信息失败"),
    _20408("06820408", "查询信息失败"),
    _20409("06820409", "微信登录凭证校验失败"),

    //----------------------------------------微信模块 0682 0501 - 0600
    _20501("06820501", "用户已关注小区"),
    _20502("06820502", "查询关注小区列表失败"),
    _20503("06820503", "调用ES服务查询城市下房源总数失败"),
    _20504("06820504", "商圈关注数量上限目前为20"),
    _20505("06820505", "小区目前支持关注上限为100"),
    _20506("06820506", "用户已关注二房东"),
    _20507("06820507", "关注二房东数量超出限制200"),
    _20508("06820508", "用户未关注二房东"),
    _20509("06820509", "不好意思，自己暂时无法关注自己"),
    _20510("06820510", "获取关注微信公众号用户列表失败"),
    _20511("06820511", "获取微信公众号关注用户基本信息失败"),
    _20512("06820512", "发送微信公众号模板消息失败"),
    _20513("06820513", "创建微信公众号菜单失败"),
    _20514("06820514", "获取微信公众号素材列表失败"),
    _20515("06820515", "用户已关该公司"),
    _20516("06820516", "用户未关注公司"),
    _20517("06820517", "集中式门店暂时不可以关注"),


    //----------------------------------------楼盘模块 0682 0601 - 0700
    _20601("06820601", "查询小区详情失败"),
    _20602("06820602", "查询地铁线列表失败"),
    _20603("06820603", "查询地铁站点列表失败"),
    _20604("06820604", "查询小区code列表失败"),
    _20605("06820605", "查询区域商圈列表失败"),
    _20606("06820606", "查询楼盘列表失败"),


    //----------------------------------------OSS模块 0682 0701 - 0800
    _20701("06820701", "没有录入房源"),
    _20702("06820702", "超出可录入房源上限"),
    _20703("06820703", "您本次录入房源有重复，为防止重复，请在门牌号处区分！"),
    _20704("06820704", "您本次录入房源和二房东房源重复，为防止重复，请在门牌号处区分！"),
    _20705("06820705", "新增房源失败"),
    _20706("06820706", "新用户和旧用户一致！"),
    _20707("06820707", "超出房东房源上限"),
    _20708("06820708", "出租类型和房间类型不匹配"),
    _20709("06820709", "关联用户不能有联系电话。"),
    _20710("06820710", "%s该房源联系电话已注册，请检查"),
    _20711("06820711", "有房源无手机号"),
    _20712("06820712", "房源特色不匹配"),
    _20713("06820713", "请填写开门方式备注"),
    _20714("06820714", "新增公司失败"),
    _20715("06820715", "更新公司失败"),
    _20716("06820716", "公司名称已存在"),
    _20717("06820717", "公司名称不存在"),
    _20718("06820718", "导出失败！"),
    _20719("06820719", "销售人员不存在！"),
    _20720("06820720", "请选择城市"),



    //----------------------------------------中间件模块 0682 0801 - 0900
    _20801("06820801", "签名验证失败"),
    _20802("06820802", "商户已存在"),
    _20803("06820803", "该房源已经是上架状态"),
    _20804("06820804", "该房源已经是下架状态"),
    _20805("06820805", "商户不存在"),
    _20806("06820806", "图片转换失败"),
    _20807("06820807", "合租房间号不能为空"),

    //----------------------------------------会营销模块 0682 0901 - 1000
    _20901("06820901", "申请签约失败，房源已下架"),
    _20902("06820902", "对方暂时无法接收订单，请拨打电话进行联系"),
    _20903("06820903", "新增订单失败，请联系管理员"),
    _20904("06820904", "新增订单失败，已存在相关订单"),
    _20905("06820905", "这是你自己的房子，不需要申请签约"),
    _20906("06820906", "取消订单失败"),
    _20907("06820907", "取消订单失败"),
    _20908("06820908", "确认订单失败"),
    _20909("06820909", "查询订单失败"),
    _20910("06820910", "该订单状态已发生变化，请刷新页面后重试"),
    _20911("06820911", "对方暂时没有开通在线签约，请拨打电话进行联系"),
    _20912("06820912", "会营销同步异常"),
    _20913("06820913", "未加入企业"),
    _20914("06820914", "管理员暂时无法申请订单"),
    _20915("06820915", "营销服务调用失败"),
    _20916("06820916", "企业已和您解绑，有问题请联系企业管理员！"),
    _20917("06820917", "请选择跟进人！"),


    //----------------------------------------出租合同 0682 1001 - 1100
    _21001("06821001", "保存合同失败"),
    _21002("06821002", "图片超限"),
    _21003("06821003", "出租合同不存在"),
    _21004("06821004", "确认合同失败"),
    _21005("06821005", "租客信息不存在"),
    _21006("06821006", "会找房公众号二维码生成失败"),

    _21070("06821070", "账单不存在"),

    //----------------------------------------全房通 0682 1101 - 1200
    _21101("06821101", "渠道不能为空"),
    _21102("06821102", "平台id不能为空"),
    _21103("06821103", "商户id不能为空"),
    _21104("06821104", "登录手机号不能为空"),
    _21105("06821105", "密码不能为空"),
    _21106("06821106", "管理员姓名不能为空"),
    _21107("06821107", "公司类型不能为空"),
    _21108("06821108", "企业注册名称不能为空"),
    _21109("06821109", "统一社会信用码不能为空"),
    _21110("06821110", "该商户已开过户"),
    _21111("06821111", "会营销开户失败"),
    _21112("06821112", "数据解密失败"),
    _21113("06821113", "管理员身份证号码不能为空"),
    _21114("06821114", "管理员姓名2-20个字符"),
    _21115("06821115", "密码长度为8 - 18个字符"),
    _21116("06821116", "身份证号限制18位"),
    _21117("06821117", "银行卡类型不能为空"),
    _21118("06821118", "开户支行不能为空"),

    //----------------------------------------客户模块 0682 1201 - 1300
    _21201("06821201", "客户不存在"),
    _21202("06821202", "客户跟进记录不存在"),
    _21203("06821203", "跟进记录只允许本人操作"),

    //--------------------------------------巴乐兔模块 0682 1300 - 1400
    _21300("06821300", "暂未绑定对应账号，请联系管理员配置"),
    _21301("06821301", "此公司没有开通巴乐兔分销"),
    _21302("06821302", "房源校验失败"),
    _21303("06821303", "获取发布记录失败"),
    _21304("06821304", "巴乐兔签名失败"),
    _21305("06821305", "参数检验失败"),
    _21306("06821306", "重试已打断"),
    _21307("06821307", "重试类型不一致"),
    _21308("06821308", "巴乐兔错误码06821308,表示需要重试的异常,异常信息以巴乐兔返回值为准"),
    _21309("06821309", "已经存在该巴乐兔公寓"),
    _21310("06821310", "房源信息不全，请补全信息后再发布"),
    _21311("06821311", "暂不支持同时绑定更多巴乐兔账号"),
    _21312("06821312", "巴乐兔返回结果为空"),

    //----------------------------------------业务模块 0682 1401 - 1400
    _21401("06821401", "业务不存在"),
    _21402("06821402", "不支持开通此业务"),
    _21403("06821403", "城市不存在"),
    _21404("06821404", "终端不支持开通此业务"),
    _21405("06821405", "城市不支持开通此业务"),
    _21406("06821406", "账户类型不存在"),
    _21407("06821407", "业务正在审核中，请耐心等待"),
    _21408("06821408", "业务已开通成功，请勿重复操作"),
    _21409("06821409", "请设置业务城市"),
    _21410("06821410", "账户未开通当前业务城市"),
    _21411("06821411", "全房通用户仅支持开通供给端"),
    _21412("06821412", "业务开通失败"),
    _21413("06821413", "不支持业务注销"),
    _21414("06821414", "请选择要开通业务的城市"),
    _21415("06821415", "已加入分销企业，不可以再开通个人分销业务"),
    _21416("06821416", "您已开通企业供给，不允许再开通企业分销"),
    _21417("06821417", "您已开通企业分销，不允许再开通企业供给"),

    //--------------------------------------房源举报模块 0682 1501 - 1550
    _21501("06821501", "字典项不存在"),
    _21502("06821502", "举报不存在"),
    _21503("06821503", "白名单不存在"),
    _21504("06821504", "白名单已存在，请勿重复添加"),

    //--------------------------------------拨打电话模块 0682 1551 - 1600
    _21551("06821551", "拨打电话记录不存在"),

    ;

    /**
     * 错误编码
     */
    private String errorCode;

    /**
     * 错误信息
     */
    private String errorMsg;

    ErrorCode(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public static String code(String name) {
        return ErrorCode.valueOf(name).errorCode;
    }

    public static String msg(String name) {
        return ErrorCode.valueOf(name).errorMsg;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}