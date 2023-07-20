package convolution;

import org.junit.jupiter.api.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ConvolutionTest {

    @Test
    void convolution() throws IOException {

        File file = new File("src/test/resources/image.jpg");
        BufferedImage image = ImageIO.read(file);

        BufferedImage edgeDetection = Convolution.convolution(image, Filter.EDGE_DETECTION);
        ImageIO.write(edgeDetection, "jpg", new File("src/test/resources/edgeDetection.jpg"));

        BufferedImage smoothing = Convolution.convolution(image, Filter.SMOOTHING);
        ImageIO.write(smoothing, "jpg", new File("src/test/resources/smoothing.jpg"));


        BufferedImage gaussianBlue = Convolution.convolution(image, Filter.GAUSSIAN_BLUE);
        ImageIO.write(gaussianBlue, "jpg", new File("src/test/resources/gaussianBlue.jpg"));


        BufferedImage highPass = Convolution.convolution(image, Filter.HIGH_PASS);
        ImageIO.write(highPass, "jpg", new File("src/test/resources/highPass.jpg"));


        BufferedImage lowPass = Convolution.convolution(image, Filter.LOW_PASS);
        ImageIO.write(lowPass, "jpg", new File("src/test/resources/lowPass.jpg"));

        BufferedImage bilateral = Convolution.convolution(image, Filter.BILATERAL_FILTER);
        ImageIO.write(bilateral, "jpg", new File("src/test/resources/bilateral.jpg"));

    }
}