package mr.demonid.spring.hw4.services;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * Конвертер строки в LocalDate.
 * Поддерживает все возможные форматы.
 */
@Component
public class StringToLocalDateConverter implements Converter<String, LocalDate> {

    @Override
    public LocalDate convert(String source) {
        if (source == null || source.isEmpty()) {
            return null;
        }

        /*
            пробуем несколько форматов
         */
        DateTimeFormatter[] formatters = {
                DateTimeFormatter.ofPattern("yyyy-MM-dd"),
                DateTimeFormatter.ofPattern("dd-MM-yyyy"),
                DateTimeFormatter.ofPattern("dd/MM/yyyy"),
                DateTimeFormatter.ofPattern("dd.MM.yyyy")
        };

        for (DateTimeFormatter formatter : formatters) {
            try {
                return LocalDate.parse(source, formatter);
            } catch (DateTimeParseException ignored) {
            }
        }

        // ни один формат не подошел, выбрасываем ошибку
        throw new IllegalArgumentException("Неверный формат даты: " + source);
    }
}
