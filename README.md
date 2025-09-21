# Java Streams API – Practice Problems

Welcome! 👋  
This repository contains my practice exercises on **Java Streams API** — showcasing how I write clean, functional, and modern Java code.  
I created and solved **7 problems** using Lists of Strings to explore key Stream operations.

---

## 🚀 About This Repository

- **Language:** Java  
- **Focus:** Java Streams API (introduced in Java 8)  
- **Goal:** Practice functional-style programming with real examples  

---

## 📝 Topics Covered

- `filter()` – Filter elements based on conditions  
- `map()` – Transform elements  
- `sorted()` – Sort streams   
- Chaining multiple operations  
- Writing cleaner, concise code compared to traditional loops  

---

## ⚡ Sample Code

```java
import java.util.Arrays;
import java.util.List;

public class StreamsExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("alpha", "beta", "gamma", "delta");

        List<String> result = words.stream()
                                   .filter(w -> w.length() > 4)
                                   .map(String::toUpperCase)
                                   .toList();

        System.out.println(result); // [ALPHA, GAMMA, DELTA]
    }
}
