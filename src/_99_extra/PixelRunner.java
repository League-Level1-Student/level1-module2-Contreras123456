package _99_extra;

public class PixelRunner {

	public static void main(String[] args) {
		PixelParty pixelparty = new PixelParty();
		pixelparty.setColor(0, 0, 0);
		pixelparty.drawRectangle(10, 10, 50, 50);
		pixelparty.drawCircle(100, 500, 1000);
		pixelparty.drawTriangle(500, 100, 150, 500, 350, 350);
		pixelparty.saveImage();
		pixelparty.displayImage();
	}
}
