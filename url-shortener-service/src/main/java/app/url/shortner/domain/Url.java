package app.url.shortner.domain;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Url {
    int id;

    String baseurl;
    String shortUrl;

    public Url() {
    }
    public Url(String baseUrl) throws NoSuchAlgorithmException {
        this.baseurl = baseUrl;
        //TODO move to a uuid implementation, using base 64
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(baseUrl.getBytes(StandardCharsets.UTF_8));
        this.shortUrl = new String(Base64.getEncoder().encode(hash));
    }


    public String getBaseurl() {
        return baseurl;
    }

    public void setBaseurl(String baseurl) {
        this.baseurl = baseurl;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }
}