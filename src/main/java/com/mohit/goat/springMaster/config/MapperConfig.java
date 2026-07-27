package com.mohit.goat.springMaster.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {
    // configuration can also be done by annotation
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
