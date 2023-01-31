package app.url.shortner.dto.mapper;

import java.util.List;

import javax.ws.rs.client.Entity;
import org.mapstruct.Mapper;
import app.url.shortner.domain.Url;


/**
 * Exemplo de Mapper de {@link Entity} para DTO.
 * 
 * Especificações utilizadas:
 * - MapStruct através da anotação {@link Mapper}.
 * 
 * Essa classe utiliza o MapStruct para facilitar o mapeamento de atributos entre classes Java. Nesse caso, entre {@link Url}
 * e {@link UrlDTO}.
 * 
 * A classe pode ser injetada pelo CDI onde for utilizada, por conta do componentModel = "cdi".
 * 
 * @author rinaldodev
 *
 */
@Mapper(componentModel = "cdi")
public interface UrlMapper {

    UrlDTO toResource(Url url);

    List<UrlDTO> toResourceList(List<Url> urls);

}
