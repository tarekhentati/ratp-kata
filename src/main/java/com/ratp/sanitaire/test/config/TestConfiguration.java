package com.ratp.sanitaire.test.config;

import com.ratp.sanitaire.test.service.RatpSanitaireRemoteService;
import feign.Feign;
import feign.Logger;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration {

    @Bean
    RatpSanitaireRemoteService ratpSanitaireRemoteService(@Value("${sanitaire.remote.endpointUrl}") String ratpSanitaireRemoteUrl) {

        return Feign.builder()
                .client(new OkHttpClient())
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .logger(new Slf4jLogger(RatpSanitaireRemoteService.class))
                .logLevel(Logger.Level.FULL)
                .target(RatpSanitaireRemoteService.class, ratpSanitaireRemoteUrl);
    }

}
