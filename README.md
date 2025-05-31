# 🎉 ChronoButtonLibrary

**ChronoButtonLibrary** is a lightweight custom Android view written in Kotlin that provides a **colorful countdown button** followed by a festive custom  message:  
**🎉 Happy Birthday!**

Perfect for creating engaging and playful user experiences in your apps.
---

## ✨ Features

- ⏱️ Animated countdown (3, 2, 1)
- 🌈 Dynamic background color changes
- ✅ End animation with scale effect
- 🎂 Final message: `🎉 Happy Birthday!`
- 🚫 Button is disabled during countdown
- 🔧 Easily customizable (duration, colors, final text)

---

## 🚀 Installation

1. **Clone or copy** the `mylibrary` module into your Android project:

```bash
git clone https://github.com/your-username/loadingbutton.git

In your settings.gradle:
include ':mylibrary'

In your app/build.gradle:
implementation project(":mylibrary")

🛠️ Usage
1. In your layout XML (activity_main.xml):
<com.example.mylibrary.LoadingButton
    android:id="@+id/loadingButton"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Send" />

2. In your activity (MainActivity.kt):

val loadingButton = findViewById<LoadingButton>(R.id.loadingButton)
loadingButton.setOnClickListener {
    loadingButton.showCountdown(3) // Starts a 3-second countdown
}
📁 Project Structure
📦 mylibrary
 ┣ 📄 LoadingButton.kt         ← Main custom view
 ┣ 📄 loading_button.xml       ← Internal layout for the button
 ┣ 📄 colors.xml               ← Predefined colors
 ┣ 📄 round_shape.xml          ← Optional default shape
📦 app
 ┣ 📄 MainActivity.kt          ← Sample usage
 ┣ 📄 activity_main.xml        ← Demo UI

⚙️ Customization
Countdown time	    showCountdown(5)
Backgrounds         Edit the colors array in LoadingButton.kt
Final message	      Replace button.text = "🎉 Happy Birthday!"

✅ Compatibility
Language: Kotlin
Min SDK: 21 (Lollipop)
No external dependencies

🔮 Upcoming Features
 Custom final text
 onCountdownFinished callback
 Animated gradient background



