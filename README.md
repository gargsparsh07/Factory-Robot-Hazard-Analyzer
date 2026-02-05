# Factory Robot Hazard Analyzer System

## 📖 Overview
This is a console-based Java application that evaluates the hazard risk score of a factory robot.
The evaluation is based on:
- Arm Precision
- Worker Density
- Machinery State

The application validates all inputs, calculates a hazard risk score, and handles invalid
scenarios using a custom exception.

---

## 🛠️ Technologies Used
- Java
- IntelliJ IDEA
- Git & GitFlow
- GitHub

---

## ⚙️ Hazard Risk Calculation Logic

Risk Score is calculated using the formula:

Risk Score =
(100 − Arm Precision)
+ (Worker Density × 10)
+ (20 if Machinery State is ON)

---

## 🚀 Features
- Input validation
- Hazard risk score calculation
- Custom exception handling
- Risk level classification (SAFE / HIGH RISK)
- GitFlow-based development

---

## 🧪 Sample Output

Hazard Risk Score: 90
Status: SAFE


---

## 🌿 Git Workflow
- `main` branch contains documentation only
- `develop` branch contains complete source code
- Feature branches used for each use case

---

## 👨‍💻 Author
Sparsh
