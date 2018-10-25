### Structure:
- `config-server` as configuration server (spring-cloud-config)
- `discovery-service` as service discovery server (Netflix Eureka)
- `organization-service` to demonstrate pulling config value from config-server
- `report-service` to demonstrate calling organization-service


Refresh configuration changes: <br />
`curl -X POST http://127.0.0.1:50648/actuator/refresh`


Eureka's dashboard:  <br />
`http://localhost:8761/`

Config repository: <br />
`https://github.com/pezhman32/spring-cloud-demo-config`
