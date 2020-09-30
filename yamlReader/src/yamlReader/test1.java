package yamlReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Pattern;

public class test1 {

	public final static Pattern yamlSymbol = Pattern.compile("[E28090]");

	public void read() throws IOException {
		// Java 8以降
		// ファイルのエンコーディングを指定する場合

		//

		File file2 = new File("./src/config/ActionDefinitionConfig.yaml");
		//Path file = Paths.get(file2.getAbsolutePath());
		Path file = Paths.get("./src/config/ActionDefinitionConfig.yaml");
		try (BufferedReader br = Files.newBufferedReader(file, Charset.forName("MS932"))) {
		 String text;
		 while ((text = br.readLine()) != null) {
		 System.out.println(text);
		 }
		}
	}

}
