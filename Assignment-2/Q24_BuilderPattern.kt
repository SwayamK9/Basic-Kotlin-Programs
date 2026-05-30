import java.io.File

fun buildFile(filename: String): File {
    return File(filename)
        .apply { setWritable(true) }
        .also { println("File $filename created") }
}

fun main() {
    val file = buildFile("notes.txt")
    println(file.name)
}
