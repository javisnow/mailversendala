package de.aikiit.mailversendala.template;

import com.google.common.base.Charsets;
import com.google.common.io.CharStreams;
import lombok.Data;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Paths;
import java.util.Map;

@Data
public class FileMailTemplate implements MailTemplate {
    private String html;
    private String plaintext;

    public FileMailTemplate(InputStream html, InputStream plaintext, Map<String,String> parameters) throws IOException {
        // TODO 		try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))) { in a separate class
        this.html = CharStreams.toString(new InputStreamReader(html, Charsets.UTF_8));
        this.plaintext = CharStreams.toString(new InputStreamReader(plaintext, Charsets.UTF_8));
    }


    /*
    public FileMailTemplate(File basePath, Map<String, String> parameters) {
        Paths.get(new File(basePath, MailTemplate.BASE_NAME_PLAINTEXT));
        Paths.get(new File(basePath, MailTemplate.BASE_NAME_HTML));
    }
*/
    @Override
    public String getHtml() {
        return html;
    }

    @Override
    public String getPlaintext() {
        return plaintext;
    }
}
