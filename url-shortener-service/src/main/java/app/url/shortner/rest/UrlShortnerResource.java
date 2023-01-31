package app.url.shortner.rest;

import java.security.NoSuchAlgorithmException;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.slf4j.Logger;

import app.url.shortner.config.UrlShortnerConfig;
import app.url.shortner.dao.UrlShortnerDAO;
import app.url.shortner.domain.Url;
import app.url.shortner.dto.mapper.UrlMapper;

@Path("/url-shortner")
public class UrlShortnerResource {

    private final Logger logger;
    private final UrlShortnerDAO urlShortnerDAO;
    private final UrlMapper urlMapper;
    private final UrlShortnerConfig urlShortnerConfig;

    @Inject
    public UrlShortnerResource(
            UrlShortnerDAO urlShortnerDAO,
            Logger logger,
            UrlShortnerConfig urlShortnerConfig,
            UrlMapper urlMapper) {
        this.logger = logger;
        this.urlShortnerDAO = urlShortnerDAO;
        this.urlShortnerConfig = urlShortnerConfig;
        this.urlMapper = urlMapper;
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