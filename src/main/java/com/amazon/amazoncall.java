package com.amazon;

import org.symphonyoss.symphony.jcurl.JCurl;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.security.cert.CertificateParsingException;

public class amazoncall {
    public static String base_url = "https://www.amazon.com/";
    public static Integer call() throws IOException, CertificateParsingException {

        JCurl jcurl = JCurl.builder().build();
        HttpURLConnection connection = jcurl.connect(base_url);
        JCurl.Response response = jcurl.processResponse(connection);
        return response.getResponseCode();
    }

}
