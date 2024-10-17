package lk.ijse.util;

import lk.ijse.dto.CustomerDto;
import lk.ijse.dto.ItemDto;
import lk.ijse.entity.CustomerEntity;
import lk.ijse.entity.ItemEntity;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Mapping {
    @Autowired
    private ModelMapper modelMapper;

    //Customer matters mapping
    public CustomerEntity convertToCustomerEntity(CustomerDto customerDTO) {return modelMapper.map(customerDTO, CustomerEntity.class);}
    public CustomerDto convertToCustomerDTO(CustomerEntity customerEntity) {return modelMapper.map(customerEntity, CustomerDTO.class);}
    public List<CustomerDto> convertCustomerToDTOList(List<CustomerEntity> customerEntities) {
        return modelMapper.map(customerEntities, new TypeToken<List<CustomerDto>>() {}.getType());
    }

    //Item matters mapping
    public ItemEntity convertToItemEntity(ItemDto itemDTO) {return modelMapper.map(itemDTO, ItemEntity.class);}
    public ItemDto convertToItemDTO(ItemEntity itemEntity) {return modelMapper.map(itemEntity, ItemDto.class);}
    public List<ItemDto> convertItemToDTOList(List<ItemEntity> itemEntities) {
        return modelMapper.map(itemEntities, new TypeToken<List<ItemDto>>() {}.getType());
    }

    public <T> T convertToEntity(Object dto, Class<T> entityClass) {
        return modelMapper.map(dto, entityClass);
    }

    public <T> T convertToDTO(Object entity, Class<T> dtoClass) {
        return modelMapper.map(entity, dtoClass);
    }

    public <T> List<T> convertToDTOList(Object entityList) {
        return modelMapper.map(entityList, new TypeToken<List<T>>() {
        }.getType());
    }
}
