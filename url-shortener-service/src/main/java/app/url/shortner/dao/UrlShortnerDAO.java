package app.url.shortner.dao;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import app.url.shortner.domain.Url;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

/**
 * DAO para acesso ao repositório de {@link Url}.
 * 
 * Especificações utilizadas:
 * - CDI para a anotação de {@link ApplicationScoped}.
 * - JPA, Hibernate e Panache através da implementação de {@link PanacheRepository}.
 * 
 * Essa é uma implementação de Hibernate para acesso à base de dados, com o uso do Panache para facilitar ainda mais as
 * consultas.
 * 
 * É possível fazer a classe {@link Fruta} herdar de {@link PanacheEntity} ao invés de usar o padrão de DAO, mas há um custo na
 * criação de testes unitários ao usar esse padrão. Veja essa disussão aqui:
 * https://groups.google.com/forum/m/#!topic/quarkus-dev/L2cvEp9C9L8
 * 
 * @author rinaldodev
 *
 */
@ApplicationScoped
public class UrlShortnerDAO implements PanacheRepository<Url> {

    public Url findByHash(String urlHash) {
        return new Url();
    }

    public Url saveUrl(String urlHash) {
        return new Url();
    }
}
