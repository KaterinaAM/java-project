@ControllerAdvice
public class ErrorController {
    @ExceptionHandler(NoHandlerFoundException.class)
    public String handle404() {
        return "error/404";
    }

    @ExceptionHandler(Exception.class)
    public String handle500() {
        return "error/500";
    }
}
