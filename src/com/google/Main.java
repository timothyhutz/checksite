package com.google;

import com.amazon.amazoncall;
import org.symphonyoss.symphony.jcurl.JCurl;
import java.io.IOException;
import java.security.cert.CertificateParsingException;

public class Main {
    public static String amazon_url = amazoncall.base_url;

    public static void main(String[] args) throws IOException, CertificateParsingException {
        String base_url = "https://google.com/";
        JCurl call_google = JCurl.builder()
                .build();
        JCurl.Response response = call_google.processResponse(call_google.connect(base_url));
        Integer amazon_return = new amazoncall().call();
        System.out.println(base_url + "\t" + response.getResponseCode());
        System.out.println(amazon_url + "\t" + amazon_return);
    }
}
