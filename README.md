# Hospital Patient Management System Simulation

This project is a simple hospital patient management system simulation developed in **Java**.  
It demonstrates the practical usage of fundamental **data structures** and **object-oriented programming** concepts in a realistic scenario.

---

## 📌 Project Overview

The system simulates basic hospital operations such as:
- Managing patient records
- Handling treatment requests with priority support
- Processing treatments in correct order
- Keeping discharge history
- Sorting patients by severity level

The main purpose of this project is **educational**, focusing on data structures implementation rather than UI or databases.

---

## 🧱 Data Structures Used

- **Linked List**  
  Used to store patient records (`PatientList`).

- **Queue (FIFO)**  
  Used for treatment requests:
  - Priority Treatment Queue
  - Normal Treatment Queue

- **Stack (LIFO)**  
  Used to store discharged patient records.

- **HashMap**  
  Provides fast access to patient data using patient ID.

- **Heap Sort**  
  Used to sort patients based on severity level.

---

## 🧩 Class Descriptions

### `Patient`
Stores patient information such as ID, name, age, and severity.

### `PatientList`
Manages patients using a linked list and includes Heap Sort logic to sort patients by severity.

### `TreatmentRequest`
Represents a treatment request.  
Constructor overloading is used to support both normal and priority requests.

### `TreatmentQueue`
Implements queue operations for handling treatment order.

### `DischargeStack`
Stores discharge records using stack logic.

### `HospitalSystem`
Main controller class that coordinates all system components.

### `TestHospitalSystem`
Used to test and demonstrate all system functionalities.

---

## ⚙️ Features

- Add patients to the system
- Create normal or priority treatment requests
- Process treatments with priority handling
- Record discharged patients
- Sort patients by severity using Heap Sort
- Display the current system state

---

## ▶️ How to Run

1. Clone the repository to your local machine.
2. Open the project in an IDE (IntelliJ IDEA is recommended).
3. Compile and run the `TestHospitalSystem` class.

---

## 📚 Notes

- This project is created for educational purposes.
- No external libraries or frameworks are used.
- All data structures are implemented manually.
