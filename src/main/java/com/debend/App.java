package com.debend;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        try {
            // Single object
            Person p1 = new Person("Alice", 28);
            String json = JsonUtil.toJson(p1);
            System.out.println("Single Person to JSON: " + json);

            Person fromJson = JsonUtil.fromJson(json, Person.class);
            System.out.println("Back to Object: " + fromJson);

            // Write to and read from file
            File file = new File("person.json");
            JsonUtil.toJsonFile(p1, file);
            Person filePerson = JsonUtil.fromJsonFile(file, Person.class);
            System.out.println("From JSON file: " + filePerson);

            // List of people
            List<Person> people = Arrays.asList(
                    new Person("Bob", 22),
                    new Person("Carol", 33));

            String listJson = JsonUtil.listToJson(people);
            System.out.println("List to JSON: " + listJson);

            List<Person> peopleFromJson = JsonUtil.fromJsonToList(listJson, Person.class);
            System.out.println("List from JSON: " + peopleFromJson);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
