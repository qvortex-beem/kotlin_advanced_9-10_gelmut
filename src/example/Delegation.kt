package example
import kotlin.properties.Delegates

interface Base {
    fun someFun()
}
class BaseImpl() : Base {
    override  fun someFun() {}
}
class Derived(someBase: Base) : Base by someBase

interface Messenger{
    fun sendTextMessage()
    fun sendVideoMessage()
}

class InstantMessenger(val programName: String) : Messenger{
    override fun sendTextMessage() = println("Send text message")
    override fun sendVideoMessage() = println("Send video message")
}

interface PhotoDevice{
    fun takePhoto()
}

class PhotoCamera: PhotoDevice{
    override fun takePhoto() = println("Take a photo")
}

class SmartPhone(val name: String, m: Messenger, p: PhotoDevice) : Messenger by m, PhotoDevice by p {
    override fun sendTextMessage() = println("Send sms")
    override fun sendVideoMessage() = println("Send video message")
}

var counter: Int by Delegates.observable(0) {
    _, old, new -> println("Счетчик изменился: $old -> $new")
}

fun main() {
//    val max = InstantMessenger("MAX")
//    val photoCamera = PhotoCamera()
//    val yotaPhone = SmartPhone("YotaPhone", max, photoCamera)
//    yotaPhone.sendTextMessage()
//    yotaPhone.sendVideoMessage()
//    yotaPhone.takePhoto()
    counter = 1
    counter = 5
}