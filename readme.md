**Rest API using SpringBoot : Integrating MySQl and JPA**

`Support both MySQL and Postgre SQL`

1 POM.xml contain dependencies, including support for both Postgre and MySql

2 Repository class contain JPA query, custom query is defined to get the result for `String` param

3 `'Tray'` is entity class which contain all field as present in our DB,a nd getter and setter is created for all fields

4 **`Controller`** class contain the api endpoint and is linked to Repository through `@Autowired` annotation

5 Main class is used to run the spring application 

6 _Sample API and Response_:
  API: http://localhost:8080/trays/DevokDev
  Response:
  
 ` [
      {
          "id": 2,
          "show": "DevokDev",
          "uri": "hotstar.co",
          "trayName": "best hindi",
          "imgsourceource": "s3.aws.com/dev"
      },
      {
          "id": 1,
          "show": "DevokDev",
          "uri": "hotstar.co",
          "trayName": "popular shows",
          "imgsourceource": "s3.aws.com/dev"
      }
  ]  `
  

    
