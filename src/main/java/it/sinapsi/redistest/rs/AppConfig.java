package it.sinapsi.redistest.rs;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

    @Configuration
    class AppConfig {

        @Bean
        public JedisConnectionFactory redisConnectionFactory() {
            return new JedisConnectionFactory();
        }
    }