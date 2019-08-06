package com.ryzlz.microcredit.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {

    private int code;
    private String msg;

    public Result setSuccess() {
        return setResult(Result.Success);
    }

    public Result setResult(int code, String msg) {
        setCode(code);
        setMsg(msg);
        return this;
    }

    public Result setResult(Result result) {
        return null == result ?
                setResult(Result.Empty_Result) :
                setResult(result.getCode(), result.getMsg());
    }

    public Result setResult(Result result, String msg) {
        return setResult(result.getCode(), result.getMsg() + ":" + msg);
    }

    public Result setResult(Exception ex) {
        return setResult(Unhandled_Exception, ex.getMessage());
    }

    public Result setResult(int code, Result otherResult) {
        return setResult(code,otherResult.getMsg());
    }

    public Result setResult(Result result, Result defaultResult) {
        if (null != result)
            setResult(result);
        else
            setResult(defaultResult);
        return this;
    }

    public Result setResult(String msg, Result otherResult) {
        setResult(otherResult);
        setMsg(msg + "-" + getMsg());
        return this;
    }

    public Result setResult(Result errorResult, Exception e) {
        return setResult(errorResult, errorResult.getMsg() + ":" + e.getMessage());
    }

    public boolean success() {
        return Success.getCode() == getCode();
    }

    public static boolean success(Result result) {
        return null != result && result.success();
    }

    public static final Result Success = new Result(0, "成功");
    public static final Result Unknown_Error = new Result(1, "未知错误");
    public static final Result Invalid_Token = new Result(101, "无效的授权Token");
    public static final Result Login_Error = new Result(102, "用户不存在或密码错误");
    public static final Result Invalid_Argument = new Result(103, "没有正确的传递参数");
    public static final Result Api_Not_Support = new Result(104, "接口尚未支持，敬请期待");
    public static final Result Unhandled_Exception = new Result(105, "未处理的系统异常");
    public static final Result Empty_Result = new Result(106, "未预期的得到了空结果集");
    public static final Result Activated_Error = new Result(107, "用户未激活，没有登陆权限");
    public static final Result No_Affected_Row = new Result(501, "没有受影响的数据或目标记录不存在");
    public static final Result Http_Response_Error = new Result(601, "发生HTTP请求错误");

}
