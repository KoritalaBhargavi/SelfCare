# 🌿 SelfCare Recommendation Console Application (Java)

A **console-based Java application** that empowers users to take care of their **body, skin, hair, and gut** through personalized recommendations, home remedies, and healthy food suggestions.

---

## ✨ Features

- 🔐 **User Registration and Login**  
  Secure authentication with username-password validation and uniqueness checks.

- 📒 **Self-Care Sections**  
  Choose from:
  - **Skincare**
  - **Haircare**
  - **Bodycare**
  - **Gutcare**

- 🍲 **Recommendations**  
  Based on user selection, get helpful remedies and food suggestions instantly.

- 📜 **Activity Log**  
  All your selections and recommendations are saved and can be viewed anytime.

- 🧹 **Clear Log**  
  Option to clear your entire activity log if desired.

---

## 📁 Project Structure

```
SelfCareApp/
├── Main.java
├── SkincareArea.java
├── HaircareArea.java
├── BodycareArea.java
├── GutcareArea.java
├── SelfCareCategory.java   # Interface
├── AuthManager.java
├── log.txt
├── users.txt
```

---

## 🛠️ How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/SelfCareApp.git
   cd SelfCareApp
   ```

2. Compile the files:
   ```bash
   javac *.java
   ```

3. Run the application:
   ```bash
   java Main
   ```

---

## 💡 Example Use Case

1. Register/Login  
2. Choose category → Skincare  
3. Select issue → Acne  
4. App returns:
   - ✅ Remedies: Aloe Vera, Tea Tree Oil  
   - 🍽️ Foods: Leafy greens, Zinc-rich foods  
5. View your activity log  
6. Clear logs if needed  
7. Exit the app

---

## 🔐 Security

- Validates username uniqueness
- Password required for login
- Ensures meaningful user interaction
- Invalid inputs are handled with proper prompts

---

## ❤️ Why This Project?

> “Caring for yourself isn’t self-indulgence, it’s self-preservation.”  
This project focuses on **self-care awareness** and encourages users to explore simple, home-based health tips in a tech-driven way.

---

## 📞 Contact

For feedback, contact [Koritala Bhargavi](mailto:koritalabhargavi5@gamil.com)  
Or visit my [GitHub Profile](https://github.com/KoritalaBhargavi).

---

## 📌 License

This project is open-source and available under the [MIT License](LICENSE).
