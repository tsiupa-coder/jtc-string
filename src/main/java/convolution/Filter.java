package convolution;

import java.awt.image.Kernel;

public enum Filter {

    EDGE_DETECTION(new float[]{0, 1, 0, 1, -4, 1, 0, 1, 0}),
    SMOOTHING(new float[]{0, -1, 0, -1, 5, -1, 0, -1, 0}),
    GAUSSIAN_BLUE(new float[]{1, 2, 1, 2, 4, 2, 1, 2, 1}),
    HIGH_PASS(new float[]{1, 0, -1, 0, 0, 0, -1, 0, 1}),
    LOW_PASS(new float[]{1, 1, 1, 1, 1, 1, 1, 1, 1}),
    BILATERAL_FILTER(new float[]{0.05f, 0.09f, 0.05f, 0.09f, 0.15f, 0.09f, 0.05f, 0.09f, 0.05f});
    private float[] data;

    Filter(float[] data) {
        this.data = data;
    }

    public Kernel getKernel() {
        return new Kernel(3, 3, this.data);
    }
}