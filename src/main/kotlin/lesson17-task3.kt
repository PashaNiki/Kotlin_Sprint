package org.example

private const val SECRET_FOLDER_FILE_COUNT = 15
private const val NORMAL_FOLDER_FILE_COUNT = 25

class Folder(private val foldername: String, private val fileCount: Int, private val isSecret: Boolean) {

    val name: String
        get() = if (isSecret) "Скрытая папка" else foldername

    val files: Int
        get() = if (isSecret) 0 else fileCount
}

    fun main() {

        val secretFolder = Folder("Docs", SECRET_FOLDER_FILE_COUNT, true )

        println("Имя папки: ${secretFolder.name}")
        println("Количество файлов: ${secretFolder.files}")

        val normalFolder = Folder("Общая папка", NORMAL_FOLDER_FILE_COUNT, false)

        println("Имя папки: ${normalFolder.name}")
        println("Количество файлов: ${normalFolder.files}")
    }