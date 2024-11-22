package mr.demonid.spring.hw4.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Глобальный обработчик исключений. Перенаправляет их на страницу "/error".
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public String handleException(Exception e, Model model) {
        System.out.println("Error: " + e.getMessage());
        model.addAttribute("errormsg", e.getMessage());
        return "error";
    }

}