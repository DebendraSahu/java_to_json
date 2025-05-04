### 📦 Java to JSON Converter (Using Jackson)

This is a lightweight Java module that allows you to convert Java objects to JSON and vice versa using the [Jackson](https://github.com/FasterXML/jackson) library. It includes support for reading/writing JSON from strings and files, and even lists of objects.

---

### ✅ Features

- Convert Java objects to JSON strings
- Convert JSON strings to Java objects
- Read/write JSON to and from files
- Convert lists of objects to/from JSON
- Clean, reusable utility class (`JsonUtil`)

---

### 🛠 Requirements

- Java 17+
- Maven 3+
- No third-party frameworks apart from Jackson (which is open-source and customizable)

---

### 📁 Project Structure

```
java_to_json/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── debend/
│                   ├── App.java         # Entry point
│                   ├── Person.java      # Sample model class
│                   └── JsonUtil.java    # JSON utility class
├── pom.xml
└── README.md
```

---

### 🚀 Run the Project

```bash
# Compile the project
mvn compile

# Run the application
mvn exec:java
```

---

### 📄 Sample Output

```
Single Person to JSON: {"name":"Alice","age":28}
Back to Object: Person{name='Alice', age=28}
From JSON file: Person{name='Alice', age=28}
List to JSON: [{"name":"Bob","age":22},{"name":"Carol","age":33}]
List from JSON: [Person{name='Bob', age=22}, Person{name='Carol', age=33}]
```

---

### ✍️ Customize

- Modify `Person.java` to use your own model
- Add more utility methods to `JsonUtil` if needed
- Replace Jackson with your own parser if needed for licensing/customization
