package mr.demonid.spring.hw4.config;

import lombok.AllArgsConstructor;
import mr.demonid.spring.hw4.services.StringToLocalDateConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Регистрируем конвертер даты в Spring
 */
@Configuration
@AllArgsConstructor
public class WebConfig implements WebMvcConfigurer {

    private final StringToLocalDateConverter stringToLocalDateConverter;

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(stringToLocalDateConverter);
    }
}
