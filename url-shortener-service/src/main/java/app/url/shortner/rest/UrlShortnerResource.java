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

    private final Logger logger;
    private final UrlShortenerDAO urlShortenerDAO;
    private final UrlShortenerMapper urlShortenerMapper;
    private final UrlShortenerConfig urlShortenerConfig;

    @Inject
    public UrlShortnerResource(
            UrlShortenerDAO urlShortenerDAO,
            Logger logger,
            UrlShortenerConfig urlShortenerConfig,
            UrlShortenerMapper urlShortenerMapper) {
        this.logger = logger;
        this.urlShortenerDAO = urlShortenerDAO;
        this.urlShortenerConfig = urlShortenerConfig;
        this.urlShortenerMapper = urlShortenerMapper;
    }

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