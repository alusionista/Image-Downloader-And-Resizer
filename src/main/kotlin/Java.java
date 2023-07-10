import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Java {
    public static void main(String[] args) {
        String imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/1.png";
        String destinationPath = "image.png";

        int width = 800;
        int height = 600;

        downloadAndResizeImage(imageUrl, destinationPath, width, height);
    }

    public static void downloadAndResizeImage(String imageUrl, String destinationPath, int width, int height) {
        try {
            URL url = new URL(imageUrl);
            BufferedImage image = ImageIO.read(url);

            BufferedImage resizedImage = resizeImage(image, width, height);

            File output = new File(destinationPath);
            ImageIO.write(resizedImage, "jpg", output);

            System.out.println("Imagem baixada e redimensionada com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static BufferedImage resizeImage(BufferedImage image, int width, int height) {
        BufferedImage resizedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = resizedImage.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);

        g2d.drawImage(image, 0, 0, width, height, null);
        g2d.dispose();

        return resizedImage;
    }
}
