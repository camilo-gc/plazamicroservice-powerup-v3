package com.pragma.powerup.plazamicroservice.domain.spi;

import com.pragma.powerup.plazamicroservice.adapters.driving.http.dto.response.UserResponseDto;


public interface IUserApiPersistencePort {

    UserResponseDto findOwnerById(Long id, String authorizationHeader);

}
