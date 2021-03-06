package com.john;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class BufferedImageLoader {

    private BufferedImage image;

    //načítá obrázek z určité cesty - image, path
    public BufferedImage loadImage(String path) throws IOException {
        image = ImageIO.read(getClass().getResource(path));
        return image;
    }

}
