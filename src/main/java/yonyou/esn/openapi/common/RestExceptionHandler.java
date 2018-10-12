package yonyou.esn.openapi.common;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * ExceptionHandler 和 ControllerAdvice 注解搭配，可以用于捕获所有controller中抛出的异常
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
@RestController
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    /**
     * 默认异常处理器
     *
     * @param request 请求
     * @param e       异常
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    public Response defaultErrorHandler(HttpServletRequest request, Exception e) {
        Response  response = new Response();
        response.setFlag(false);
        response.setErrorMsg(e.getMessage());
        return response;
    }


}
