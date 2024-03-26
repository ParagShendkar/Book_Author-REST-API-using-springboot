package com.example.books_author.config;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import java.text.SimpleDateFormat;

@Configuration
public class JacksonConfig {

    @Bean
    public ObjectMapper objectMapper(Jackson2ObjectMapperBuilder builder) {
        ObjectMapper objectMapper = builder.createXmlMapper(false).build();

        // Register custom date serializer
        SimpleModule module = new SimpleModule();
        module.addSerializer(java.util.Date.class, new CustomDateSerializer());
        objectMapper.registerModule(module);

        // Configure to not write dates as timestamps
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);

        return objectMapper;
    }

    public class CustomDateSerializer extends ToStringSerializer {

        public CustomDateSerializer() {
            super(java.util.Date.class);
        }

        @Override
        public void serialize(Object value, com.fasterxml.jackson.core.JsonGenerator gen, com.fasterxml.jackson.databind.SerializerProvider provider) throws java.io.IOException {
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
            String formattedDate = formatter.format((java.util.Date) value);
            gen.writeString(formattedDate);
        }
    }
}

