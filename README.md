# AREM-SecureApp

En este laboratorio se desarrolló una aplicación en la que se asegura la autenticación del usuario, la integridad de sus datos y la autorizaciónque tiene para acceder a ciertos recursos mediante el uso de tokens. Del mismo modo se utilizan certificados SSL para permitir el acceso y comunicación segura desde el browser hacias los servicios.

En este [archivo](AREM_Security.pdf) se encuentra la descripción del prototipo.

## Prerequisitos

[Java 8](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html)

[Maven](https://maven.apache.org/install.html)

- Si se desea probar el funcionamiento en servidores AWS:

[AWS](https://signin.aws.amazon.com/signin?redirect_uri=https%3A%2F%2Faws.amazon.com%2Fmarketplace%2Fmanagement%2Fsignin%3Fstate%3DhashArgs%2523%26isauthcode%3Dtrue&client_id=arn%3Aaws%3Aiam%3A%3A015428540659%3Auser%2Faws-mp-seller-management-portal&forceMobileApp=0)

[AWS Educate](https://www.awseducate.com/signin/SiteLogin)

## Ejecución de la aplicación

Para cada aplicación [SecureClientApp](https://github.com/nduran06/AREM-SecureApp/tree/master/SecureClientApp) y [SecureServices](https://github.com/nduran06/AREM-SecureApp/tree/master/SecureServices) ejecutar en la raíz del proyecto:

```markdown
$ mvn package
```
```markdown
$ mvn spring-boot:run
```

- La aplicación [SecureClientApp](https://github.com/nduran06/AREM-SecureApp/tree/master/SecureClientApp) corre por el puerto 8080 y [SecureServices](https://github.com/nduran06/AREM-SecureApp/tree/master/SecureServices) por el puerto 14790, sin embargo ambos puertos pueden ser cambiados modificando el valor de ``` server.port ``` en el application.properties respectivo.

## Autentificación con certificado SSL

### Generar llaves

```markdown
$ keytool -genkeypair -alias keystore -keyalg RSA -keysize 2048 -storetype JKS -validity 3650 -keystore keystore.jks -ext SAN=dns:localhost,ip:127.0.0.1
```

```markdown
$ keytool -genkeypair -alias keystore_ms -keyalg RSA -keysize 2048 -storetype JKS -validity 3650 -keystore keystore_ms.jks -ext SAN=dns:localhost,ip:127.0.0.1
```

### Exportar llaves

```markdown
$ keytool -export -alias keystore -file keystore.cer -keystore keystore.jks
```

```markdown
$ keytool -export -alias keystore_ms -file keystore_ms.cer -keystore  keystore_ms.jks
```

### Importar llaves

```markdown
keytool -import -alias keystore -file keystore.cer -keystore keystore_ms.jks
```

```markdown
keytool -import -alias keystore_ms -file keystore_ms.cer -keystore keystore.jks
```

### Generar llaves p12

```markdown
$ keytool -importkeystore -srckeystore keystore_ms.jks -destkeystore  keystore_ms.p12 -srcstoretype JKS -deststoretype PKCS12 -srcstorepass password -deststorepass password -srcalias keystore_ms -srckeypass password -destkeypass password -noprompt
```

```markdown
$ keytool -importkeystore -srckeystore keystore.jks -destkeystore  keystore.p12 -srcstoretype JKS -deststoretype PKCS12 -srcstorepass password -deststorepass password -srcalias keystore -srckeypass password -destkeypass password -noprompt
```

## Pruebas de Funcionamiento

- Base de datos

![](https://github.com/nduran06/AREM-SecureApp/blob/master/images/7.png)

- Usuario no autorizado

![](https://github.com/nduran06/AREM-SecureApp/blob/master/images/1.png)

![](https://github.com/nduran06/AREM-SecureApp/blob/master/images/2.png)


- Usuario autorizado

![](https://github.com/nduran06/AREM-SecureApp/blob/master/images/3.png)

![](https://github.com/nduran06/AREM-SecureApp/blob/master/images/4.png)

![](https://github.com/nduran06/AREM-SecureApp/blob/master/images/5.png)

![](https://github.com/nduran06/AREM-SecureApp/blob/master/images/6.png)


## Herramientas

*   [`Maven`](https://maven.apache.org/) - Dependency Management
*   [`Spring`](https://spring.io/) - Framework

## Javadoc

To generate javadoc, you can run:

```markdown
$ mvn javadoc:javadoc
$ mvn javadoc:jar
$ mvn javadoc:aggregate
$ mvn javadoc:aggregate-jar
$ mvn javadoc:test-javadoc
$ mvn javadoc:test-jar
$ mvn javadoc:test-aggregate
$ mvn javadoc:test-aggregate-jar
```
You can go to /tarjet/site to see the documentation 

## Authors

```markdown
Natalia Durán Vivas
```

## Referencias

```markdown
- https://blog.softtek.com/es/autenticando-apis-con-spring-y-jwt
- https://medium.com/@niral22/2-way-ssl-with-spring-boot-microservices-2c97c974e83
```

## License

This project is licensed under the GNU License - see the [LICENSE.md](LICENSE) file for details

