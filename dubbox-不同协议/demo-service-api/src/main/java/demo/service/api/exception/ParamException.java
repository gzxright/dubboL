package demo.service.api.exception;

import demo.service.api.consts.ServiceConst;

/**
 * Created by yangjunming on 2/24/16.
 * author: yangjunming@huijiame.com
 */
public class ParamException extends ServiceException {


    public ParamException(String errMsg) {
        super(errMsg);
        setErrCode(ServiceConst.ErrorCode.PARAM_ERROR);
    }

    public ParamException(String errCode, String errMsg) {
        super(errCode, errMsg);
    }
}
