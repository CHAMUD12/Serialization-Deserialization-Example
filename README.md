# Serialization-Deserialization-Example

## Introduction

Serialization is a process of flattening an object's state into a byte stream. This, in turn, enables the state of the object to be saved in a file or sent across a network to be stored in a database, for example. On its part, deserialization does the exact opposite: It changes the byte stream back into a copy of the original object.

![Introduction img](./src/main/resources/img/serialize-deserialize-java.png)

## Benefits of Serialization

- It is platform-independent.
- Easy to customize and understand.
- It helps save or preserve a state of an object.
- Allows encryption and safe computing in Java.
- Enables time-efficient and optimized transfer of objects between two platforms.
- Allows cloning of objects, so you can replicate them., i.e., creating their replicas.

## Benefits of Deserialization

- It is easy to customize deserialization.
- It helps reconstruct objects from the byte stream instead of actually creating objects from classes, which is comparatively time-consuming.
- It is a built-in feature in Java, so there is no need for a third-party tool.

## Mechanism of Serialization and Deserialization

### Serialization

- Marking Objects - A class must implement the ‘Serializable’ interface to indicate that its objects can be serialized.
- ObjectOutputStream - The ‘ObjectOutputStream’ class is used to write the object's state to a byte stream.
- Writing Objects - The ‘writeObject()’ method of ‘ObjectOutputStream’ serializes the object.

### Deserialization

- ObjectInputStream - The ‘ObjectInputStream’ class is used to read the byte stream and reconstruct the object.
- Reading Objects - The ‘readObject()’ method of ‘ObjectInputStream’ deserializes the byte stream into an object.

| Serialization | Deserialization |
|:-------------|:--------------:|
| It is the process of converting an object to a stream of bytes.       | It is a process to convert the stream of objects to its original state.       |
| It is used to write a byte stream to a file, db, etc.       | It helps to read a byte stream from file, db, etc.       |
| It occurs with the help of the ObjectOutputStream Class.       | It occurs with the help of the ObjectInputStream class.       |

## Hypothetical Scenario

The Employee Management System (EMS) maintains employee information. This information shall be expected to handle the fast storage and retrieval of data for backup and to transfer servers. To handle the data corruption and text file handling, the concept of serialization is adopted for maintaining the `EmployeeServlet` class, which maintains the implementation of HTTP requests. It allows for the serialization and deserialization of the employee data to store and retrieve the same reliably.




