package song

fun main(array: Array<String>) {
    val songOne = Song("The Mesopotamians", "They might be giants")
    val songTwo = Song("Going Undergrount", "The Jam")
    val songTree = Song("Make Me Smile", "Steve Harley")
    val songFour = Song("The Athen's Live", "Archive")
    val songFive = Song("The Bohemian Rapsody", "Queen")

    songFive.play()
    songFive.stop()
}