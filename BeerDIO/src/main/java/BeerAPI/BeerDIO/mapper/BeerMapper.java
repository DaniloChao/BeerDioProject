package BeerAPI.BeerDIO.mapper;

import BeerAPI.BeerDIO.dto.BeerDTO;
import BeerAPI.BeerDIO.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}