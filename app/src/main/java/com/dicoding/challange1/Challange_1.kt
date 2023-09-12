abstract class Shape(val rows: Int) {
    abstract fun draw()
}

class Pyramid(rows: Int) : Shape(rows) {
    override fun draw() {
        val colors = arrayOf("\u001B[32m", "\u001B[33m", "\u001B[34m", "\u001B[35m", "\u001B[36m")
        var colorIndex = 0

        for (i in 1..rows) {
            for (j in 1..rows - i) {
                print("  ")
            }
            for (j in 1..2 * i - 1) {
                if (j == 1 || j == 2 * i - 1 || i == rows || i == 1) {
                    print("\u001B[31m* \u001B[0m") // Warna merah untuk tepi
                } else {
                    print("${colors[colorIndex]}* \u001B[0m") // Warna dari array colors untuk bagian dalam
                    colorIndex = (colorIndex + 1) % colors.size // Ganti warna
                }
            }
            println()
        }
    }
}

class InvertedPyramid(rows: Int) : Shape(rows) {
    override fun draw() {
        val colors = arrayOf("\u001B[32m", "\u001B[33m", "\u001B[34m", "\u001B[35m", "\u001B[36m")
        var colorIndex = 0

        for (i in rows downTo 1) {
            for (j in 1..rows - i) {
                print("  ")
            }
            for (j in 1..2 * i - 1) {
                if (j == 1 || j == 2 * i - 1 || i == rows || i == 1) {
                    print("\u001B[31m* \u001B[0m") // Warna merah untuk tepi
                } else {
                    print("${colors[colorIndex]}* \u001B[0m") // Warna dari array colors untuk bagian dalam
                    colorIndex = (colorIndex + 1) % colors.size // Ganti warna
                }
            }
            println()
        }
    }
}

class Diamond(rows: Int) : Shape(rows) {
    override fun draw() {
        val colors = arrayOf("\u001B[32m", "\u001B[33m", "\u001B[34m", "\u001B[35m", "\u001B[36m")
        var colorIndex = 0

        for (i in 1..(rows + 1) / 2) {
            for (j in 1..(rows + 1) / 2 - i) {
                print("  ")
            }
            for (j in 1..2 * i - 1) {
                if (j == 1 || j == 2 * i - 1 || i == (rows + 1) / 2 || i == 1) {
                    print("\u001B[31m* \u001B[0m") // Warna merah untuk tepi
                } else {
                    print("${colors[colorIndex]}* \u001B[0m") // Warna dari array colors untuk bagian dalam
                    colorIndex = (colorIndex + 1) % colors.size // Ganti warna
                }
            }
            println()
        }

        for (i in (rows - 1) / 2 downTo 1) {
            for (j in 1..(rows + 1) / 2 - i) {
                print("  ")
            }
            for (j in 1..2 * i - 1) {
                if (j == 1 || j == 2 * i - 1 || i == 1) {
                    print("\u001B[31m* \u001B[0m") // Warna merah untuk tepi
                } else {
                    print("${colors[colorIndex]}* \u001B[0m") // Warna dari array colors untuk bagian dalam
                    colorIndex = (colorIndex + 1) % colors.size // Ganti warna
                }
            }
            println()
        }
    }
}

class X(rows: Int) : Shape(rows) {
    override fun draw() {
        val colors = arrayOf("\u001B[32m", "\u001B[33m", "\u001B[34m", "\u001B[35m", "\u001B[36m")
        var colorIndex = 0

        for (i in 1..rows) {
            for (j in 1..rows) {
                if (j == i || j == rows - i + 1) {
                    print("${colors[colorIndex]}* \u001B[0m") // Warna dari array colors untuk gambar X
                    colorIndex = (colorIndex + 1) % colors.size // Ganti warna
                } else {
                    print("  ")
                }
            }
            println()
        }
    }
}

class HollowRedPyramid(rows: Int) : Shape(rows) {
    override fun draw() {
        for (i in 1..rows) {
            for (j in 1..rows - i) {
                print("  ")
            }
            for (j in 1..2 * i - 1) {
                if (j == 1 || j == 2 * i - 1 || i == rows) {
                    print("\u001B[31m* \u001B[0m") // Warna merah untuk tepi
                } else {
                    print("  ") // Hilangkan bagian dalam
                }
            }
            println()
        }
    }
}

fun main() {
    val starRows = 8
    val diamondRows = 15
    val xRows = 15
    val hollowStarRows = 6

    val pyramid = Pyramid(starRows)
    val invertedPyramid = InvertedPyramid(starRows)
    val diamond = Diamond(diamondRows)
    val x = X(xRows)
    val hollowPyramid = HollowRedPyramid(hollowStarRows)

    println("Piramida Bintang:")
    pyramid.draw()

    println("\nPiramida Terbalik Bintang:")
    invertedPyramid.draw()

    println("\nLayang-Layang Bintang:")
    diamond.draw()

    println("\nX Bintang:")
    x.draw()

    println("\nPiramida Hollow Bintang (Merah):")
    hollowPyramid.draw()

    // Informasi Pembuat
    println("\nNama Pembuat: Ilham Ramadhan")
    println("Kelas: Android Engineering 2")
    println("Notes: Dibuat dengan bantuan AI (ChatGPT)")
}
