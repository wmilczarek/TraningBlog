package com.wmilczarek.services;

import com.wmilczarek.entity.ShoutEntity;
import com.wmilczarek.model.ShoutDisplayDto;
import com.wmilczarek.model.ShoutDto;
import com.wmilczarek.repository.ShoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.jsolve.oven.annotationdriven.AnnotationDrivenMapper;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Service
public class ShoutService {

    @Autowired
    ShoutRepository shoutRepository;

    public List<ShoutDto> getShouts() {

        List<ShoutDto> shoutDtoList = new ArrayList<ShoutDto>();

        for (ShoutEntity shoutEntity : shoutRepository.findAllActive()) {
            ShoutDto shoutDto = AnnotationDrivenMapper.map(shoutEntity, ShoutDto.class);
            shoutDtoList.add(shoutDto);
        }

        return shoutDtoList;
    }

    public List<ShoutDisplayDto> getShoutsForUserDisplay() {

        List<ShoutDisplayDto> shoutDisplayDtoList = new ArrayList<ShoutDisplayDto>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        for (ShoutEntity shoutEntity : shoutRepository.findAllActive()) {

            ShoutDisplayDto shoutDto = new ShoutDisplayDto(
                    shoutEntity.getUserEntity() != null ? shoutEntity.getUserEntity().getLogin() : "Guest",
                    shoutEntity.getDateTime().format(formatter),
                    shoutEntity.getShoutComment());
            shoutDisplayDtoList.add(shoutDto);
        }

        return shoutDisplayDtoList;
    }

    public void saveShout(ShoutDto shoutDto) {

        ShoutEntity shoutEntity = AnnotationDrivenMapper.map(shoutDto, ShoutEntity.class);
        shoutRepository.save(shoutEntity);
    }

}
