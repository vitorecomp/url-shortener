package app.url.shortner.rest;

import app.url.shortner.domain.Url;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.security.NoSuchAlgorithmException;

@Path("/url-shortner")
public class UrlShortnerResource {

    @GET
    @Path("/{urlHash}")
    public Url getUrl(String urlHash) {
        return new Url();
    }

    @POST
    public Url createShortUrl(Url url) throws NoSuchAlgorithmException {
        return new Url(url.getBaseurl());
    }
}