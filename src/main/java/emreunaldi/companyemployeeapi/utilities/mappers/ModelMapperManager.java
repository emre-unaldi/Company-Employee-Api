package emreunaldi.companyemployeeapi.utilities.mappers;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelMapperManager implements ModelMapperService{
    private ModelMapper _modelMapper;

    @Autowired
    public ModelMapperManager(ModelMapper _modelMapper) {
        this._modelMapper = _modelMapper;
    }

    @Override
    public ModelMapper forRequest() {
        this._modelMapper.getConfiguration()
                .setAmbiguityIgnored(true)
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        return _modelMapper;
    }

    @Override
    public ModelMapper forResponse() {
        this._modelMapper.getConfiguration()
                .setAmbiguityIgnored(true)
                .setMatchingStrategy(MatchingStrategies.STANDARD);
        return _modelMapper;
    }
}
