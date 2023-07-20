package convolution;

import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;

public class Convolution {

    public static BufferedImage convolution(BufferedImage image, Filter filter) {
        if(image == null) throw new IllegalArgumentException("Image is null");
        if(filter == null) throw new IllegalArgumentException("Filter is null");

        ConvolveOp convolveop = new ConvolveOp(filter.getKernel(), ConvolveOp.EDGE_NO_OP, null);
        return convolveop.filter(image, null);
    }
}