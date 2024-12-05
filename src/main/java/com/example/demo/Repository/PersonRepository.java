package com.example.demo.Repository;

import com.example.demo.Models.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

// Repository-Interface für MongoDB
@Repository // Optional, da MongoRepository automatisch erkannt wird
public interface PersonRepository extends MongoRepository<Person, String> {
    // Benutzerdefinierte Methoden können hier definiert werden
}
