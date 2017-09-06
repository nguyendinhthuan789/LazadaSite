package Page_Utility;

import java.io.InputStream;

public class ReadFile {
	public static InputStream accessFile() {
        String resource = "text.txt";

        // this is the path within the jar file
        InputStream input = ReadFile.class.getResourceAsStream("/resources/" + resource);
        if (input == null) {
            // this is how we load file within editor (eg eclipse)
            input = ReadFile.class.getClassLoader().getResourceAsStream(resource);
        }

        return input;
    }
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		ReadFile input=new ReadFile();
		input.accessFile();
	}
}
