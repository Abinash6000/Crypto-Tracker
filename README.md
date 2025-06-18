# 💹 Crypto Tracker

Crypto Tracker is a simple yet modern Android application built using **Jetpack Compose** that lets users track real-time cryptocurrency data. It fetches market data using the [CoinCap Pro API](https://pro.coincap.io/api-docs) and visualizes key metrics like price, market cap, and performance charts.

---

## 🛠️ Tech Stack

| Tool/Library         | Purpose                             |
|----------------------|-------------------------------------|
| **Jetpack Compose**  | Modern UI toolkit                   |
| **Ktor**             | Network requests & API handling     |
| **Koin**             | Dependency injection                |
| **Material 3**       | Adaptive navigation & theming       |
| **Multi-module architecture** | Feature separation & code organization |

---

## 📦 Architecture

This app follows a **Multi-Module Architecture**, separating concerns across:
- `app` – Main entry point
- `core` – Base networking & common UI logic
- `feature:coinlist` – Displays list of crypto coins
- `feature:coindetail` – Handles detailed view and chart rendering

---

## 📸 Screenshots

| List Screen (Phone) | Detail Screen (Phone) |
|---------------------|------------------------|
| <img src="https://github.com/user-attachments/assets/15d9f237-f740-4b87-9ee8-7eaba7d9ada8" alt="List Screen Phone" width="300"/> | <img src="https://github.com/user-attachments/assets/98ef3246-fefa-4d3a-9d03-4ade8a8a6e59" alt="Detail Screen Phone" width="300"/> |

<br/>

| List Screen (Tablet) | Detail Screen (Tablet) |
|----------------------|-------------------------|
| <img src="https://github.com/user-attachments/assets/cfef4f9c-4708-4bc5-aaff-025a684a3c16" alt="List Screen Tablet" width="600"/> | <img src="https://github.com/user-attachments/assets/b1d08a99-24ce-414b-a6a5-141f92dea6c0" alt="Detail Screen Tablet" width="600"/> |

---

## 📚 What I Learned

- 🧭 Working with REST APIs using **Ktor**
- 🧩 Setting up **Multi-Module Architecture**
- 💉 Applying **Koin** for clean dependency injection
- 📱 Adapting layouts for different screen sizes using **Material 3 Navigation**
- 📈 Visualizing time-series data with **line charts**

---

## 🧠 API Reference

This app integrates data from:  
👉 [CoinCap Pro API](https://pro.coincap.io/api-docs)

---

## 📄 License

This project is part of coursework and is intended for learning purposes.
