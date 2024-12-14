🏛️ Landmark Turizm Uygulaması

🌍 Proje Açıklaması

Bu Android uygulaması, farklı ülkelerden önemli turistik yerlerin (landmark) listesini görüntüleyen bir mobil uygulamadır. Uygulama, RecyclerView kullanarak landmark'ları listeler ve her bir landmark hakkında detaylı bilgi görüntüleme özelliği sağlar.

✨ Özellikler

🗺️Landmark listesini görüntüleme

🔍Landmark detaylarını görüntüleme

📱RecyclerView ile dinamik liste oluşturma

👆Tıklanabilir landmark kartları

🌐Seçilen landmark bilgisini Singleton ile aktarma


🛠️ Kullanılan Teknolojiler

-Kotlin

-Android Jetpack

-View Binding

-RecyclerView

-Intent

-Singleton Pattern


📦 Gereksinimler

🖥️ Android Studio

📱 Minimum SDK Seviyesi: Android 6.0+

🧩 Kotlin eklentisi

🚀 Kurulum

📂 Projeyi klonlayın

🔧 Android Studio'da açın

📦 Bağımlılıkları indirin

▶️ Uygulamayı çalıştırın


Adapter Yapısı

-LandmarkAdapter: RecyclerView için özel adapter sınıfı

-LandmarkHolder: View binding için view holder sınıfı

-Dinamik olarak landmark listesini görüntüler

-Her bir landmark için tıklama olayı tanımlar


Uygulama Akışı

-Ana ekranda landmark listesi RecyclerView ile görüntülenir

-Bir landmark kartına tıklandığında detay ekranına geçilir

-Seçilen landmark bilgisi MySingleton ile aktarılır


🗺️ Mevcut Landmark'lar

🇮🇹 Pisa Kulesi (İtalya)

🇮🇹 Kolezyum (İtalya)

🇫🇷 Eyfel Kulesi (Fransa)

🇬🇧 London Bridge (Birleşik Krallık)

🔧 Teknik Detaylar

🧩 Singleton Pattern ile optimize veri aktarımı

📦 RecyclerView.Adapter kullanımı

🔒 View Binding ile güvenli görünüm yönetimi
