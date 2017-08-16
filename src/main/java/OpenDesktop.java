import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
public class OpenDesktop {

	public static void main(String[] args) throws IOException, URISyntaxException {
		Desktop d = Desktop.getDesktop();
		d.browse(new URI("http://www.bing.com"));
		d.isDesktopSupported();

	}

}
