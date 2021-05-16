FROM jboss/wildfly
#ADD module.xml /opt/jboss/wildfly/standalone/configuration/
ADD derbyclient.jar /opt/jboss/wildfly/standalone/deployments/
ADD standalone.xml /opt/jboss/wildfly/standalone/configuration/
COPY EmployeeManagementServerApplication-1.0-SNAPSHOT-war.war /opt/jboss/wildfly/standalone/deployments/
COPY EmployeeManagementServerApplication-1.0-SNAPSHOT-jar.jar /opt/jboss/wildfly/standalone/deployments/
RUN /opt/jboss/wildfly/bin/add-user.sh admin admin
#war-filen läggs till autoamtiskt av intelliJ på något sätt, behövs inte ADD

#ADD EmployeeManagementServerApplication-1.0-SNAPSHOT.war /opt/jboss/wildfly/standalone/deployments/

