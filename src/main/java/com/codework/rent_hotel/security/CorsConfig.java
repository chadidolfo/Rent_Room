package com.codework.rent_hotel.security;

import org.apache.catalina.filters.CorsFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;
@Configuration
@EnableWebMvc
public class CorsConfig implements WebMvcConfigurer {


//    public class RestConfig {
//        @Bean
//        public CorsFilter corsFilter() {
//            UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//            CorsConfiguration config = new CorsConfiguration();
//            config.setAllowCredentials(true);
//            config.addAllowedOrigin("*");
//            config.addAllowedHeader("*");
//            config.addAllowedMethod("POST");
//            config.addAllowedMethod("GET");
//            config.addAllowedMethod("DELETE");
//            config.addAllowedMethod("PUT");
//            source.registerCorsConfiguration("/**", config);
//            return new CorsFilter(source);
//        }
//    }
//}

//    private static final Long MAX_AGE = 3600L;
//    private static final int CORS_FILTER_ORDER = -102;

//    @Bean
//    public FilterRegistrationBean corsFilter() {
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        CorsConfiguration config = new CorsConfiguration();
//        config.setAllowCredentials(true);
//        config.addAllowedOrigin("*");
//        config.setAllowedHeaders(Arrays.asList(
//                HttpHeaders.AUTHORIZATION,
//                HttpHeaders.CONTENT_TYPE,
//                HttpHeaders.ACCEPT));
//        config.setAllowedMethods(Arrays.asList(
//                HttpMethod.GET.name(),
//                HttpMethod.POST.name(),
//                HttpMethod.PUT.name(),
//                HttpMethod.DELETE.name()));
//        config.setMaxAge(MAX_AGE);
//        source.registerCorsConfiguration("/**", config);
//        FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter());
//        bean.setOrder(CORS_FILTER_ORDER);
//        return bean;
//    }
//}
@Override
public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/**")
            .allowedOrigins("http://localhost:5173") // Allow requests from this origin
            .allowedMethods("GET", "POST", "PUT", "DELETE") // Allow these HTTP methods
            .allowedHeaders("*"); // Allow all headers

}
}