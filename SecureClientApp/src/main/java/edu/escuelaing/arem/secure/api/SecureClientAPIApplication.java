package edu.escuelaing.arem.secure.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.io.InputStream;
import java.security.KeyStore;

import org.apache.http.client.HttpClient;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContextBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@ComponentScan(basePackages = { "edu.escuelaing.arem.secure" })
public class SecureClientAPIApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecureClientAPIApplication.class, args);
	}

}
