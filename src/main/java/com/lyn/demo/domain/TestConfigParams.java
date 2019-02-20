package com.lyn.demo.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@Data
public class TestConfigParams {
    @Value("${com.next.name}")
    String title;
    @Value("${com.next.name}")
    String name;
}
