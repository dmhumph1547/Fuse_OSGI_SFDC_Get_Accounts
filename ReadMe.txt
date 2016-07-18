This project has been created to just demo JBoss Fuse Integration with Salesforce.com.

This demo was tested using JBoss Fuse 6.2.1 karaf container.

Before building this project you need to update the salesforceconfig.properties file found in /src/main/resources/ with you SFDC login information.

This project will sign into SFDC then submit a query to get a list off all Accounts.  The list of Accounts received back from SFDC will be stored in a file under target/sfdc_out.txt
