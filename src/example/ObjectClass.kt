package example

object GameSession {
    init {
        println("Игровая сессия создана")
    }
    var isActive: Boolean = false
    fun start() {
        isActive = true
        println("Игра началась")
    }
    fun end() {
        isActive = false
        println("Игра завершена")
    }
}

object Logger {
    var count = 0

    fun log(message: String) {
        count++
        println("[$count] $message")
    }
}

object AppSettings {
    val version = "1.0.0"
    var isDarkMode = true

    fun toogleTheme() {
        isDarkMode = !isDarkMode
    }
    fun checkTheme() {
        if (AppSettings.isDarkMode) {
            println("Темная тема включена")
        }
    }
}
object Colors {
    const val RED = "#FF0000"
    const val GREEN = "#00FF00"
    const val BLUE = "#0000FF"
}

class MyCar(val model: String) {
    fun drive() = println("$model едет")
}
object TrafficController {
    var carCount = 0
    fun carPassed() {
        carCount++
    }
}

fun main() {
//    println("программа запущена")
//    println("проверяем состояние, но не трогаем GameSession")
//    println("Теперь запускаем игру")
//    GameSession.start()
//    println("Проверяем состояние еще раз")
//    println("Активна ли сессия: ${GameSession.isActive}")
//
//    Logger.log("первое сообщение")
//    Logger.log("Второе сообщение")
//    val logger1 = Logger
//    val logger2 = Logger
//    println(logger1 === logger2)

//    val handler = object {
//        val name = "обработчик"
//        fun handle() {
//            println("обрабатываю....")
//        }
//    }
//    println(handler.name)
//    handler.handle()

//    MyCar("Toyota")
//    MyCar("BMW")
//    TrafficController.carPassed()
}