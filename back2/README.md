#  Lombard API

##  Funkcjonalności

 **Pobieranie klientów**  
 **Wyszukiwanie klientów** (po ID i nazwie)  
 **Lista "Do Not Serve"**  
 **Dodawanie klientów**  
 **Aktualizacja danych**  
 **Usuwanie klientów**  
 **Oznaczanie "Do Not Serve"**  
 **Ping API** (test połączenia)


###  Konfiguracja bazy danych

Edytuj `application.properties`:

```
spring.datasource.url=jdbc:postgresql://localhost:5432/lombard
spring.datasource.username=your_user
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```


##  API – Przykłady użycia

 **Pobranie listy klientów**
```sh
curl -X GET http://localhost:8080/api/customers
```

 **Dodanie nowego klienta**
```sh
curl -X POST http://localhost:8080/api/customers -H "Content-Type: application/json" -d '{
  "firstName": "Jan",
  "lastName": "Kowalski",
  "idType": "PASSPORT",
  "idNumber": "ABC123456",
  "doNotServe": false
}'
```

 **Usunięcie klienta**
```sh
curl -X DELETE http://localhost:8080/api/customers/1
```

---

