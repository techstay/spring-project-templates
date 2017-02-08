package yitian.learn.utils;


import org.springframework.core.convert.converter.Converter;

import java.time.LocalDate;

public class String2LocalDateConverter implements Converter<String, LocalDate> {

    @Override
    public LocalDate convert(String source) {
        return LocalDate.parse(source);
    }
}
