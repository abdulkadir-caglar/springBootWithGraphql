package com.caglar.springbootgraphql.api;

import com.caglar.springbootgraphql.model.Vehicle;
import com.caglar.springbootgraphql.repo.VehicleRepository;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class VehicleMutationResolver implements GraphQLMutationResolver {

    private final VehicleRepository vehicleRepository;

    public List<Vehicle> findVehiclesByType(String type){
        return vehicleRepository.getByTypeLike(type);
    }

    public Optional<Vehicle> findById(Long id){
        return vehicleRepository.findById(id);
    }
}
