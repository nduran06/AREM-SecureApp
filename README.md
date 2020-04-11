# AREM-SecureApp

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

![](https://github.com/nduran06/AREM-SecureApp/blob/master/images/8.png)

- Usuario no autorizado

![](https://github.com/nduran06/AREM-SecureApp/blob/master/images/1.png)

![](https://github.com/nduran06/AREM-SecureApp/blob/master/images/2.png)


- Usuario autorizado

![](https://github.com/nduran06/AREM-SecureApp/blob/master/images/3.png)

![](https://github.com/nduran06/AREM-SecureApp/blob/master/images/4.png)

![](https://github.com/nduran06/AREM-SecureApp/blob/master/images/5.png)

![](https://github.com/nduran06/AREM-SecureApp/blob/master/images/6.png)





