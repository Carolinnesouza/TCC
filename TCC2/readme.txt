connect

module add --name=org.postgres --resources=C:\Users\Aluno\.m2\repository\org\postgresql\postgresql\9.4.1212\postgresql-9.4.1212.jar --dependencies=javax.api,javax.transaction.api

/subsystem=datasources/jdbc-driver=postgres:add(driver-name="postgres", driver-module-name="org.postgres", driver-class-name="org.postgresql.Driver")

/subsystem=datasources/data-source=PostgreSQLPool:add(driver-name="postgres", jndi-name="java:/TCC2DS", connection-url="jdbc:postgresql://localhost:5432/tcc2", user-name="postgres", password="pg1234")

/subsystem=security/security-domain=TCC2JdbcRealm/:add(cache-type=default)

/subsystem=security/security-domain=TCC2JdbcRealm/authentication=classic:add(login-modules=[{code=Database, flag=Required, module-options={ dsJndiName="java:/TCC2DS", principalsQuery="select password from usuario where username = ?", rolesQuery="select grupo, 'Roles' from usuario where username = ?", hashAlgorithm="SHA-256", hashEncoding="base64" }}])

reload

quit