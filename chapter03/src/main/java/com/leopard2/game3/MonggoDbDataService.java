package com.leopard2.game3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MonggoDbDataService implements DataService {

    @Override
    public int[] retrieveData() {
        return new int[] { 11, 22, 33, 44, 55 };
    }
    
}
