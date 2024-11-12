package br.com.mariana.tarefas.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")  // Permitindo todos os endpoints
                .allowedOrigins("https://tarefas1-1ruk9xyn.b4a.run") // Substitua pelo domínio do seu frontend
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Métodos permitidos
                .allowedHeaders("*")  // Permitindo todos os headers
                .allowCredentials(true); // Se você precisar enviar cookies ou cabeçalhos de autenticação
    }
}
