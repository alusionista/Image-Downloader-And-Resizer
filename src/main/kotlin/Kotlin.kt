import java.io.File
import java.net.URL
import javax.imageio.ImageIO
import java.awt.image.BufferedImage

fun main() {
    val imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/25.png"
    val destinationPath = "image.png"

    val width = 800
    val height = 600

    downloadAndResizeImage(imageUrl, destinationPath, width, height)
}

fun downloadAndResizeImage(imageUrl: String, destinationPath: String, width: Int, height: Int) {
    val url = URL(imageUrl)
    val image = ImageIO.read(url)

    val resizedImage = resizeImage(image, width, height)

    val output = File(destinationPath)
    ImageIO.write(resizedImage, "png", output)

    println("Imagem baixada e redimensionada com sucesso!")
}

fun resizeImage(image: BufferedImage, width: Int, height: Int): BufferedImage {
    val resizedImage = BufferedImage(width, height, BufferedImage.TYPE_INT_RGB)
    val g2d = resizedImage.createGraphics()

    g2d.drawImage(image, 0, 0, width, height, null)
    g2d.dispose()

    return resizedImage
}
