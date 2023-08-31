# Double Hashing Hash Table

This repository contains an implementation of a hash table using double hashing for collision resolution. It provides a flexible and efficient data structure for storing and managing key-value pairs. The implementation includes several key components:

## Interfaces

### `Dictionary`

The `Dictionary` interface serves as the foundation for dynamic sets that support insert, delete, and search operations for hashable objects. It defines the following methods:

- `isEmpty()`: Checks whether the dictionary is empty.
- `insert(V value)`: Adds a value to the dictionary.
- `delete(V value)`: Removes a value from the dictionary.
- `find(V value)`: Searches for a value in the dictionary and returns its index or -1 if not found.

### `OpenAddressTable`

The `OpenAddressTable` interface extends the `Dictionary` interface and introduces the `hash` method, which is essential for open addressing in hash tables. It allows classes to define their own collision resolution strategy by specifying how to calculate the next index to probe. This interface enables flexibility when dealing with hash collisions.

### `Hashable`

The `Hashable` interface defines the basic structure for data types that can be hashed. It requires implementing a `key()` method that converts an instance of the data type into a non-negative integer. This interface ensures that objects of different types can be hashed consistently.

## Classes

### `DoubleHashTable`

The `DoubleHashTable` class is the core implementation of the double hashing hash table. It uses double hashing to efficiently resolve collisions and manage a dynamic set of hashable objects. Key functionality includes:

- **Insertion**: The `insert(V value)` method allows you to add a value to the hash table while handling collisions with double hashing. If the table is full or an infinite loop is detected, an error message is displayed.
- **Deletion**: The `delete(V value)` method removes a value from the hash table if it exists. Deleted slots are marked to maintain data integrity.
- **Search**: The `find(V value)` method searches for a value in the hash table, returning its index or -1 if not found.
- **Custom Hash Functions**: The class supports custom hash functions by accepting two functions (`h1` and `h2`) during initialization. This flexibility allows users to tailor the hashing process to their specific needs.
- **Open Addressing**: Double hashing is used for open addressing, ensuring efficient collision resolution and minimal clustering.
- **Dynamic Sizing**: The hash table can dynamically resize itself to accommodate more elements as needed.
- **String Representation**: The `toString()` method generates a string representation of the hash table, displaying indices, keys, and values.

### `HashableString`

The `HashableString` class is an example of a data type that implements the `Hashable` interface. It converts strings into hashable objects using a simple hash function based on character values. This class demonstrates how to create hashable data types compatible with the `DoubleHashTable` implementation.

## Usage

The provided classes and interfaces enable you to create and manipulate hash tables efficiently. You can use the `DoubleHashTable` class to store and manage hashable objects while benefiting from double hashing for collision resolution. The flexible design allows customization of hash functions and smooth handling of dynamic sets of data.

Feel free to adapt and extend this implementation to suit your specific requirements, whether it's for optimizing data retrieval, managing key-value pairs, or solving various computational problems efficiently. Enjoy exploring the functionality and performance of this double hashing hash table!
