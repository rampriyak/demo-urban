GitHub
======
Author - Ram Namachivayam

This is a demo project for DNS related REST API services.

Few services have been implemented.

After the build, if you face any issue with Unit test failure, skip the test while doing "maven-build".

Also, please use the following curl commands to test the API.

curl -k -H "content-type: application/json" -X GET "http://localhost:8080/urban/domain/v1/domains"
curl -k -H "content-type: application/json" -X GET "http://localhost:8080/urban/domain/v1/dns"
curl -k -H "content-type: application/json" -X POST -d "{\"domainName\":\"www.ram1.com\"}" http://localhost:8080/urban/domain/v1/domains --verbose
curl -k -H "content-type: application/json" -X GET "http://localhost:8080/urban/zone/v1/zone"

For any help, please reach out to me at krampriyak@gmail.com.
