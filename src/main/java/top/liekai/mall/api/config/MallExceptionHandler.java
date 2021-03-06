package top.liekai.mall.api.config;

import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import top.liekai.mall.api.common.MallException;
import top.liekai.mall.api.common.ServiceResultEnum;
import top.liekai.mall.api.util.Result;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

/**
 * @author admin
 * @date 2021/4/21
 * @description 全局处理异常
 */
@RestControllerAdvice
public class MallExceptionHandler {
    @ExceptionHandler(BindException.class)
    public Object bindException(BindException e) {
        Result result = new Result();
        result.setResultCode(510);
        BindingResult bindingResult = e.getBindingResult();
        result.setMessage(Objects.requireNonNull(bindingResult.getFieldError()).getDefaultMessage());
        return result;
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Object bindException(MethodArgumentNotValidException e) {
        Result result = new Result();
        result.setResultCode(510);
        BindingResult bindingResult = e.getBindingResult();
        result.setMessage(Objects.requireNonNull(bindingResult.getFieldError()).getDefaultMessage());
        return result;
    }

    @ExceptionHandler(Exception.class)
    public Object handleException(Exception e, HttpServletRequest req) {
        Result result = new Result();
        result.setResultCode(500);
        //区分是否为自定义异常
        if (e instanceof MallException) {
            result.setMessage(e.getMessage());
            if
            (e.getMessage().equals(ServiceResultEnum.NOT_LOGIN_ERROR.getResult())
                    || e.getMessage().equals(ServiceResultEnum.TOKEN_EXPIRE_ERROR.getResult()
            )) {                result.setResultCode(416);
            }
        } else {
            e.printStackTrace();
            result.setMessage("未知异常，请联系管理员");
        }
        return result;
    }
}