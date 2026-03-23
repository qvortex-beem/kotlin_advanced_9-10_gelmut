package example

interface Movable{
    var speed: Int
    val model: String
    val number: String
    fun move()
    fun stop() {
        println("Останавливаемся...")
    }
}
class Car(
    override val model : String,
    override val number : String
) : Movable{
    override var speed = 60
    override fun move() {
        println("Едем на машине со скоростью $speed км/ч")
    }
}
class Aircraft(
    override val model : String,
    override val number : String
) : Movable {
    override var speed = 600
    override fun move() {
        println("Летим на самолете со скоростью $speed км/ч")
    }
    override fun stop() = println("Приземляемся...")
}
fun travel(obj: Movable) = obj.move()

interface VideoPlayable {
    fun play() = println("play video")
}
interface  AudioPlayable {
    fun play() = println("play audio")
}
class MediaPlayer : VideoPlayable, AudioPlayable {
    override fun play() {
        println("Start playing")
        super<VideoPlayable>.play()
        super<AudioPlayable>.play()
    }
}

fun main() {
//    val car = example.Car("LADA", "134LAD")
//    val aircraft = example.Aircraft("Boeing", "737")
//    example.travel(car)
//    example.travel(aircraft)
//    aircraft.move()
//    aircraft.stop()

    val player = MediaPlayer()
    player.play()
}

